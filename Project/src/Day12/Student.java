package Day12;

public class Student{		
	
	private String name;	//이름
	private int grade;		//학년
	private int classNum;	//반
	private int num;		//번호
	
	private double kor;
	private double eng;
	private double math;
	
	
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
	public double getKor() {
		return kor;
	}
	public double getEng() {
		return eng;
	}
	public double getMath() {
		return math;
	}
	
	
	public void setName(String name){
		//우선순위가 멤버변수보다 매개변수 또는 지역변수가 크기 때문에
		//아래 주석처리한 코드는 의미가 없어진다.
		//name = name;			--->   매개변수 = 매개변수 ;
		
		//매개변수 또는 지역변수의 이름이 멤버 변수와 동일한 경우 멤버변수와 매개변수(지역변수)를 구분하기 위해 this.을 붙인다.
		//this : 나 (현재 클래스)
		// . :멤버 변수나 멤버 메소드를 호출하는 연산자로 클래스나 객체명 다음에 온다.
		this.name = name;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public void setNum(int num) {
		if(name.length() <= 5)
			this.num = num;
	}
	public void setKor(double kor) {
		if(kor >= 0 && kor <= 100)
			this.kor = kor;
	}
	public void setEng(double eng) {
		if(eng >= 0 && eng <= 100)
			this.eng = eng;
	}
	public void setMath(double math) {
		if(math >= 0 && math <= 100)
			this.math = math;
	}
	
	//생성자 : 객체를 만들 때(new 연산자를 호출한 시점) 멤버 변수를 원하는 값으로 초기화를 하고 싶을때 생성자를 구현 해준다.
	
	//생성자를 하나도 구현하지 않으면 기본 생성자가  자동으로 만들어진다.		//기본생성자 : public Student(){}
	//단, 또다른 생성자를 구현한다면 기본생성자는 반드시 생성해줘야한다.
	
	
	
	//기본생성자
	public Student(){
		init("", 1, 1, 1, 0, 0, 0);
		
		/*name = "";			// name = new String(); 와 같은 코드임
		grade = 1;
		classNum = 1;
		num = 1;
		*/
	}
	
	//생성자2
	public Student(String name, int grade, int classNum, int num, double kor, double eng, double math){
		init(name,grade,classNum,num,kor,eng,math);
	}

	//복사생성자
	public Student(Student s){
		init(s.name, s.grade, s.classNum, s.num, s.kor, s.eng, s.math);

	}
	
	
	
	//멤버 변수를 초기화 하는 메소드
	public void init(){
		init("",1,1,1,0,0,0);
	}
	
	public void init(String name, int grade, int classNum, int num, double kor, double eng, double math){
		this.setName(name);
		this.setGrade(grade);
		this.setClassNum(classNum);
		this.setNum(num);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
		
		
		//아래코드 대신에 위에 코드를 사용하는 이유는???
		//아래 코드를 사용하면 kor 매개변수 값으로 200을 주면 범위에서 벗어나기 때문에 필터링 소스를 여기에 다시 구현해야하는 번거로움이 있다.
		//그래서 위에서 setter함수에 필터링을 구현해 놓았으니 setter함수를 가져다가 쓰면 코드의 중복을 줄일 수 있다.
		
		/*this.name = name;
		this.grade = grade;
		this.classNum = classNum;
		this.num =num;
		this.kor=kor;
		this.eng =eng;
		this.math=math; 
		*/
		
	}
	@Override
	public String toString() {
		return "학생정보 [name=" + name + ", grade=" + grade + ", classNum=" + classNum + ", num=" + num + ", kor=" + kor
				+ ", eng=" + eng + ", math=" + math + "]";
	}
	
	
	
	
	
	
	
}
