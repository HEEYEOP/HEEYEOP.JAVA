package kr.green.spring.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import kr.green.spring.service.BoardService;
import kr.green.spring.service.MemberService;
import kr.green.spring.vo.BoardVO;
import kr.green.spring.vo.MemberVO;


@Controller
@RequestMapping(value="/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	BoardService boardService;
	

	
	@RequestMapping(value = "/list", method=RequestMethod.GET)    
	public String boardListGet(Model model){ 
		logger.info("게시판페이지 실행");
		
		ArrayList<BoardVO> boardList = boardService.getBoardList(); //DB에 있는 게시글 전부를 boardList로 받는 것. 왜냐, getBoardList()가 전부 선택해서 가져오기때문
		for(BoardVO tmp:boardList) {
			System.out.println(tmp);
		}
		model.addAttribute("list", boardList);
		
		
		return "board/list";
	} 
	
	@RequestMapping(value = "/display", method=RequestMethod.GET)    
	public String boardDisplayGet(Model model, BoardVO obj){ //여기서 BoardVO obj는  기본키값 num= @@@ 을 넘긴다.
		logger.info("게시판 디스플레이페이지 실행");
		
		//조회수 증가 (display는 게시물 하나를 상세보는 페이지이기때문에 조회수를 증가시키는 일을 해줘야한다)
		boardService.updateViews(obj);
		
		BoardVO bVO = boardService.getBoard(obj);
		model.addAttribute("board", bVO);
		
		
		return "board/display";
	}
	
	//게시판 수정 삭제 등록 기능
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)    
	public String boardModifyGet(Model model, BoardVO obj ){ 
		logger.info("수정페이지 실행");
		
		System.out.println("원래 존재하는, 수정하려고 하는 게시물     "+obj);
		BoardVO bVO = boardService.getBoard(obj);
		model.addAttribute("board", bVO);		//일단 수정페이지에 수정하려고 하는 게시물의 정보를 가져와야 하니까 model에 담아서 화면에 띄어줌
		
		
		return "/board/modify";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)    
	public String modifyPost(Model model, BoardVO bVO, HttpServletRequest r){ 
		logger.info("게시물 수정 실행");
		System.out.println("수정하여 업데이트 할 게시물   "+bVO);
		
		boardService.updateBoard(bVO, r); //현재 세션에 저장되어 있는(로그인한 사람의 정보) 사람의 정보와 업데이트 하려고 하는 작성자와 같은지 확인해라
		
		 model.addAttribute("num", bVO.getNum());
		return "redirect:/board/display";
	}
	
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)    
	public String registerGet(Model model, BoardVO obj){ 
		logger.info("등록페이지 실행");
		model.addAttribute("userID", obj.getWriter());
		
		return "/board/register";
	}
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)    
	public String registerPost(Model model, BoardVO bVO){ 
		logger.info("게시물 등록");
		System.out.println("새로 등록할 게시물   "+bVO); 
		
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
			return "redirect:/board/list";
		}
		return "/board/delete";
		
		
	
	}
	
	
	

}
