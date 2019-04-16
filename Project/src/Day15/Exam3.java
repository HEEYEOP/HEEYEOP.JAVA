package Day15;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2;
		char op;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하세요");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		op = scan.next().charAt(0);
		
		double res = 0.0; 
		switch(op){
		
			case '+': res = num1 + num2; break;
			case '-': res = num1 - num2; break;
			case '*': res = num1 * num2; break;
			case '/': res =(double) num1 / num2; break;
			case '%': res = num1 % num2; break;
		}
		if(num2 == 0 && (op == '/' || op =='%')){
			System.out.println("0으로 나눌 수 없습니다.");
		}else {
			System.out.println(""+num1+op+num1+"="+res);
		}
		
	}

}
