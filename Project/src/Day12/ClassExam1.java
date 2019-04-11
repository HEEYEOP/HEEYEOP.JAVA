package Day12;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class ClassExam1 {
	
	public static int MAX_STUDENT_COUNT = 300;
	

	public static void main(String[] args) {
		StudentManager stdMng = new StudentManager(MAX_STUDENT_COUNT);
		
		// new Student("홍길동", 1, 1, 1, 100, 90, 80) : 객체를 생성했는데 이름이 없다 => 익명객체
		
		stdMng.insert(new Student("홍길동", 1, 1, 1, 100, 90, 80));
		stdMng.print();
		System.out.println("---------------------------");
		
		stdMng.modify(new Student("유관순",1,1,1,100,100,100));
		stdMng.print();
		System.out.println("---------------------------");
		
		stdMng.delete(new Student("",1,1,1,0,0,0));
		stdMng.print();
		System.out.println("---------------------------");
	}
	
	public static void printMenu(){
		System.out.println("1.");
		System.out.println("2.");
		System.out.println("3.");
		System.out.println("4.");
		System.out.println("5.");
		
	}
}


