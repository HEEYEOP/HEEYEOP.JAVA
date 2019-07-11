package kr.green.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.MemberDAO;
import kr.green.spring.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService{

	@Autowired
	MemberDAO  memberDao;

	@Override
	public boolean signup(MemberVO mVO) {
		//기존에 해당 아이디가 있는지 체크 => 있으면 false, 없으면 회원가입 진행
		if(mVO == null)
			return false;
		mVO.setName("");
		
		if(memberDao.getMember(mVO.getId()) != null)
			return false;
		
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
		else if(logVO.getPw().equals(oVO.getPw()))
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


}
