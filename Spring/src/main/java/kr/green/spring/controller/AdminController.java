package kr.green.spring.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.pagination.PageMaker;
import kr.green.spring.service.AdminService;
import kr.green.spring.service.BoardService;
import kr.green.spring.service.MemberService;
import kr.green.spring.service.PageMakerService;
import kr.green.spring.vo.BoardVO;
import kr.green.spring.vo.MemberVO;

@Controller
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	AdminService adminService;
	@Autowired
	MemberService memberService;
	@Autowired
	BoardService boardService;
	@Autowired
	PageMakerService pageMakerService;
	
	@RequestMapping(value = "/admin/user/list", method = RequestMethod.GET)    
	public String adminUserListGet(Model model, Criteria cri){ 
		logger.info("관리자_회원등급관리 페이지 실행");
		cri.setPerPageNum(5);
		ArrayList<MemberVO> list = memberService.getAllMember(cri);
		int totalCount = memberService.getCountMember();

		PageMaker pm = pageMakerService.getPageMaker(5,cri,totalCount);

		model.addAttribute("list", list);
		model.addAttribute("pageMaker", pm);
		
		return "admin/user/list";
	}
	
	
	@RequestMapping(value = "/admin/user/update", method = RequestMethod.GET)    
	public String adminUserUpdateGet(Model model, Criteria cri, MemberVO mVO){ 
		logger.info("관리자_회원등급수정 실행");
		
		memberService.updateAuthority(mVO);
		model.addAttribute("page", cri.getPage());
		return "redirect:/admin/user/list";
	}
	
	//------------------------------------------------------------------------------------------
	
	@RequestMapping(value = "/admin/board/list", method = RequestMethod.GET)    
	public String adminBoardListGet(Model model, Criteria cri){ 
		logger.info("관리자_게시판관리 페이지 실행");
		
		int totalCount = boardService.getTotalCountAdmin(cri);
		PageMaker pm = pageMakerService.getPageMaker(5, cri, totalCount);
		ArrayList<BoardVO> list = boardService.getBoardListAdmin(cri);
		
		model.addAttribute("pageMaker", pm);
		model.addAttribute("list", list);
		
		return "admin/board/list";
	}
	
	@RequestMapping(value = "/admin/board/update", method = RequestMethod.GET)    
	public String adminBoardUpdateGet(Model model, Criteria cri, BoardVO bVO){ 
		logger.info("관리자_게시물관리 실행");
		System.out.println(bVO);
		
		boardService.updateValid(bVO);
		model.addAttribute("page", cri.getPage());
		return "redirect:/admin/board/list";
	}
	
	
	
	


}
