package Day14;

import java.util.Scanner;

public class Exam3 { //복소수 계산기 1

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int real1, img1;
		int real2, img2;
		
		System.out.print("복소수 1의 실수부 :");
		real1 = scan.nextInt();
		System.out.print("복소수 1의 허수부 :");
		img1 = scan.nextInt();
		System.out.print("복소수 2의 실수부 :");
		real2 = scan.nextInt();
		System.out.print("복소수 2의 허수부 :");
		img2 = scan.nextInt();
		
		int real3 = real1 + real2;
		int img3 = img1 + img2;
		int real4 = real1 - real2;
		int img4 = img1 - img2;
		
		System.out.println(ComplexityToString(real1, img1)+"+"
		+ComplexityToString(real2, img2)+"="
		+ComplexityToString(real3, img3));
		
		System.out.println(ComplexityToString(real1, img1)+"-"
				+ComplexityToString(real2, img2)+"="
				+ComplexityToString(real4, img4));
		
	}
	
	
	
	//기능 : 두 정수(a,b)를 복소수 형태(a+bi) 의 문자열로 반환하는 기능
	//매개변수 : 두정수 -> int real, int img
	//리턴타입 : 복소수형태의 문자열 -> String
	//메소드명 : ComplexityToString
	public static String ComplexityToString(int real, int img){
		String str="";
		
		if(real != 0)
			str += real;
		
		
		if(img > 1)
			str += "+"+img+"i";
		else if(img == 1)
			str += "+i)";
		else if(img<0)
			str += img+"i";
		
		if(real != 0 || img != 0)
		str = "("+str+")";
		return str;
	}
}
