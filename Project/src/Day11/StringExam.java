package Day11;

import java.util.Scanner;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Hello", str2 = "Hello";
		boolean cmp = str1 == str2;
		System.out.println(cmp);
		
		cmp = str1 != (str2="Hello ");
		System.out.println(cmp);
		
		cmp = str1 != (str2="Hello 1");
		System.out.println(cmp);
		
		str1.equals(str2);
		System.out.println(str1.equals(str2));
		
 
	}

}

