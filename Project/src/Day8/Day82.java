package Day8;

public class Day82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println((int)calc(1,2,'+'));
		System.out.println(calc(1,2,'-'));
		System.out.println(calc(1,2,'/'));
		System.out.println(calc(1,2,'*'));
		System.out.println(calc(1,2,'%'));
		
	}// main--------

	// 기능 : 두 정수의 산술 연산 결과를 알려주는 메소드
	//매개변수: 두 정수와 산술연산자 -> int num1, num2, char x
	//리턴타입: 연산 결과 -> double 
	//메소드명: calc
	
	public static double calc(int num1, int num2, char op){
		
		
		switch(op){
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '/':
			return (double)num1 / num2;
		case '*':
			return num1 * num2;
		case '%':
			return num1 % num2;
		default:
			return 0.0;
			
		}
		
		
	}
	
	
}// class ----------
