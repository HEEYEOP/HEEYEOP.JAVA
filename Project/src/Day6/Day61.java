package Day6;

public class Day61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num1 =10, num2 = 15;
		int gcdNum = 1;
		
		 
		
		gcdNum = gcd(num1, num2);
		
		System.out.println(num1 +"과"+num2+"의 최대공약수:"+gcdNum);
		System.out.println(num1 +"과"+num2+"의 최소공배수:"+lcm(num1,num2));
		
		                 
	}//main꺼

	// 메서드의 구현위치는 클래스 안에 구현을 한다.
	// 다른 메소드 안에서 구현할 수 없다.
	// 메소드는 다른 메소드안에서 호출되어야 한다.
	// 메소드를 테스트하기 위해서는 main메소드에서 호출해야 한다.
	
	//----------------------------------------------------------
	
	// 기능 : 두 정수가 주어지면 두 정수의 최대 공약수를 알려주는 메소드
	// 리턴타입(출력) : 최대공약수 -> 정수 -> int 
	// 매개변수(입력) : 두 정수 -> int num1, int num2
	// 메소드명 : gcd
	
	public static int gcd(int num1, int num2){
		int gcdNum = 0;
		
		for(int i=1; i <= num1; i++){
			
			if(num1 % i == 0 && num2 % i ==0){
				gcdNum = i ;	
			}
		}
		return gcdNum;
	}
	
	//---------------------------------------------------------
	// 기능 : 두 정수가 주어지면 두 정수의 최소 공배수를 알려주는 메소드
	//		 최소공배수는 두 수의 곱에 최대공약수로 나눈 값이다.
	// 리턴타입(출력) : 최소공배수 -> 정수 -> int 
	// 매개변수(입력) : 두 정수 -> int num1, int num2
	// 메소드명 : lcm
	
	
	public static int lcm(int num1, int num2){
		return num1*num2/gcd(num1, num2);
	}
	
	 
	
	
}//class꺼
