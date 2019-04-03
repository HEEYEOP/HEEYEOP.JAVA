package Day7;

public class Day77 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		
		printMulti(5);
	
		
	}// main 꺼-----------

	//기능      : 
	//매개변수 : 단 수 -> int num
	//리턴타입 : 정수 곱한값 -> int t
	//메소드명 : printMulti
	
	public static void printMulti(int num){
		int i ;
		int t=0;
		
		for(i=1; i<=9; i++){
			t = num*i;
			System.out.println(num+"*"+i+"="+t);
		}
			
	}


	
	
	
	
}//class 꺼
