package Day8;

import java.util.Scanner;

public class Day833 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		printDan(5);
		
		
	} //main 꺼 -------------------------

	
	public static void printOne(int num1, int num2){
		System.out.println(num1+"*"+num2+"="+(num1*num2)); 
	}
	
	public static void printDan(int dan){
		for(int i =1; i<=9; i++){
			printOne(dan,i);
		}
	}
	
	
	
} //class꺼 ------------------------
