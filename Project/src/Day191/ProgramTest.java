package Day191;

import java.util.Scanner;

public class ProgramTest {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		InfomationManager infomations = new InfomationManager();
		int menu = 0;
		
		do{
			infomations.printMenu();
			
			switch(menu){
			
			case 1:
				System.out.println("학생정보를 입력해주세요");
				infomations.scannerInfo(scan);
				
				
				break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			default:
				System.out.println("잘못된 메뉴입니다");
			
			
			
			}
			
		}while(menu != 5);
		

	}

}
