package kr.green.spring.service;

import java.util.ArrayList;

import kr.green.spring.vo.BoardVO;

public interface BoardService {

	ArrayList<BoardVO> getBoardList();

	BoardVO getBoard(BoardVO obj);

	void updateViews(BoardVO obj);

	void updateboard(BoardVO bVO);



}
