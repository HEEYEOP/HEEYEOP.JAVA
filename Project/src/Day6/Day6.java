package Day6;

public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// sum()메소드가 printSum()메소드보다 재사용성이 높다
		System.out.println(sum(1,2));
		printSum(1,2);
		
	}// main함수꺼
	
	//-------------------------------------------
	

	// 리턴타입 메소드명(매개변수){
	//	 	구현;
	// }
	
	public static int sum(int num1, int num2){
		
		int res = num1 + num2;
		return res;
		
	}
	//--------------------------------------
	
	
	// 기능 : 두 수의 합을 콘솔에 출력하는 기능
	// 입력 : 두 정수 -> int num1, int num2
	// 출력 : 없다 -> void
	// 이름 : printSum
	
	public static void printSum(int num1, int num2){
		
		System.out.println(num1+num2);
	}
	
	
	
	
	
}// class 꺼
