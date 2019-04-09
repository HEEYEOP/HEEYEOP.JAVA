package Day11;

import java.util.Scanner;

public class StringExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String str = "";
		
		System.out.println("문자열을 입력하세요: ");
		str= scan.nextLine();
		
		System.out.println("교체될 문자열을 입력하세요: ");
		String search = scan.nextLine();
		
		System.out.println("교체할 문자열을 입력하세요: ");
		String a = scan.nextLine();
		
		str =str.replaceAll(search, a);
		System.out.println(str);

		
		
	}

}
