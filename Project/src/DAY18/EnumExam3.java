package DAY18;

public class EnumExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UniversityStudent std1 = new UniversityStudent(Gender.MALE, Grade.NUM1, Major.CHEMISTRY, "gmlduq", 1234);
		System.out.println(std1);
		std1.setUniversityName("그린");
		std1.setAverage(3.5);
		//std1.setMajor(MUSIC);   //예외발생!! setMajor()가 매개변수로 받는것은 Major major이기 때문에 열거형의 상수가 값으로 들어와야 한다.
		System.out.println(std1);
	}

}
