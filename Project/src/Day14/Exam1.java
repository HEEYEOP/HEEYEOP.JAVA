package Day14;

public class Exam1 {	//예외 처리

	public static void main(String[] args) {
		
		try {
			System.out.println(calc(1.0,0.0,'/'));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

		/*
		int num = 0;
		try{								//예외처리하면 프로그램 중단되는 것없이 실행할 수 있고 어디서 예외가 발생했는지 알 수 있다.
			num = 1/0;
		}catch(ArithmeticException e){
			System.out.println("계산 관련 예외가 발생했습니다.");
			e.printStackTrace();			//예외가 발생한 순서들을 찍어보겠다.
		
		}catch(Exception e){
			e.printStackTrace();			//프로그램 중단없이 실행 후 예외발생 상황을 함께 출력한다.
		}
	
		System.out.println(num);
		 */
	}
	public static double calc(double num1, double num2, char op) throws Exception, ArithmeticException{
		
		double res =0.0;
		if((op == '/' || op == '%') && num2 == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");		//throw를 하면 리턴을 안함( throw이후의 코드는 실행하지 않음)
		
		switch(op){
		case '+': res = num1 + num2; break;
		case '-': res = num1 - num2; break;
		case '*': res = num1 * num2; break;
		case '/': res = num1 / num2; break;
		case '%': res = num1 % num2; break;
		default	: throw new Exception("잘못된 연산자입니다.");
		}
		return res;
	}

}
