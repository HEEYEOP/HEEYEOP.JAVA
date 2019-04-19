package Day19;



public class Std {
	
	private String name="";				//String 객체 멤버는 기본값이 null이기 때문에 빈문자열("")로 명시적 초기화를 한다. (따로 기본생성자를 만들지 않을 계획)
	private String Sname=""; //학교이름
	private String id="";
	private String major="";
	private double avr;
	
	
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
	public void setAvr(double avr) {
		if(avr > 4.5 || avr < 0)
			return;
		this.avr = avr;
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
		this(s.name, s.id, s.Sname, s.major, s.avr); 			// this() ---> 내 생성자 호출
		
	}
	//생성자2 (생성자 오버로딩)
	public Std(String name, String id, String Sname, String major, double avr){
		this.name = name;
		this.id = id;
		this.Sname = Sname;
		this.major = major;
		this.avr = avr;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
