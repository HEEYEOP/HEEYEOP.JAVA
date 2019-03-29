package DAY4;

import java.util.Scanner;

public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//두 정수를 입력받아 두 정수의 합을 출력하는 코드를 작성하시오.
		/*
		Scanner scan= new Scanner(System.in);
		
		System.out.println("두 정수를 입력하시오.");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int sum =0;
		
		sum= num1+num2;
		System.out.println(num1+"과"+num2+"의 합="+sum);
		*/
		
		//----------------------------------------
		
		//두 정수와 산술 연산자를 입력받아 연산 결과를 출력하는 코드를 작성하세요.
		//char op = scan.next().charAt(0);
		
		/*
		Scanner scan= new Scanner(System.in);
		
		System.out.println("두 정수와 연산자를 입력하시오.");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		char op = scan.next().charAt(0);
		
		switch(op){
		case '+':
			System.out.println(num1 + num2);
			//System.out.println(""+num1+op+num2+"="+(num1+num2));
			break;
			
		case '-':
			System.out.println(num1 - num2);
			break;
		
		case '*':
			System.out.println(num1 * num2);
			break;

	
		
		case '/':	
			System.out.println((double)num1 / num2);
			break;
		
			
			//case '/':
			//switch(num2){
			//	case 0:
			//		System.out.println("0으로 나눌 수 없습니다");
			//		 break;
			//	default:
			//			 System.out.println((double)num1 / num2);
			//				
			//			 
			//	}
			//	break;
			//default :
			//	System.out.println(op+"는 잘못된 산술 연산자 입니다.");
			//	break;
				
			
		
		case '%':
			System.out.println(num1 % num2);
			break;
			
		}
		
		scan.close();
		*/
		
		//--------------------------------------------
		
		//1부터 100까지 짝수만 출력하는 코드를 작성하세요.
		/*
		int i =0;
		
		for(i=2; i<=100; i+=2){
			System.out.println(i);
		}
		*/
		
		
		//---다른방법----------------
		/*
		int i;
		
		for(i=1; i<=100; i++){
			if(i%2==1){
				continue;
			}
			System.out.println(i);
		}
		*/
		
		//-----------------------------
		
		//두 수의 공약수를 출력하는 코드를 작성하세요
		/*
		int num1 =8, num2 =12;
		int i, gcd = 0;
	
		for(i=1; i<=num1; i++){
			if(num1 % i == 0 && num2 % i == 0){
				gcd = i;
				System.out.println(num1+ " 과 "+ num2+ "공약수 :" +gcd);
			}
			
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
