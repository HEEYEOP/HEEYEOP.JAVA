package kr.green.spring.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
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
import org.springframework.web.servlet.ModelAndView;

import kr.green.spring.dao.MemberDAO;
import kr.green.spring.service.MemberService;
import kr.green.spring.service.MemberServiceImp;
import kr.green.spring.vo.MemberVO;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	MemberService memberService; 
	
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
	
	//----------------------3-----------------------------//
	
	@RequestMapping(value="/signout")
	public String signout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		logger.info("로그아웃 되었습니다 ");

		
		return "redirect:/";
	}
	
	//----------------------4-----------------------------//
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

	    //memberService.sendMail(tomail, title, contents); // 이 한줄이 밑에 try-catch문을 대체할 수 있음
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
	
	
	
	
	
	
	
	
	//----------------------5-----------------------------//

	
	@RequestMapping(value = "/password/find") 
	public String passwordFind() {
		logger.info("비밀번호 찾기 페이지 실행");
		
	    return "member/find"; 
	}   
	
	
	@RequestMapping(value ="/checkemail") 
	@ResponseBody 
	public Map<Object, Object> emailcheck(@RequestBody String str){ 
		System.out.println("이거 모야모야 찍히는거야 모야모야");
	    System.out.println(str); 	//앞에 ajax로 id랑 email을 넘겨받는뎅 그거를 str로 뭉쳐서 받음 그래서 id=   &email=   이런형태의 값을 갖고있음
		HashMap<Object, Object> map = new HashMap<Object, Object>(); 
	    

	    String [] arr = str.split("&"); 
	    String id = arr[0]; 
	    String email = "";	//여기서 arr[1]를 바로 넣어주지 않는 이유는 한글이 깨지기 때문에 밑에 try-catch문으로 예외처리를 시켜줬음
	    
	    try {
			email = URLDecoder.decode(arr[1], "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	    
	    id = memberService.getVal(id);
	    email = memberService.getVal(email);
	    
	    boolean isOk = memberService.checkMember(id,email);
	    map.put("isOk", isOk);
	    
	    return map; 
	}
	
	@RequestMapping(value = "/password/send") 
	public String passwordSend(String id, String email) { 
		//비밀번호 생성
		String newPw = memberService.createPw();
		
		//생성된 비밀번호 db에 저장
		memberService.modify(id,email,newPw);
		//이메일 발송
		
		String title ="변경된 비밀번호입니다";
		String contents="변경된 비밀번호입니다.\n"+newPw+"\n";
		
		memberService.sendMail(email,title,contents);
		
	    return "send"; 
	}
	

	
	
	 @RequestMapping(value={"/test/home","/test/home.do"})
	    public ModelAndView openTilesView(ModelAndView mv) throws Exception{
	        mv.setViewName("/test/home");
	        mv.addObject("setHeader", "타일즈");
	        return mv;
	    }

	
	
	
	
	
	
	
	
	
	
	
	
}
