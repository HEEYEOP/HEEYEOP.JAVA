package Day9;

import Day8.Day82;
import Day8.Day86;

public class Day92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// 다른 패키지에 있는 클래스 멤버 메소드를 불러와서 사용하는 것을 테스트 함
		
		
		String []s = new String[3];
		Day91.main(s);
		
		Day86.printMultiTables(2,3);
		
		double res = Day82.calc(1,2,'+');
		System.out.println(res);
		
	}
}
