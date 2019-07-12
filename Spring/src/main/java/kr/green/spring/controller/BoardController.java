package kr.green.spring.controller;

import java.util.ArrayList;

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
		
		//조회수 증가
		boardService.updateViews(obj);
		
		
		BoardVO bVO = boardService.getBoard(obj);
		model.addAttribute("board", bVO);
		
		
		return "board/display";
	}
	
	//게시판 수정 삭제 등록 기능
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)    
	public String boardModifyGet(Model model, BoardVO obj ){ 
		logger.info("수정페이지 실행");
		
		System.out.println(obj);
		BoardVO bVO = boardService.getBoard(obj);
		model.addAttribute("board", bVO);
		
		
		return "/board/modify";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)    
	public String modifyPost(Model model, BoardVO bVO){ 
		logger.info("수정페이지 수정 실행");
		System.out.println(bVO); //수정한 게시물
		
		boardService.updateboard(bVO);
		
		return "redirect:/board/display";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)    
	public String registerGet(Model model){ 
		logger.info("등록페이지 실행");
		
		return "/board/register";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)    
	public String deleteGet(Model model){ 
		logger.info("삭제페이지 실행");
		
		return "/board/delete";
	}
	

}
