package kr.green.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
//컨트롤러 어노테이션으로 @Controller가 붙으면 컨트롤러로 인식
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	
	//서버부분을 제외한 URL이 /이고, 방식이 GET이면 home 메소드를 실행
	@RequestMapping(value = "/", method = RequestMethod.GET)    //메소드 = get방식으로 받는다는것은 누가 결정해주는거지?? 이해 못함
	public String home(Model model, Integer num1, Integer num2, Integer number) { //js에 있는 이름과 일치시켜주어야 한다.
		logger.info("메인페이지 실행");
		
		//model은 화면(jsp)과 관련된 정보를 저장하는 객체
	
		
		
		//각각 숫자를 입력하고 계산 결과를 띄우는 예제
		Integer res = null;
		if(num1 != null && num2 != null){
			res = num1 + num2;
			//model.addAttribute("resV", num1+num2);
		}
		model.addAttribute("num1V",num1);
		model.addAttribute("num2V",num2);
		model.addAttribute("resV",res);
		
		
		
		//증가 버튼을 클릭할 때 마다 숫자를 1씩 증가시키는 예제
		if(number != null) { 	//또는 if(number ==null){number = 0;}		else{number++;}
			model.addAttribute("numberV", ++number);
		}
		
		//사용자에게 home.jsp를 보내줌
		return "home";
	}
}
