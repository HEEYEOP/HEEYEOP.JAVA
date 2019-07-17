package kr.green.spring.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.vo.BoardVO;

public interface BoardDAO {

	ArrayList<BoardVO> getBoardList(Criteria cri);

	BoardVO getBoard(BoardVO obj);

	void updateViews(BoardVO obj);

	void updateBoard(BoardVO obj);

	void insertBoard(BoardVO bVO);

	void deleteBoard(BoardVO bVO);

	int getTotalCount();

}
