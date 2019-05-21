package Day0521;

import java.util.Scanner;

public class calculate {

	public static void main(String[] args) {
		/*산술 연산자를 이용한 계산하는 예제를 메소드를 이용하여 작성하세요 단, 예외처리는 필수
		 * 1. 메소드를 이용하지 않고 산술 연산자를 입력받아 계산하는 예제 작성
		 * 2. 메소드를 이용
		 * 3. 예외처리 
		 */
		int a = 5;
		int b = 10;
		double res = 0;
		
		System.out.print("연산자를 입력하세요 :");
		Scanner scan = new Scanner(System.in);
		char op = scan.next().charAt(0);
		
		
		switch(op){
		case '+' : 
			res = a+b;
			break;
		case '-' : 
			res = a-b;
			break;
		case '/' : 
			res = a/(double)b ;
			break;
		case '*' : 
			res = a*b;
			break;
		case '%' : 
			res = a%b;
			break;
		default :
			System.out.println("잘못된 연산자 입니다.");
		}
		
		System.out.println(res);
		
		

	}

}
