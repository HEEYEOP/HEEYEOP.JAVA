package DAY3;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1부터 5까지의 합을 구하는 코드를 반복문을 이욯하여 작성
		
				/*int i;
				int sum=0;
				for(i=1; i<=5; i++){
					sum= sum +i;
				}
				System.out.println(sum);*/
				
				//1부터 10까지 짝수의 합을 구하는 코드를 반복문을 이용하여 작성
				//방법1: 1부터 10까지 하나씩 증가하면서 짝수이면 더한다------------
				
				/*int i;
				int sum=0;
				
				for(i=0; i<=10; i++){
					if(i % 2 == 0 ){
						sum =sum+i;
					}
				}
					System.out.println("방법1:" +sum);*/
				
				//방법2 : 2부터 10까지 2개씩 증가하면서 더한다
				
				/*int i;
				int sum =0;
				
				for(i=2; i<=10; i+=2){
					sum =sum+i;
				}
					
				System.out.println("방법2:" +sum);*/
				
				//방법3 :1부터 5까지 하나씩 증가하면서 해당수에 2를 곱해 더한다 --------
				
				/*int i;
				int sum=0;
				
				for(i=1; i<=5; i++){
					sum += (i*2);
					
				}
				System.out.println("방법3:"+sum);*/
		
		//-----------------------------------------------
		
		
		//두 수의 최대 공약수를 구하는 코드를 작성하세요
		/*int num1 =8, num2 =12;
		int i, gcd = 0;
	
		for(i=1; i<=num1; i++){
			if(num1 % i == 0 && num2 % i == 0){
				gcd = i;
				System.out.println(num1+ " 과 "+ num2+ "공약수 :" +gcd);
			}
			
		}
		System.out.println(num1+" 과 "+num2+" 최대공약수 :" +gcd);*/
		
		
		
		//서로소구하는 문제------------------------------
		/*int num1 =3, num2 = 7;
		int i, gcd =0;
		
		for(i=1; i<=num1; i++){
			if(num1 % i == 0 && num2 % i == 0){
				gcd = i;
		}
			
		}	if(gcd == 1){
				System.out.println(num1+"과"+ num2+"는 서로소 입니다");
			}else{
				System.out.println(num1+"과"+ num2+"두 수는 서로소가 아닙니다");
			}*/
		
		
		//두 수의 최소 공배수를 구하는 코드를 작성하라------------
		
		/*int num1 =10 ,num2 =15;
		int i , lcm =0;
		
		for(i=1; i<=num1*num2; i++){
			
			if(i % num1 == 0 && i % num2 ==0){
					lcm = i;
					break;
			}
			
			
		}
		System.out.println(num1+"과"+ num2+"의 최소공배수는:"+lcm);*/
		
		//효울적코드-------------------
		/*int num1 =10 ,num2 =15;
		int i ,tmp,  lcm =0;
		
		if(num2> num1){
			//두 수를 바꾼다.
			tmp  = num2;
			num2 = num1;
			num1 = tmp;
		}
		for(i=num1; i<=num1*num2; i+=num1){
			
			if(i % num2 ==0){
					lcm = i;
					break;
			}
			
			
		}
		
		System.out.println(num1+"과"+ num2+"의 최소공배수는:"+lcm); */
		
		//------------------------------------------------
		
		//구구단 전체를 출력하는 코드를 작성하세요.
		/*int num ;
		int i;
		
		for(num=2; num<=9; num++){
			System.out.println(num+"단");
			
			for(i=1; i<=9; i++){
			System.out.println(num+"*"+i+"="+num*i);
			}
		
		}*/
		
		
		//별찍기 (가로 다섯개 세로 여섯줄)
		//*****
		//*****
		//*****
		//*****
		//*****
		//*****
		
		/*
		int i, b;
		for(i=1; i<=6; i++){
			
			for(b=1; b<=5; b++){
				System.out.print("*");
				
			}
			System.out.println();
		}
		*/
		
		
		//별 탑찍기-----------------------------
		//*
		//**
		//***
		//****
		//*****
		//******

		/*
		int i,b;
		for(i =1; i<=6; i++){
			for(b=1; b<=i; b++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/

		
		
		
		//별 탑 공백넣어찍기---------------------------
		//     *
		//    **
		//   ***
		//  ****
		// *****
		//******
		
		/*
		int i,b,t ;
		for(i =1; i<=6; i++){
			for(t=6-i; t>=0; t--){ //for(b=1; b<=6-i; b++)
				System.out.print(" ");
			}
			for(b=1; b<=i; b++){
				System.out.print("*");
				
			}
			System.out.println();
		}
		*/
		
		
		
	    // 별 트리 만들기--------------------------
		//    *
		//   ***
		//  *****
		// *******
		//*********
	
		/*
		int i, j, s;
		for(i=1; i<=5; i++){
			for(j=1; j<=5-i; j++){
				System.out.print(" ");
			}
			for(s=1; s<=2*i-1; s+=1){
				System.out.print("*");
			}
			System.out.println();
		}
	*/
		//---------------------------
		/*
		int i,j,s;
		for(i=1; i<=5; i++){
			for(j=1; j<=5-i; j++){
				System.out.print(" ");
			}
			for(s=1; s<=i; s+=1){
				System.out.print("*");
			}
			for(j=1; j<=i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
	
		
		
		//별탑 거꾸로 찍기
		//******
		//*****
		//****
		//***
		//**
		//*
	
		
		/*
		int i,b,t ;
		for(i =1; i<=7; i++){
			for(b=1; b<=7-i; b++){
				System.out.print("*");
				
			}
			System.out.println();
		}
		*/
	
	

		
		
		//------------------------
		//******
		// *****
		//  ****
		//   ***
		//    **
		//     *
		
		
		/*
		int i,b,t ;
		for(i =1; i<=7; i++){
			for(t=1; t<=i-1; t++){
				System.out.print(" ");
			}
			for(b=1; b<=7-i; b++){
				System.out.print("*");
				
			}
			System.out.println();
		}
		*/
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
