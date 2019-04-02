package Day6;

public class Day64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(calc(1,5,'+'));
		double res = calc(1,5,'-');
		System.out.println(res);
		
	} //	main 꺼 ------------------------------

	
	//기능 : 두 정수와 산술연산자가 주어졌을 때 연산 결과를 알려주는 메소드
	//매개변수 : 두 정수와 산술연산자 => int num1, int num2, char op
	//리턴타입 : 계산결과 ->double
	//메소드명 : calc
	
	public static double calc(int num1, int num2, char op){
		
		double t =0.0;
		
		switch(op){
		
		case '+' :
			t = num1+num2;
			break;
			
		case '-' :
			t = num1-num2;
			break;
			
		case '/' :
			t = num1/(double)num2;
			break;
			
		case '*' :
			t = num1*num2;
			break;
		
		case '%' :
			t = num1%num2;
			break;
		}
		
		return t;
	
	}
	
	
	
	
} //	class꺼 
