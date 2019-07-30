package kr.green.spring.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.pagination.PageMaker;
import kr.green.spring.service.BoardService;
import kr.green.spring.service.MemberService;
import kr.green.spring.service.PageMakerService;
import kr.green.spring.utils.UploadFileUtils;
import kr.green.spring.vo.BoardVO;
import kr.green.spring.vo.MemberVO;


@Controller
@RequestMapping(value="/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	BoardService boardService;
	@Resource
	private String uploadPath;
	@Autowired
	PageMakerService pageMakerService;
	

	
	@RequestMapping(value = "/list", method=RequestMethod.GET)    
	public String boardListGet(Model model, Criteria cri){ 
		logger.info("게시판페이지 실행");
		
		//cri.setPerPageNum(2); 	//여기서 cri의 PerPage만 설정해주는 이유는, 사실 기본생성자를 통해서 자동으로 다 기본설정되지만 내가 코드 테스트를 편하게 하기위해서 일부러 2라고 설정해주었다
		ArrayList<BoardVO> boardList = boardService.getBoardList(cri);
		
		int totalCount = boardService.getTotalCount(cri);
	
		PageMaker pm = pageMakerService.getPageMaker(5,cri,totalCount);
		
		model.addAttribute("pageMaker", pm);
		model.addAttribute("list", boardList);
		
		
		return "board/list";
	} 
	
	@RequestMapping(value = "/display", method=RequestMethod.GET)    
	public String boardDisplayGet(Model model, BoardVO obj, Criteria cri){ //여기서 BoardVO obj는  기본키값 num= @@@ 을 넘긴다.
		logger.info("게시판 디스플레이페이지 실행");
		
		//조회수 증가 (display는 게시물 하나를 상세보는 페이지이기때문에 조회수를 증가시키는 일을 해줘야한다)
		boardService.updateViews(obj);
		
		BoardVO bVO = boardService.getBoard(obj);
		model.addAttribute("board", bVO);
		
		model.addAttribute("cri", cri);
		
		
		return "board/display";
	}
	
	//게시판 수정 삭제 등록 기능
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)    
	public String boardModifyGet(Model model, BoardVO obj, HttpServletRequest r ){ 
		logger.info("수정페이지 실행");
		
		System.out.println("원래 존재하는, 수정하려고 하는 게시물     "+obj);
		
		BoardVO bVO = boardService.getBoard(obj);
		model.addAttribute("board", bVO);		//일단 수정페이지에 수정하려고 하는 게시물의 정보를 가져와야 하니까 model에 담아서 화면에 띄어줌
			
		return "/board/modify";
			
		
	}
	
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)    
	public String boardModifyPost(Model model, BoardVO bVO, HttpServletRequest r, MultipartFile file2) throws IOException, Exception{ 
		logger.info("게시물 수정 실행");
		System.out.println("수정하여 업데이트 할 게시물   "+bVO);
		
		if(file2.getOriginalFilename().length() != 0) {
			String file = UploadFileUtils.uploadFile(uploadPath, file2.getOriginalFilename(),file2.getBytes());
			bVO.setFile(file);
		}else { //첨부파일에 추가한 파일이 없는 경우
			
			if(bVO.getFile().length() == 0) {
				bVO.setFile("");
			}else {
				BoardVO tmp = boardService.getBoard(bVO);
				bVO.setFile(tmp.getFile());
			}
		}

		boardService.updateBoard(bVO, r); //현재 세션에 저장되어 있는(로그인한 사람의 정보) 사람의 정보와 업데이트 하려고 하는 작성자와 같은지 확인해라
		model.addAttribute("num", bVO.getNum()); 
		return "redirect:/board/display";
	}
	
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)    
	public String boardRegisterGet(Model model){ 
		logger.info("등록페이지 실행");
		
		
		
		return "/board/register";
	}
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)    
	public String boardRegisterPost(MultipartFile file2, BoardVO bVO) throws IOException, Exception{ 
		logger.info("게시물 등록");
		System.out.println("새로 등록할 게시물   "+ bVO); 
		
		if(file2.getOriginalFilename().length() != 0) {
			
			String file = UploadFileUtils.uploadFile(uploadPath, file2.getOriginalFilename(),file2.getBytes());
			bVO.setFile(file);
		}
		boardService.insertBoard(bVO);
		
		return "redirect:/board/list";
	}
	

	@RequestMapping(value = "/delete", method = RequestMethod.GET)    
	public String deleteGet(Model model, BoardVO obj){ 
		logger.info("삭제페이지 실행");
		
		System.out.println(obj);
		BoardVO bVO = boardService.getBoard(obj); 
		if( bVO != null) {
			boardService.deleteBoard(bVO);
			
		}
		return "redirect:/board/list";
	
	}
	//---------------------------------------------------------------------29월
	
	@ResponseBody
	@RequestMapping("/download")
	public ResponseEntity<byte[]> downloadFile(String fileName)throws Exception{
	    InputStream in = null;
	    ResponseEntity<byte[]> entity = null;
	    try{
	        HttpHeaders headers = new HttpHeaders();
	        in = new FileInputStream(uploadPath+fileName);

	        fileName = fileName.substring(fileName.indexOf("_")+1);
	        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
	        headers.add("Content-Disposition",  "attachment; filename=\"" 
				+ new String(fileName.getBytes("UTF-8"), "ISO-8859-1")+"\"");
	        entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in),headers,HttpStatus.CREATED);
	    }catch(Exception e) {
	        e.printStackTrace();
	        entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
	    }finally {
	        in.close();
	    }
	    return entity;
	}
	

}
