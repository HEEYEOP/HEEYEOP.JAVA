package kr.green.spring.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.vo.BoardVO;

public interface BoardService {

	ArrayList<BoardVO> getBoardList(Criteria cri);

	BoardVO getBoard(BoardVO obj);

	void updateViews(BoardVO obj);

	void updateBoard(BoardVO bVO, HttpServletRequest r);

	void insertBoard(BoardVO bVO);

	void deleteBoard(BoardVO bVO);

	int getTotalCount(Criteria cri);



}
