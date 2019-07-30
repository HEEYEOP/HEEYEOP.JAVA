package kr.green.spring.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.pagination.PageMaker;
import kr.green.spring.service.AdminService;
import kr.green.spring.service.BoardService;
import kr.green.spring.service.MemberService;
import kr.green.spring.service.PageMakerService;
import kr.green.spring.vo.MemberVO;

@Controller
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	MemberService memberService;
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
	
	


}
