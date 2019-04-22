package Day20;

import java.util.ArrayList;
import java.util.Iterator;

import javax.security.auth.Subject;

public class Std {
	
	private String name="";				//String 객체 멤버는 기본값이 null이기 때문에 빈문자열("")로 명시적 초기화를 한다. (따로 기본생성자를 만들지 않을 계획)
	private String Sname=""; //학교이름
	private String id="";
	private String major="";
	private double avr;
	
	private ArrayList<Grade> subjectList = new ArrayList<>();
	
	
	public String getName() {
		return name;
	}
	public String getSname() {
		return Sname;
	}
	public String getId() {
		return id;
	}
	public String getMajor() {
		return major;
	}
	public double getAvr() {
		return avr;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	//학생정보를 객체를 이용하여 출력할때 보고싶은 내용으로 출력하기 위해 오버라이딩함.
	@Override
	public String toString() {
		return "학생 [이름 : " + name + ", 학교이름 : " + Sname + ", 학번 : " + id + ", 전공 : " + major + ", 평점 : " + avr + "]";
	}
	
	
	
	
	//id가 같으면 같은 그룹에 있게하기 위해서 
	//hashCode()와 						/////////---------------해시코드 추가 공부하기-------------//////////////
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Std other = (Std) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	//기본생성자
	public Std(){}
	
	//복사생성자  ---> 아래에 구현한 생성자 오버로딩을 호출하여 코드의 중복을 제거함.
	public Std(Std s){
		this(s.name, s.id, s.Sname, s.major, s.avr, s.subjectList); 			// this() ---> 내 생성자 호출
		
	}
	//생성자2 (생성자 오버로딩)
	public Std(String name, String id, String Sname, String major, double avr, ArrayList<Grade> subjectList){
		this.name = name;
		this.id = id;
		this.Sname = Sname;
		this.major = major;
		this.avr = avr;
		this.subjectList = subjectList;
		
	}
	
	
	//기능 : 학생이 수강과목을 입력하면 subjectList에 추가
	//매개변수 : 수강과목 -> Grade grade
	//리턴타입 : 없다 -> void
	//메소드명 : insertSubject
	public void insertSubject(Grade grade){
		subjectList.add(grade);
		
		calculateAverage();
	}
	
	
	
	//기능 : 과목 리스트에 있는 과목들의 평점을 계산
	//매개변수(기능을 실행하기 위해서 필요한, 외부에서 알려주는 정보) : 없다 -> void 		//왜?// 과목리스트에 있는 과목들의 정보는 멤버변수 subjectList에 있기 때문에
	//리턴타입(기능을 실행하고 알려줘야하는 정보) : 없다 -> void 			//왜?// 평점을 멤버변수 avr에 저장하기 때문에 따로 알려줄 필요없고 평점에 대한 정보를 확인하려면 getAvr() 호츨하면 된다.
	//메소드명 : calculateAverage
	public void calculateAverage(){
		
		//리스트에 있는 과목들을 하나씩 끄집어 내서 해당 과목에서 받은 성적을 계산한 후 
		//최종적으로 avr에 저장
		// 1. 리스트에 있는 과목들을 하나씩 끄집어 냄 -> 반복문을 이용하여
		// 2. 해당 과목에서 받은 성적을 이용하여 계산
		// 2.1 P인 경우 해당 학점을 계산에 추가하지 않는다
		// 2.2 그외의 성적은 해당 과목에 대한 평점을 구학고 평점과 학점을 곱한 값을 누적을 시키고,  학점도 누적시킨다
		// 3. 반복문이 종료되면 평점과 학점을 누적시킨 값에 누적시킨 학점으로 나눈 후 avr에 저장
		
		Iterator<Grade> it = subjectList.iterator();
		int sumUnit = 0;  //학점을 누적할 변수 
		double sumPoint = 0.0; // 평점과 학점을 곱한값을 누적할 변수 
		while(it.hasNext()){
			Grade tmp = it.next();
			if(tmp.getStep().equals("P"))
				continue;
			sumPoint += tmp.getPoint()*tmp.getUnit();   		//[평점과 학점을 곱한 값]을 누적
			sumUnit += tmp.getUnit();							//평점을 누적
		}
		avr= sumPoint/sumUnit;
	}
	
	
	
	/*-----------------------------내코드
	public void printSubject(){
		
		Iterator<Grade> it = subjectList.iterator();
		
		while(it.hasNext()){
			Grade tmp = (Grade)it.next();
			System.out.println(tmp);
		}
	}
	*/
	
	public boolean printSubject(){
		if(subjectList.size() == 0)
			return false;
		
		Iterator<Grade> it = subjectList.iterator();
		while(it.hasNext()){
			Grade tmp = it.next();
			System.out.println(tmp);
		}
		return true;
	}
	
	
	
	
	
	
	
	

}
