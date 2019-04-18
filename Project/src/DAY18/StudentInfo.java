package DAY18;

import java.util.ArrayList;

public class StudentInfo {
	//1. 학생정보에 넣을 변수를 선언하고
	//2. getter , setter 만들고
	//3. 리스트로 만들 수 있는 메소드를 작성 
	
	private String name;	
	private int grade;		
	private int classNum;	
	private int num;	
	
	private Gender gender;
	private Major major;
	
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public int getNum() {
		return num;
	}
	public Gender getGender() {
		return gender;
	}
	public Major getMajor() {
		return major;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	
	
	//기본생성자
	public StudentInfo(){}
	//복사생성자
	public StudentInfo(StudentInfo s){
		this.name =name;
		this.grade=grade;
		this.classNum=classNum;
		this.num=num;
		this.gender = Gender.MALE;
		this.major = Major.NONE;
	}
	
	
	//생성자2 --- 코드중복!!!!!!!!!!!!!!!!!
	public StudentInfo( String name,int grade,int classNum,int num, Gender gender, Major major){
		this.name =name;
		this.grade=grade;
		this.classNum=classNum;
		this.num=num;
		this.gender = gender;
		this.major = major;
	}
	
	
	@Override
	public String toString() {
		return "StudentInfo [나이=" + name + ", 학년=" + grade + ", 반=" + classNum + ", 번호=" + num + "]";
	}

	
	
	
	

}
