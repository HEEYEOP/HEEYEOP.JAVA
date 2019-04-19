package DAY18;

import java.util.ArrayList;
import java.util.List;

public class InfoManager {
	
	private ArrayList<StudentInfo> list;
	//-------------------------
	
	
	//기본생성자
	public InfoManager(){
		list = new ArrayList();
	}
	
	//학생정보 삽입
	public void insert(StudentInfo s){
		if(search(s) == false)
			list.add(s);
	}
	
	//학생정보 검색
	public boolean search(StudentInfo s){
		for(int i = 0; i<list.size(); i++){
			if(list.get(i).equals(s)){
				return true;
			}
		}
		return false;
	}
	
	//학생정보 수정
	public void modify(StudentInfo s, StudentInfo t){
		/*if(search(s) == true){
			int k = list.indexOf(s);
			list.set(k, t);
		}*/
		int k = list.indexOf(s);
		if(k != -1){
			list.set(k, t);
		}
	}
	
	public void print(){
		System.out.println(list);
	}
	
	/*
	//학생정보 출력
	public void print(){
		
	}
	*/

	
	
	
	
	
	
	
	
	
	
	
	
	

}
