package kr.green.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.green.spring.dao.MemberDAO;
import kr.green.spring.service.MemberService;
import kr.green.spring.vo.MemberVO;

/**
 * Handles requests for the application home page.
 */
//컨트롤러 어노테이션으로 @Controller가 붙으면 컨트롤러로 인식
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	MemberService memberService; 
	@Autowired
	MemberDAO memberDao;
	@Autowired
	private JavaMailSender mailSender;
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)    
	public String home(Model model){ 
		logger.info("메인페이지 실행");
		
		return "home";
	}
	
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)    
	public String signupGet(Model model){ 
		logger.info("회원가입페이지 실행");
		
		return "signup";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST) 
	public String signupPost(MemberVO mVO){ 
		logger.info("회원가입 진행중");
		
		if(memberService.signup(mVO))
			return "redirect:/";
		else
			return "redirect:/signup";
	}
	
	//------------------------1---------------------------//
	
	@RequestMapping(value = "/signin", method = RequestMethod.GET)    
	public String signinGet(Model model){ 
		logger.info("로그인페이지 실행");
		
		return "redirect:/"; 
	}
	
	@RequestMapping(value = "/signin", method = RequestMethod.POST)    
	public String signinPost(Model model ,MemberVO logVO){ 
		logger.info("로그인 진행중");
		//System.out.println(logVO);
		
		MemberVO user = memberService.signin(logVO); 
		if(user != null) {
			System.out.println("로그인 성공");
			model.addAttribute("user", user);
			return "redirect:/";
		}
		else {
			System.out.println("로그인 실패");
			return "redirect:/signin";
		}
	}
	
	
	//----------------------2-----------------------------//
	
	@RequestMapping(value = "/member/modify", method = RequestMethod.GET)    
	public String memberModifyGet(Model model){ 
		logger.info("회원정보수정 페이지 실행");
		
		return "member/modify";
	}
	
	@RequestMapping(value = "/member/modify", method = RequestMethod.POST)    
	public String memberModifyPost(MemberVO modifyVO, String oldpw){ 
		logger.info("회원정보 수정 진행중");
		
		if(memberService.modify(modifyVO, oldpw)) {
			System.out.println("회원정보 수정 성공");
			System.out.println(modifyVO.getPw());
			System.out.println(oldpw);
			return "redirect:/";
					
		}
		System.out.println("회원정보 수정 실패");
		return "redirect:/member/modify";
	}
	
	//로그아웃 기능//
	
	@RequestMapping(value="/signout")
	public String signout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		logger.info("로그아웃 되었습니다 ");

		
		return "redirect:/";
	}
	
	//-------------------------------------------
	@RequestMapping(value ="/dup")
	@ResponseBody
	public Map<Object, Object> idcheck(@RequestBody String id){

	    Map<Object, Object> map = new HashMap<Object, Object>();
	    //변수 id에 저장된 아이디가 회원 아이디인지 아닌지 확인하여 isMember변수에 담아 보낸다
	    boolean isMember = memberService.isMember(id);
	    System.out.println(isMember);
	    map.put("isMember", isMember);

	    return map;
	}
	
	
	
	
	@RequestMapping(value = "/mail/mailForm")
	public String mailForm() {

	    return "mail";
	}  

	// mailSending 코드
	@RequestMapping(value = "/mail/mailSending")
	public String mailSending(HttpServletRequest request) {

	    String setfrom = "stajun@naver.com";         
	    String tomail  = request.getParameter("tomail");     // 받는 사람 이메일
	    String title   = request.getParameter("title");      // 제목
	    String content = request.getParameter("content");    // 내용

	    try {
	        MimeMessage message = mailSender.createMimeMessage();
	        MimeMessageHelper messageHelper 
	            = new MimeMessageHelper(message, true, "UTF-8");

	        messageHelper.setFrom(setfrom);  // 보내는사람 생략하거나 하면 정상작동을 안함
	        messageHelper.setTo(tomail);     // 받는사람 이메일
	        messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
	        messageHelper.setText(content);  // 메일 내용

	        mailSender.send(message);
	    } catch(Exception e){
	        System.out.println(e);
	    }

	    return "redirect:/mail/mailForm";
	}
	
	
	//--------임시 비밀번호 발급-----------
	
	@RequestMapping(value = "/mail/mailForm2")
	public String pwForm() {

	    return "mail2";
	}  
	// mailSending2 코드
		@RequestMapping(value = "/mail/mailSending2")
		public String mailSending2(HttpServletRequest request) {
		    String id  = request.getParameter("idCheck"); //해당 아이디
		    String mail  = request.getParameter("tomail");     // 받는 사람 이메일

		    MemberVO member = memberDao.getMember(id); 
			if(  member != null) {
				if(member.getEmail().equals(mail)) {
					

					String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
					String pw="";
					for(int i=0; i<8; i++) {
						int r = (int)(Math.random()*62);
						pw += str.charAt(r);
					}
				
				    String setfrom = "stajun@naver.com";         
				    String tomail  = request.getParameter("tomail");     // 받는 사람 이메일
				    String content = pw;    // 내용

				    try {
				        MimeMessage message = mailSender.createMimeMessage();
				        MimeMessageHelper messageHelper 
				            = new MimeMessageHelper(message, true, "UTF-8");

				        messageHelper.setFrom(setfrom);  // 보내는사람 생략하거나 하면 정상작동을 안함
				        messageHelper.setTo(tomail);     // 받는사람 이메일
				        messageHelper.setSubject("임시비밀번호"); // 메일제목은 생략이 가능하다
				        
				        
				        messageHelper.setText(content);  // 메일 내용

				        mailSender.send(message);
				    } catch(Exception e){
				        System.out.println(e);
				    }
				    
				    memberService.updatePw(member, pw);
				    
				    return "redirect:/";
				}
				return "/mail2";
			}
			return "/mail2";

			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
