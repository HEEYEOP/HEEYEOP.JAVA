package kr.green.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.BoardDAO;
import kr.green.spring.vo.BoardVO;

@Service
public class BoardServiceImp implements BoardService {

	@Autowired
	BoardDAO boardDao;
	
	@Override
	public ArrayList<BoardVO> getBoardList() {
		
		return boardDao.getBoardList();
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

}
