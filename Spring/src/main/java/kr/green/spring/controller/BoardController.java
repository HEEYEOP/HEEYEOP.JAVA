package kr.green.spring.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import kr.green.spring.service.BoardService;
import kr.green.spring.vo.BoardVO;


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

}
