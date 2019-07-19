package kr.green.spring.dao;

import kr.green.spring.vo.MemberVO;

public interface MemberDAO {

	public MemberVO getMember(String id);
	
	public void signup(MemberVO mVO);
	
	public void modify(MemberVO modifyVO);


}
