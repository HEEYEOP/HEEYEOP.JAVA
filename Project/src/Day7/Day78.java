package Day7;

public class Day78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// **********  를 출력하는데 재사용성이 높은 메소드를 만드는 예제
		
		printLine(20,'$');
		
		
	}//main


	
	public static void printLine(int cnt, char ch){
		
		for(int i=1; i<=cnt; i++){
			System.out.print(ch);
		}
		System.out.println();
	}
	
	
	
} //class
