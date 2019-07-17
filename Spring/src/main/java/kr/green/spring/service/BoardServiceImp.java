package kr.green.spring.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.BoardDAO;
import kr.green.spring.pagination.Criteria;
import kr.green.spring.vo.BoardVO;
import kr.green.spring.vo.MemberVO;

@Service
public class BoardServiceImp implements BoardService {

	@Autowired
	BoardDAO boardDao;
	
	@Override
	public ArrayList<BoardVO> getBoardList(Criteria cri) {
		
		return boardDao.getBoardList(cri);
	}

	@Override
	public BoardVO getBoard(BoardVO obj) {
		if(obj == null)
			return null;
		
		return boardDao.getBoard(obj);
	}

	@Override
	public void updateViews(BoardVO obj) {
		//boardDao.updateViews(obj);
		BoardVO tmp = boardDao.getBoard(obj);
		if(tmp != null) {
			int oldViews = tmp.getViews();
			tmp.setViews(oldViews+1);
			System.out.println(tmp);
			boardDao.updateBoard(tmp);
		}
		
	}

	@Override
	public void updateBoard(BoardVO bVO, HttpServletRequest r) {
		MemberVO user =(MemberVO)r.getSession().getAttribute("user");
		if(user == null || bVO == null) return ;
		if(bVO.getWriter() != null && bVO.getWriter().equals(user.getId())) {
			boardDao.updateBoard(bVO);
		}
	}

	@Override
	public void insertBoard(BoardVO bVO) {
		
		boardDao.insertBoard(bVO);
		
	}

	//-------------------------------------------------------------------------//
	
	
	@Override
	public void deleteBoard(BoardVO bVO) {
		if(bVO.getNum() <= 0 ) return ;
		boardDao.deleteBoard(bVO);
		
	}

	@Override
	public int getTotalCount() {
		return boardDao.getTotalCount();
	}

	

}
