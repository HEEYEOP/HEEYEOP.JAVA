package Day8;

public class Day86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//메소드 오버로딩의 조건
		//1.매개변수의 갯수가 다르다
		//2.매개변수의 갯수가 같지만 자료형이 다르다.
		
		
		printMultiTables(2,9);
		printMultiTables();
		
		
	}//main ---------------
	
	
	
	public static void printMultiTable (int num){
		
		int multi = 0;
		
		for(int i =1; i<=9; i++){
			multi = num*i;
			System.out.println(num+" * "+i+" = "+ multi);
			
		}
		
		
	}
	
	
	public static void printMultiTables(int start, int end){
		
		for(int i =start; i<=end; i++){
			System.out.println(i+"단");
			printMultiTable(i);
			
		}
	}
	
	
	public static void printMultiTables(){

		printMultiTables(2,9);  // -----> 재귀호출이 아니다.
		

		}
		
	
	
	

}// class꺼 -------------------------
