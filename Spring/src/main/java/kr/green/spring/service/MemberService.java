package kr.green.spring.service;

import org.springframework.stereotype.Service;

import kr.green.spring.vo.MemberVO;


public interface MemberService {
	
	public boolean signup(MemberVO mVO);
	
	public boolean signin(MemberVO logVO);
	
	

}
