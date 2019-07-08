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
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/board")

public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	BoardService boardService;
	

	
	@RequestMapping(value = "/list", method=RequestMethod.GET)    
	public String boardListGet(Model model){ 
		logger.info("게시판페이지 실행");
		
		ArrayList<BoardVO> boardList = boardService.getBoardList();
		for(BoardVO tmp:boardList) {
			System.out.println(tmp);
		}
		model.addAttribute("list", boardList);
		return "board/list";
	}

}
