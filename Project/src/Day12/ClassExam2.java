package Day12;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class ClassExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		StudentManager mng = new StudentManager();		

		int menu = 0;
		
		do{
			mng.printMenu();	
			menu = scan.nextInt();
			Student s;	
			
			switch(menu){
				case 1:
					System.out.println("추가할 학생 정보를 입력하세요");
					s = mng.inputStudent(scan);						// 여기에 입력받는 많은 코드를 썼었는데, 그것을 studentManager클래스에 메소드로 구현하였음.
					mng.insert(s);
					break;
					
				case 2:
					System.out.println("수정할 학생정보를 입력하세요");
					s = mng.inputStudent(scan);
					mng.modify(s);
					break;
					
				case 3:
					System.out.println("3.학생정보 삭제");
					s = mng.inputSearchStudent(scan);
					mng.delete(s);
					break;
					
				case 4:
					mng.print();
					break;
					
				case 5:
					System.out.println("5.종료");
					break;
					
				default:
					System.out.println("잘못된 메뉴");
			}
		}while(menu != 5);
		
		/* 	//위의 do-while코드와 같은 코드임.
		 * 
			for(	;menu != 5;		){
				mng.printMenu();	
				menu = scan.nextInt();			
			}
		*/
		
		scan.close();
		
		
	}

}
