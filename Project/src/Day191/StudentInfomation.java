package Day191;

public class StudentInfomation {
	
	private String name;
	private int age;
	private String major;
	private String num; 	//학번
	//--------------------
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getMajor() {
		return major;
	}
	public String getNum() {
		return num;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	
	
	
	
	//기본생성자
	public StudentInfomation(){
		name ="";
		age=0;
		major="";
		num="";
	}
	//복사생성자
	public StudentInfomation(StudentInfomation s){
		this(s.name, s.age, s.major, s.num);
	}
	//생성자2 (생성자 오버로딩)
	public StudentInfomation(String name, int age, String major, String num){
		this.name = name;
		this.age = age;
		this.major = major;
		this.num = num;
	}
	
	
	@Override
	public String toString() {
		return "StudentInfomation [이름 : " + name + ", 나이 : " + age + ", 전공 : " + major + ", 학번 : " + num + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((major == null) ? 0 : major.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
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
		StudentInfomation other = (StudentInfomation) obj;
		if (age != other.age)
			return false;
		if (major == null) {
			if (other.major != null)
				return false;
		} else if (!major.equals(other.major))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
