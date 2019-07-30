package kr.green.spring.service;

import org.springframework.stereotype.Service;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.pagination.PageMaker;

@Service
public class PageMakerServiceImp implements PageMakerService{

	@Override
	public PageMaker getPageMaker(int displayPageNum, Criteria cri, int totalCount) {
		PageMaker pm = new PageMaker();
		
		pm.setCriteria(cri); //pm의 현재 페이지 정보 설정
		pm.setDisplayPageNum(displayPageNum); //pm의 displayPageNum 설정 //displayPageNum은 페이지네이션의 갯수
		pm.setTotalCount(totalCount);		//pm의 총 게시글 수 설정

		
		return pm;
	}

}
