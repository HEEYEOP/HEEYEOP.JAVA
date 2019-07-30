package kr.green.spring.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.vo.MemberVO;


public interface MemberService {
	
	public boolean signup(MemberVO mVO);
	
	public MemberVO signin(MemberVO logVO);
	
	public boolean modify(MemberVO modifyVO, String oldpw);

	public boolean isMember(String id);

	public String getVal(String id);

	public boolean checkMember(String id, String email);

	public String createPw();

	public void modify(String id, String email, String newPw);

	public void sendMail(String email, String title, String contents);

	public ArrayList<MemberVO> getAllMember(Criteria cri);

	public int getCountMember();

	public void updateAuthority(MemberVO mVO);




}
 