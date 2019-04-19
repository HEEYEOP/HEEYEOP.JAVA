package Day11;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class StringExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문자열을 입력하세요 : Hello world 
		//찾을 문자열을 입력하세요 : He
		//Hello world에는 He가 있습니다.
		
		Scanner scan = new Scanner(System.in);
		String str = "";
		String searchStr ="";
		String replaceStr = "";
		
		System.out.println("문자열을 입력하세요: ");
		str= scan.nextLine();
		
		System.out.println("교체될 문자열을 입력하세요: ");
		searchStr = scan.nextLine();
		
		System.out.println("교체할 문자열을 입력하세요: ");
		replaceStr = scan.nextLine();

		String newStr = "";
		newStr = str.replaceAll(searchStr, replaceStr);
		if(newStr == str){
			System.out.println("교체될 문자열이 없습니다.");
		}else{
			System.out.println("교체된 문자열: "+ newStr);
		}
		
		scan.close();
		
		/*
		Scanner scan = new Scanner(System.in);
		String str = ""; // String str = new String();
		System.out.println("문자열을 입력하세요: ");
		str= scan.nextLine();
		System.out.println("찾을 문자열을 입력하세요: ");
		String search = scan.nextLine();
		if(str.contains(search)){
			System.out.println(str+"에는"+search+"가 있습니다");
		}else{
			System.out.println(str+"에는"+search+"가 없습니다");
		}
		//---------------------
		if(str.indexOf(search) >= 0){
			System.out.println(str+"에는"+search+"가 있습니다");
		}else{
			System.out.println(str+"에는"+search+"가 없습니다");
		}
		
		
	
		scan.close();*/
		
		
	}

}
