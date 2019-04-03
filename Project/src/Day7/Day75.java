package Day7;

public class Day75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//에러내용 : The local variable '@@@' may not have been initialized
		//에러원인 : 지역변수를 초기화 하지 않고 사용하는 경우
		//해결방법 : 해당 지역변수를 초기화한다.
		
		int num;
		//System.out.println(num);				===> 에러발생 1
	
	
		//에러내용 : num2 cannot be resolved to a variable
		//에러원인 : 변수를 선언하지 않고 사용하는 경우
		//해결방법 : 변수를 선언한다.
		
		//System.out.println(num2);				===> 에러발생 2
		
		
		//에러내용 :
		//에러원인 : 0으로 나누었을 경우
		//해결방법 : 0으로 나누는 상황을 피한다.
		//int num3 = 1/0 ; 						===> 에러발생 3
	
		
		//에러내용 : java.lang.ArrayIndexOutOfBoundsException: @@
		//에러원인 : 배열의 유효하지 않는 번지로 접근하는 경우
		//해결방법 : 배열의 유효한 번지로 접근한다.
		int []arr = new int[5];
		//arr[5] = 1;							===>에러발생 4
		
		
		//에러내용 : Syntax error, insert "}" to complete ClassBody
		//에러원인 : } 실수
		//해결방법 : }의 짝을 맞춘다
		
		//for(int i=0; i<5; i++){				===> 에러발생 5
		
		
		
		
	
	
	
	}

}
