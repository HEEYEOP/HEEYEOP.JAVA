package Day191;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import Day12.StudentManager;

public class InfomationManager {
	
	private HashSet<StudentInfomation> infomations = new HashSet<StudentInfomation>();
	
	
	//학생정보 추가 기능
	public boolean addInfo(StudentInfomation std){
		
		return infomations.add(new StudentInfomation(std));
	}
	
	
	
	
	
	
	//학생정보 검색 기능
	//기능 : 학생정보를 주고 infomations에 같은 정보가 있으면 true를 리턴하고 그렇지 않으면  false를 리턴한다.
	//매개변수 : 학생정보 StudentInfomation std
	//리턴타입 : boolean

	public boolean searchInfo(StudentInfomation std){
		Iterator<StudentInfomation> it = infomations.iterator();
		while(it.hasNext()){
			StudentInfomation tmp = (StudentInfomation)it.next();
			if(tmp.equals(std))
				return true;
		}
		
		return false;
	}
	//학생정보 수정 기능

	//기능 : 학생정보가 주어지면 학생정보를 찾아서  
	//매개변수 :
	//리턴타입 :
	//메소드명 :
	
	
	
	
	
	
	
	
	
	
	//학생정보 삭제 기능
	public boolean deleteInfo(StudentInfomation std){
		
		 if(searchInfo(std) == true)
			 return infomations.remove(std);
		 else
			 return false;
	}
	
	
	
	//전체 학생정보 출력 기능
	public void printInfo(){
		
		System.out.println(infomations);	
	}
	
	public void printMenu(){
		System.out.println("-----메뉴-----");
		System.out.println("1.정보추가");
		System.out.println("2.정보수정");
		System.out.println("3.정보삭제");
		System.out.println("4.정보출력");
		System.out.println("5.종료");
		System.out.println("------------");	
	}
	
	
	
	
	public void scannerInfo(Scanner scan){
		
		StudentInfomation std = new StudentInfomation();
		
		System.out.println("1.이름을 입력하세요");
		std.setName(scan.next());
		System.out.println("2.나이를 입력하세요");
		std.setAge(scan.nextInt());
		System.out.println("3.전공을 입력하세요");
		std.setMajor(scan.next());
		System.out.println("4.학번을 입력하세요");
		std.setNum(scan.next());
				
	}

	
	
	
	
	
	
}
