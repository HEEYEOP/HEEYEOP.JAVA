package Day9;

//다른 패키지에 있는 public 클래스를 사용하려면
//import 패키지.클래스;
//을 선언해야 해당 클래스를 사용할 수 있다

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Day91 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//nextInt()는 Scanner클래스의 멤버 메소드
		//int num = scan.nextInt();
		//next()는 Scanner클래스의 멤버 메소드
		//charAt()는 String클래스의 멤버 메소드
		//char ch = scan.next().charAt(0); 							//체이닝기법
		scan.close();
		
		//-----------------------------------------------------------
		
		
		Tv tv = new Tv();
		tv.printChannel();
		
		Tv tv2 = new Tv();
		tv2.printChannel();
		
		Tv tv3 = tv;
		
		System.out.println(Tv.BRAND);
		//Tv.BRAND ="삼성";
		System.out.println(tv.BRAND);
		System.out.println(tv2.BRAND);
		
		
	}//main꺼-----

	
	
}//class꺼 -----

//같은 패키지에서 동일한 클래스를 선언할 수 없다.
/*
class Tv{
	
}
*/