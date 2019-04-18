package DAY18;

public class UniversityStudent {

	private Gender gender;
	private Major major;
	private Grade grade;
	private String name;
	private Integer id;
	private String universityName;
	double average;
	
	
	public Gender getGender() {
		return gender;
	}
	public Major getMajor() {
		return major;
	}
	public Grade getGrade() {
		return grade;
	}
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
	public String getUniversityName() {
		return universityName;
	}
	public double getAverage() {
		return average;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	
	//기본생성자
	public UniversityStudent(){
		gender = Gender.MALE;
		grade = Grade.NUM1;
		major = Major.NONE;
		
	}
	
	//생성자2
	public UniversityStudent(Gender gender, Grade grade, Major major, String name, Integer id){  //열거형의 상수들로 값의 범위를 제한할 수 있다.
		this.gender = gender;
		this.grade = grade;
		this.major = major;
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "UniversityStudent [gender=" + gender + ", major=" + major + ", grade=" + grade + ", name=" + name
				+ ", id=" + id + ", universityName=" + universityName + ", average=" + average + "]";
	}
	
	
	
}





