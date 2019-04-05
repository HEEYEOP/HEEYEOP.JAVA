package Day8;

public class Day83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	printMultiTables(2,4);
	
	
	} //main꺼-------------
	
	//기능 : 단( 구구단 ) 을 출력하는 예제 
	//매개변수 : 단 -> int num
	//리턴타입 : 없음 -> void
	//메소드명 : printMultiTable

	public static void printMultiTable (int num){
		
		int multi = 0;
		
		for(int i =1; i<=9; i++){
			multi = num*i;
			System.out.println(num+" * "+i+" = "+ multi);
		}
	}
	
	// 기능 : start단에서 end단을 출력하는 기능
	//매개변수 : int start , int end
	//리턴타입 : void
	//메소드명 : printMultiTables
	
	public static void printMultiTables(int start, int end){
		
		for(int i =start; i<=end; i++){
			System.out.println(i+"단");
			printMultiTable(i);
			
		}
	}
	
	
	
	// ----------오류가 발생하는 경우---------
	
	//메소드에서 리턴값이 있을 때 구현 시 유의사항
	//조건문을 통해 return하는 경우나 반복문안에서 return을 할 경우 조심해야한다.
	//조건문을 통해 return할 경우 조건문이 거짓인 경우를 고려해야한다.
	//반복문안에서 return을 할 경우 반복문 조건이 거짓이 되어 반복문이 실행되지 않을 경우를 고려해야한다.
	
	
	public static int test1(){
		int r = 0;
		
		for(int i =1; i<=9; i++){
			r += i;
			return r;
		}
		//반복문이 무조건 실행되서 리턴이 되는 경우가 하더라도 자바 컴파일러는
		//세세한 내용까지 검사하지 않기 때문에 반복문이 종료 됐을 경우 리턴도 설정해주어야한다.
		return 0;
	}
	
	/*
	public static int test(int num){
		
		if(num >= 0) return 1;
		
		else if(num<0) return -1;   // 오류 발생  -----> else return -1; 로 변경하면 오류를 잡을 수 있음.
		
		
	}
	 */
	
	
	
	
}// class꺼 ----------------------


