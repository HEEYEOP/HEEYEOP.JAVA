package Day19;

import java.util.Scanner;

public class StdTest {

	public static void main(String[] args) {
		StdManager sMng = new StdManager();
		
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		
		do{
			sMng.printMenu();
			menu = scan.nextInt();
			switch(menu){
			
			case 1:
				Std s = sMng.inputStd(scan);
				if(sMng.insert(s))
					System.out.println("학생정보를 추가 했습니다");
				else
					System.out.println("이미 등록된 학번입니다");
				break;
			
			case 2:
				Std s2 = sMng.inputStd(scan);
				if(sMng.update(s2))
					System.out.println("해당 학생 정보를 수정 했습니다");
				else
					System.out.println("없는 학번입니다");
				break;
				
			case 3:
				Std s3 = sMng.inputId(scan);
				if(sMng.delete(s3))
					System.out.println("해당 학생 정보를 삭제 했습니다.");
				else
					System.out.println("없는 학번입니다");
				break;
				
			case 4:
				sMng.print();
				break;
				
			case 5: break;
			default:
				System.out.println("잘못된 메뉴를 선택했습니다.");
			
			}
			
			
		}while(menu != 5);
		System.out.println("프로그램 종료합니다");
		scan.close();
		
		
	}

}
