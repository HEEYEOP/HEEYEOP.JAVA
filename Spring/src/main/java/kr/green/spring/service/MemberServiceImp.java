package kr.green.spring.service;

import java.util.ArrayList;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.MemberDAO;
import kr.green.spring.pagination.Criteria;
import kr.green.spring.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService{

	@Autowired
	MemberDAO  memberDao;
	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private JavaMailSender mailSender;
	
	
	
	@Override
	public boolean signup(MemberVO mVO) {
		//기존에 해당 아이디가 있는지 체크 => 있으면 false, 없으면 회원가입 진행
		if(mVO == null)
			return false;
		mVO.setName("");
		
		if(memberDao.getMember(mVO.getId()) != null)
			return false;
		
		
		//----------암호화----------------
		String encodePw = passwordEncoder.encode(mVO.getPw());	//회원가입 창에서 입력받은 암호를 암호화 시킴
		mVO.setPw(encodePw); //회원 정보의 비밀번호를 암호화된 비밀번호로 변경
		
		
		memberDao.signup(mVO);
		return true;
	}

	
	
	@Override
	public MemberVO signin(MemberVO logVO) {
		if(logVO == null)	//예외처리
			return null;
		MemberVO oVO = memberDao.getMember(logVO.getId()); //객체를 사용할때는 항상 null값이 들어갈 수 있음에 주의하여 위에 예외처리를 작성해준다
		if(oVO == null)
			return null;
		if(passwordEncoder.matches(logVO.getPw(), oVO.getPw())) //matches함수 안에 매개변수 순서 중요!!!
			return oVO;
		
		return null;
		
	}

	
	
	@Override
	public boolean modify(MemberVO modifyVO, String oldpw) {
		
		if(modifyVO == null)
			return false;
		
		MemberVO oVO = memberDao.getMember(modifyVO.getId());
		
		if(oldpw.equals(oVO.getPw())) {
			if(modifyVO.getPw().length() == 0) {
				modifyVO.setPw(oldpw);
			}
			memberDao.modify(modifyVO);
			return true;
		}else {
			return false;
		}
			
	}



	@Override
	public boolean isMember(String id) {
		MemberVO dbMember = memberDao.getMember(id);
		if(dbMember == null)
			return false;
		return true;
	}



	@Override
	public String getVal(String id) {
		String [] arr = id.split("=");
		if(arr.length == 2)
			return arr[1];
		else
			return "";
	}



	@Override
	public boolean checkMember(String id, String email) {
		MemberVO user = memberDao.getMember(id);
		if(user != null && user.getEmail().equals(email)) {
			return true;
		}
		return false;
	}



	@Override
	public String createPw() {
		
		String str ="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		String pw=""; 
		for(int i=0; i<=7; i++) { 
			int r = (int)(Math.random()*62); 
			pw += str.charAt(r); 
		} 
		return pw;
	}



	@Override
	public void modify(String id, String email, String newPw) {
		MemberVO user = memberDao.getMember(id);
		if(user == null) return;
		if(!user.getEmail().equals(email)) return;
		
		String encodePw = passwordEncoder.encode(newPw);	
		user.setPw(encodePw); 
		memberDao.modify(user);
		
		
		
	}



	@Override
	public void sendMail(String email, String title, String contents) {
	    String setfrom = "아이디@gmail.com"; //여기에 구글 계정 넣어주기         

	    try {
	        MimeMessage message = mailSender.createMimeMessage();
	        MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");

	        messageHelper.setFrom(setfrom);  // 보내는사람 생략하거나 하면 정상작동을 안함
	        messageHelper.setTo(email);     // 받는사람 이메일
	        messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
	        messageHelper.setText(contents);  // 메일 내용

	        mailSender.send(message);
	    } catch(Exception e){
	        System.out.println(e);
	    }
		
	}



	@Override
	public ArrayList<MemberVO> getAllMember(Criteria cri) {
		return memberDao.getAllMember(cri);
	}

	@Override
	public int getCountMember() {
		return memberDao.getCountMember();
	}



	




}
