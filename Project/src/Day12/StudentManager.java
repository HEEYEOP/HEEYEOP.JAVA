package Day12;

import java.util.Scanner;

public class StudentManager {
	
	private Student std[];		//학생들 정보를 담을 배열
	private int count;			//현재 저장된 학생 수		//기본생성자를 통해 0으로 초기화가 된다.
	public final int MIN_STUDENT_COUNT = 300;
	
	
	//기본생성자 (여기서 쓰지 않은 변수는 알아서 타입값대로 초기화가 되므로  count는 0으로 초기화가 된다)
	public StudentManager(){
		std = new Student[MIN_STUDENT_COUNT];	
	}
	
	//생성자2
	public StudentManager(int studentCnt){
		
		if(studentCnt > MIN_STUDENT_COUNT)
			std = new Student[studentCnt];
		else
			std = new Student[MIN_STUDENT_COUNT];
	}
	
	//학생정보 추가
	//기능 : 학생정보를 배열에 추가
	//매개변수 : 학생정보 => Student s
	//리턴타입 : void
	//메소드명 : insert
	
	public void insert(Student s){
		//학년, 반, 번호로 검색해서 해당 학생 정보가 없으면!! 학생정보 추가, 있으면 아무것도 안함
		if(search(s) == -1){
		
			//insert 기능에서 객체 정보를 추가하려면 객체를 생성한 후 매개변수의 값을 복사해야함.
			//std[@@] : Student 클래스의 객체는 초기에 선언만 되어있음
			std[count] = new Student(s);	//복사생성자를 호출한다. 			//std[count] = s; 	===> "객체 = 객체" 는 주의해야한다. std[]를같이 사용하기 때문에 정보가 바뀌면 같이 바뀔 수 있다.
			count++;
		}
		
	}
	
	
	//학생정보 출력
	//기능 : 학생정보 전체 출력
	//매개변수 : 없다.
	//리턴타입 : 없다. -> void
	//메소드명 : print
	
	public void print(){
		for(int i =0; i<count; i++){
			System.out.println(std[i]);
		}
	}
	
	//학생정보 검색	(학생정보를 수정 또는 삭제하기 위해서 학생정보가 있는지를 알아야 하기 때문) 
	//기능 : 학생정보 검색해서 없으면 -1를, 있으면 배열에 위치한 번지를 알려주는 기능
	//매개변수 : 학년, 반, 번호 => 
	//리턴타입 : -1 또는 번지 -> int grade, int classNum, int num
	//메소드명 : search
	
	private int search(int grade, int clssNum, int num){
		for(int i =0; i<count; i++){
			if(std[i].getGrade() == grade && std[i].getClassNum() == clssNum && std[i].getNum()==num){
				return i;
			}
		}
		return -1;
		
	}
	
	private int search(Student s){						//메소드 오버로딩
		return search(s.getGrade(),s.getClassNum(), s.getNum());
	}
	
	
	
	//학생정보 수정
	//기능 : 학생정보를 배열에서 수정
	//매개변수 : 학생정보 => Student s
	//리턴타입 : 없다 => void
	//메소드명 : modify
	
	public void modify(Student s){
		
		//int searchIndex = search(s.getGrade(),s.getClassNum(),s.getNum());		//검색했을 때 해당 정보가 있는 번지  
		//if(searchIndex != -1){													// 나는 search함수를 바로가져다쓰기로함.
		
		if(search(s) != -1){
			std[search(s)] = new Student(s);		//찾은번지에다가 새로운 객체 new Student를 생성하여 덮어쓰기한다 --> 새롭게 수정될 정보는 main에서 new Student로 만들어 넣어준다.
			
		}	
	}
	
	
	
	//학생정보 삭제
	//기능 : 배열에서 학생정보 삭제
	//매개변수 : 학생정보  Student s
	//리턴타입 : 없다 -> void
	//메소드명 : delete
	
	public void delete(Student s){
		
		int searchIndex = search(s.getGrade(),s.getClassNum(),s.getNum());		//검색했을 때 해당 정보가 있는 번지  
		
		if(searchIndex != -1){
			for(int i = searchIndex; i<count-1; i++){		//배열을 밀기
				std[i] = std[i+1];
			}
			std[count-1] = null;
			//현재 저장된 갯수를 하나 감소
			count --;
			
		}
	}
	public void printMenu(){
		System.out.println("1.학생정보 추가");
		System.out.println("2.학생정보 수정");
		System.out.println("3.학생정보 삭제");
		System.out.println("4.학생정보 출력");
		System.out.println("5.종료");
		System.out.println("메뉴를 선택하세요.");
		
	}
	
	
	//기능 : scanner가 주어지면 검색을 위한 학생의 정보를 콘솔을 통해 입력받아 학생 객체를 만들어 돌려주는 기능
	//매개변수 : Scanner scan
	//리턴타입 : 학생객체 - Student 
	//메소드명: inputSearchStudent
	
	//Scanner scan = new Scanner(System.in);
	//       int a = scan.nextInt();
	public Student inputSearchStudent(Scanner scan){			//Student는 리턴타입
		
		Student s = new Student();
		
		System.out.println("학년 :");
		s.setGrade(scan.nextInt());
		
		System.out.println("반 :");
		s.setClassNum(scan.nextInt());
		
		System.out.println("번호 :");
		s.setNum(scan.nextInt());
		
		return s;
	}
		
	//기능 	: scanner가 주어지면 학생의 정보를 콘솔을 통해 입력받아 학생 객체를 만들어 돌려주는 기능
	//매개변수 : Scanner scan
	//리턴타입 : 학생객체 - Student 
	//메소드명 : inputStudent
	
	public Student inputStudent(Scanner scan){
		
		Student s = inputSearchStudent(scan);			
		
		System.out.println("이름 :");
		s.setName(scan.next()); 						//next()는 공백을 무시, nextLine()을 공백을 계산 
		
		System.out.println("국어 :");
		s.setKor(scan.nextInt());
		
		System.out.println("영어 :");
		s.setEng(scan.nextInt());
		
		System.out.println("수학 :");
		s.setMath(scan.nextInt());
		
		return s;
	}
	
	
	
	
	
}
