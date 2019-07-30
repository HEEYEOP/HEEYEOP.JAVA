package kr.green.spring.dao;

import java.util.ArrayList;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.vo.MemberVO;

public interface MemberDAO {

	public MemberVO getMember(String id);
	
	public void signup(MemberVO mVO);
	
	public void modify(MemberVO modifyVO);

	public ArrayList<MemberVO> getAllMember(Criteria cri);

	public int getCountMember();

	public void updateAuthority(MemberVO mVO);


}
