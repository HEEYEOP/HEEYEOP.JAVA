package Day20;

import java.util.Scanner;

public class StdTest {

	public static void main(String[] args) {
		
		/*  //메소드 확인차 테스트 해본 것
		Std std = new Std("gmlduq", "1234", "green", "computer", 0);
		System.out.println(std);
		
		std.insertSubject(new Grade("A+", "gmlduq", "kor", 3));	//익명객체
	    System.out.println(std);
		
	    std.insertSubject(new Grade("C+","gmlduq", "eng", 3));
	    System.out.println(std);
	*/
		

	
		
		StdManager sMng = new StdManager();
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		Std std;
		Std result;
		int subMenu;
		
		do{
			sMng.printMenu();
			menu = scan.nextInt();
			
			switch(menu){
			case 1:
				std = sMng.inputStd(scan);
				if(sMng.insert(std))
					System.out.println("학생정보를 추가 했습니다");
				else
					System.out.println("이미 등록된 학번입니다");
				break;
				
			case 2:							//기존 : 학생정보를 입력받고 학생정보를 추가   -----> //변경 : 2번 선택시 학생정보 수정 또는 과목 등록을 할 수 있게 한다
				System.out.println("1번 학생정보 수정 , 2번 학생 수강과목 등록");
				System.out.println("서브 메뉴를 선택하세요");
				System.out.println("----------------");
				subMenu = scan.nextInt(); 
				
				if(subMenu == 1){
					std = sMng.inputStd(scan);
					if(sMng.update(std))
						System.out.println("해당 학생 정보를 수정 했습니다");
					else
						System.out.println("없는 학번입니다");
			
				}else if(subMenu == 2){
					//과목 추가하는 기능 작성
					//1. 학생정보 검색해서 학생 객체 가져옴
					//1.1 과목 입력
					//1.3 입력받은 과목을 통해 객체 생성
					//1.4 위에서 검색한 학생 객체에 과목객체를 추가
					//1.5 학생정보 수정
					
					
					//------------------------------------------------선생님 코드
					std= sMng.inputId(scan);
					result = sMng.search(std);
					
					if(result == null){						//해당 학생정보가 없으면 해당 기능 종료
						System.out.println("없는 학번입니다");
						break;
					}
					
					Grade grade = sMng.inputSubject(scan); 	//추가할 과목 정보를 입력하여 입력받은 과목을 통해 과목 객체 생성-->새로운 메소드 구현
					
					result.insertSubject(grade);			//학생 객체에 과목 객체 추가
					
					sMng.update(result);					//매니저에 학생정보 수정
					
					/* --------------------------------------------------내가 한거
					System.out.println("수정할 학생의 학번을 입력하세요:");
					Std s2 = sMng.inputId(scan);
					Std s3 = sMng.search(s2);
					
					System.out.println("등급을 입력하세요 :");
					String step = scan.next();
					
					System.out.println("교수이름을 입력하세요 :");
					String professor = scan.next();
					
					System.out.println("과목명을 입력하세요");
					String title = scan.next();
					
					System.out.println("학점을 입력하세요");
					int unit = scan.nextInt();
					
					Grade g = new Grade(step, professor, title, unit);
					
					s3.insertSubject(g);
					
					sMng.update(s3);
					*/
				}
				break;
				
			case 3:
				std = sMng.inputId(scan);
				if(sMng.delete(std))
					System.out.println("해당 학생 정보를 삭제 했습니다.");
				else
					System.out.println("없는 학번입니다");
				break;

			case 4:
				System.out.println("1번 선택 시 전체학생 출력");
				System.out.println("2번 선택 시 입력학생의 수강과목을 출력");
				System.out.println("서브 메뉴를 선택하세요");
				System.out.println("----------------");
				subMenu = scan.nextInt();
				
				if(subMenu == 1)	
					sMng.print();
				
				else if(subMenu == 2){
					std = sMng.inputId(scan);   				//서브메뉴가 2이면 학생정보 입력을 받아 객체로 만들고(StdManager.inputId())
					result = sMng.search(std);  				//만들어진 객체와 일치하는 학생의 정보를 가져온다(StdManager.search())
					if(result == null){
						System.out.println("해당 학번 학생이 없습니다.");
					}else if(!result.printSubject()){ 			//해당 학생 객체의 수강과목을 출력하고 (Std.printSubject()메소드 추가
						System.out.println("수강할 강의가 없습니다.");
					}
				}
				break;
				
			case 5: 	break;
			
			default:
				System.out.println("잘못된 메뉴를 선택했습니다.");
			}	
		}while(menu != 5);
		System.out.println("프로그램 종료합니다");
		scan.close();
		
		
		
		
	}

}
