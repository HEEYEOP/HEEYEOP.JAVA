package Day8;

public class Day81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res = sum(1,2);
		System.out.println(res);
		
		
		// sum(1,2); 의 값이 3이라고해서 3;와 같지는 않다
		//sum(1,2);			===>의미없다.
		
	} // main꺼 -------------------

	
	// 기능 : 두 정수의 합을 알려주는 메소드
	// 매개변수 : 두 정수 -> int num1, int num2
	// 리턴타입 : 합한 값 -> int
	// 메소드명 : sum
	
	public static int sum(int num1, int num2){
		int res = num1 + num2;
		return res;
	}
	
	
	
	
}// class꺼 --------------------------
