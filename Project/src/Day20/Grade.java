package Day20;	//Day19를 복사해옴

public class Grade {
	//등급 : A+, A, B+, B, C+, C, D+, D, F
	//교수
	//과목명
	//학점
	
	private GradeStep step;     				//GradeStep은 열거형으로 따로 만들었다
	private String professor;
	private String title;
	private int unit;
	
	
	public String getStep() {	//리턴타입을 GradeStep에서 String으로 바꿔주고 밑에 switch-case문을 사용하여 출력에 +가 나올 수 있도록 변경하였음.
		switch(step){
		case Ap: return "A+";
		case A: return "A";
		case Bp: return "B+";
		case B: return "B";
		case Cp: return "C+";
		case C: return "C";
		case Dp: return "D+";
		case D: return "D";
		case Pass: return "P";
		default: return "F";
		}
	}
	public String getProfessor() {
		return professor;
	}
	public String getTitle() {
		return title;
	}
	public int getUnit() {
		return unit;
	}
	public void setStep(String step) {		//입력할때는  A+형태로 입력하기 때문에 그것을 enum에 입력한 형태로 바꿔주기 위한 작업.
		switch(step){
		case "A+": this.step = GradeStep.Ap; 	break;
		case "A": this.step = GradeStep.A; 		break;
		case "B+": this.step = GradeStep.Bp; 	break;
		case "B": this.step = GradeStep.B; 		break;
		case "C+": this.step = GradeStep.Cp; 	break;
		case "C": this.step = GradeStep.C; 		break;
		case "D+": this.step = GradeStep.Dp; 	break;
		case "D": this.step = GradeStep.D; 		break;
		case "P": this.step = GradeStep.Pass; 	break;
		case "Fail": this.step = GradeStep.Fail;break;
		default: this.step = GradeStep.F; 		break;
		}
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	
	
	
	public void init(String step, String professor, String title, int unit){ //초기화 메소드를 만들어서 학점 등 수정이 발생할때, 사용할 수 있게 하였음. //첫번째 매개변수 Grade step이 아닌 String으로 하였음.
		setStep(step);
		setProfessor(professor);
		setTitle(title);
		setUnit(unit);
	}
	
	//기본생성자
	public Grade(){}
	//생성자2 (생성자 오버로딩)
	public Grade(String step, String professor, String title, int unit){
		init(step, professor, title, unit);
	}
	public Grade(Grade g){
		init(g.getStep(), g.professor, g.title, g.unit);			//g.getStep()으느 getter로 접근해야한다 매개변수와 일치시켜주기 위해서 
	}
	
	public double getPoint(){
		switch(step){
		case Ap: return 4.5;
		case A: return 4;
		case Bp: return 3.5;
		case B: return 3;
		case Cp: return 2.5;
		case C: return 2;
		case Dp: return 1.5;
		case D: return 1;
		case Pass: return 0;
		default: return 0;
		}
		
	}
	@Override
	public String toString() {
		return "강의 [강의명 : " + title + ", 담당교수 : " + professor + ", 등급 : " + step + ", 학점 : " + unit + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
