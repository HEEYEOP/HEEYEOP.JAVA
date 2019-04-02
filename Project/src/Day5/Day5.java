package Day5;

import java.util.Scanner;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//중첩반복문에서 break
		
		/*
		int i,j;
		for(i=0; ; i++){
			if(i>3){
				break;
			}
			for(j=0; ; j++){
				if(j>5){
						break;
						
				}
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//-------------------------------------
		
		// 초기화;
		// while(조건식) {
		//		 실행문;
		//	 	 증감연산;
		//	}	
		
		//1부터 10까지의 합
		
		/*
		int i, sum;
		i=0;
		sum=0;
		
		while( i <= 10 ){
			sum +=i;
			i++;
		
		}
		System.out.println(sum);
		 */
		
		
		
		//for, while : 조건식에 따라 한번도 실행되지 않을 수 있다.
		//do while : 조건식에 따라 무조건 1번은 실행 된다.
		// do{
		//		실행문;
		//  }while(조건식);     //  while문끝에 ' ; ' 필요
		
		/*
		int menu;
		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.println("메뉴");
			System.out.println("1. 학생정보 추가");
			System.out.println("2. 학생정보 수정");
			System.out.println("종료");
			System.out.println("메뉴를 선택하세요");
			
			menu = scan.nextInt();
			
		}while( menu != 5);
		scan.close();
		*/
		
		//------------------------------------------
		
		
		
		//배열 : 같은 의미를 가지는 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것.
		
		//배열의 장점 : 물리적으로 연속된 공간으로 배열을 생성하기 때문에 접근이 빠르다.
		
		//배열의 선언 :  자료형 [] 배열이름;
		//배열의 생성 :  배열이름 = new 자료형[배열의 크기];
		
		//배열의 선언2 :  자료형 배열이름[];
		//배열의 생성2 :  배열이름 = new 자료형[배열의 크기];
		
		//배열의 시작 번지는 0번지부터이다.
		//배열의 마지막 번지는 (배열의크기 -1) 번지 까지 이다.
		
		//배열은 주로 반복문과 사용된다.
		//잘못된 번지로 접근하면 예외가 발생한다.
		// => ArrayIndexOutOfBoundsException
		
		//배열이름.length : 배열의 크기를 알려줌.
		//자료형 [] 배열이름 = new int[]{값1, 값2, 값3 ...};
		//자료형 [] 배열이름 = {값1, 값2, 값3 ...};
				

		/*
		int [] kor;
		kor = new int[10]; //int [] kor = new int[10];
		kor[0] = 10;
		System.out.println(kor[0]);
		System.out.println(kor[9]);
		//System.out.println(kor[10]);	//예외 발생
		
		int i;
		
		Scanner scan =new Scanner(System.in);
		for(i=0; i<3; i++){
			kor[i] = scan.nextInt();
		}
		
		for(i=0; i<kor.length; i++){
			System.out.println(i+"번지:" + kor[i]);
		}
		
	
		scan.close();
		
	
	
		int [] eng;
		eng = kor;
		
		for(i=0; i<eng.length; i++){
			System.out.println(i+"번지:" + eng[i]);
		}
		eng[9] = 100;
		for(i=0; i<eng.length; i++){
			System.out.println(i+"번지:" + kor[i]);
		}
		
		//배열 복사----
		eng = new int[10];		//eng배열생성
		for(i=0; i<eng.length; i++){
			eng[i] = kor[i];		//kor배열의 값을  eng배열에 복사
		}
		*/
		
		
		//---------------------------------------------------------------
		
		
		// 7개의 정수형 배열을 생성하고 0번지에는 0, 1번지에는 1, 6번지에는 6을 넣는 코드를 작성하세요.
		
		/*
		int i;
		int [] a;
		a = new int[7];
		
		for(i=0; i<a.length; i++){
			a[i] = i;
			//System.out.println(i+"번지:" + a[i]);
		}
		*/
		
		//------------------------------------------------------------
		
		
		// 7개를 저장할 수 있는 정수형 배열을 생성하고,
		// 각 번지에 1~45사이의 랜덤한 수를 생성하여 저장하는 코드를 작성하세요.
		// int com =(int)(Math.random()*(max-min+1) + min);
		
		/*
		int i;
		int r=0;
		int [] a;
		a = new int[7];
		
		for(i=0; i<a.length; i++){
			
			r = (int)(Math.random()*(45)+1);
			a[i] = r;
			
			System.out.println(i+"번지:" + a[i]);
		}
		*/
		
		//-------------------------------------------------------
		
		//변수의 유효 범위
		//일반 변수는 선언되면 해당 변수를 감싸고 있는 괄호안에서 유효하다.
		
		/*
		for(int i=0; i<10; i++){
			System.out.println(i); // i는 반복문 안에서만 사용할 수 있다.
		}
		*/
		
		//--------------------------------------------------
		
		
		//배열 검색----------------------------------------------
		
		/*
		int [] arr = new int[5];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = i;
			
		}
		int search = 5;
		//배열 : 0 1 2 3 4 
		
		//배열에 있는 모든 값을 확인하여 배열의 값과 검색값이 같으면 find를 true로 변경 후 반복문을 종료, 없으면 계속 진행
		
		//변수  search의 값이 배열arr에 있는지 없는지를 나타내는 변수
		boolean find = false;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == search){
				find = true;
				break;
			}
			
		}
		if(find){
			System.out.println("배열에는"+ search +"가 있습니다.");
		
		}else{
			System.out.println("배열에는"+ search +"가 없습니다.");
		}
		*/
		
		//--------------------------------------------
		
		
		//로또 번호 생성기
		//로또 번호는 1~45사이의 랜덤한 수가 중복되지 않도록 7개 생성
		//1. 로또 배열을 생성하여 각 번지에 0~6을 순차적으로 저장
		//2. 로또 배열을 생성하여 각 번지에 1~45 사이의 랜덤한 수를 저장.
		//3. 배열에 해당 값이 있는지 없는지 검색
		//4. 로또 배열에 1~45사이의 중복되지 않은 랜덤한 수를 저장.
		
		//1.랜덤한 수를 생성
		//2. 생성된 수가 배열에 있는지 없는지 검색
		//3. 없으면 생성된 수를 배열에 저장, I를 증가
		//4. 있으면 아무일도 하지 않는다.
		
		/*
		int i;
		
		int [] arr;
		arr = new int[7];
		
		for(i=0; i<arr.length; ){	//증감연산 밑으로 빠져버림
			
			int r = (int)(Math.random()*(7)+1);
			
			boolean find= false;
			
			for(int j=0; j<arr.length; j++){
				if(arr[j] == r){
					find = true;
					break;
				}
				
			}
			if(!find){ 			//find==false
				arr[i] = r;
				i++;
			
			}		
		}
		
		for(int k=0; k<arr.length; k++){
			System.out.println(arr[k]);
		}
		*/
		
		//-----------------------------------------
		
		// 임시비밀번호------------
		// a~z, A~Z, 0~9로 조합된 9자리의 임시 비밀번호 발급하는 예제
		
		// a~z : 26개 , A~Z : 26개, 0~9 : 10개
		// 62개 , 0~61
		// 0~9 : '0'~'9'
		// 10~35 : 'a'~'z'
		// 36~61 : 'A'~'Z'
		// 랜덤한 수가 60 : 'Y'
		
		
		/*
		char [] pw = new char[8];
		
		for(int i=0; i<pw.length; i++ ){	//증감연산 밑으로 빠져버림
			
			int r = (int)(Math.random()*62);
			if(r <= 9){
				//문자 + 문지 = 정수
				//문자 = 정수;  //(블가능)
				//문자 = (char)정수; //(가능)
				pw[i] =(char)('0'+ r);
			}else if( r <= 35){
				pw[i] = (char)('a'+(r-10));
			}else{
				pw[i] = (char)('A'+(r-36));
			}
		}
			System.out.println(pw);
		*/
		
		//-----------------------------------
		
		//abcd...z 츨력
		
		/*
		int numA = 'a';
		int numB = 'b';
		
		//문자 a에 대한 유니코드 정수값 :97
		System.out.println(numA);
		//문자 b에 대한 유니코드 정수값 :98
		System.out.println(numB);
		
		numA ='A';
		numB ='B';
		
		//문자 A에 대한 유니코드 정수값 :65
		System.out.println(numA);
		//문자 B에 대한 유니코드 정수값 :66
		System.out.println(numB);
		
		int num =100;	// 'd'
		System.out.println((char)num);
		
		//97이 a라는 것을 이용하여 a~z까지 출력하는 예제
		for(int i =97; i<=97+25; i++){
			System.out.print((char)i);
		}
		
		System.out.println();
		
		//'a'부터 'z'까지 출략하는 예제
		for(int i ='a'; i<='z'; i++){
			System.out.print((char)i);
		}
		
		System.out.println();
		
		for(int i =0; i<=25; i++){
			System.out.print((char)('a'+i));
		}
		*/
		
		
		//---------------------------------------
		
		/*
		int []arr1, arr2;
		int arr3[], arr4;
		arr1 = new int [3];		//배열
		arr2 = new int [3];		//배열	
		arr3 = new int [3];		//배열
		
		//arr4 = new int [3];	//변수 arr4 -> int
		*/
		
		//--------------------------------------------
		
		
		//두 수의 공약수들을 배열에 저장하여 출력하는 코드를 작성하세요.
		//공약수는 최대 10개까지 저장
		
		/*
		int num1 =8, num2 =12;
		int i = 0;
		int []arr = new int [10];
		int cnt =0;
		
		for(i=1; i<=num1; i++){
			
			if(cnt == 10){
				break;
			}
			
			if(num1 % i == 0 && num2 % i == 0){
				
				arr[cnt] = i;
				cnt++;	//공약수 갯수를 하나 증가	
			}
		
		}
		for(int j=0; j<cnt; j++){
			System.out.print(arr[j]+" ");
		}
		*/
		
		//--------------------------------------------------
		
		// 향상된 for문
		// 1. 배열의 모든 값들을 확인한다
		// 2. 배열의 값을 수정할때에는 사용 불가

		//for(자료형 변수명 :배열이름){
		//			실행문;
		//	}
		//자료형은 배열과 같은 자료형을 써야 한다.
		
		/*
		int [] num = new int[]{1,2,3,4,5};
		boolean find = false;
		int search = 3;
		for(int tmp : num){
			if(tmp == search){
				find = true;
				break;
			}
		}
		
		if(find){
			System.out.println("있음");
		}else{
			System.out.println("없음");
		}
		*/
		
		//-----------------------------------
		
		// 버블정렬 : 단순하고 효율이 가장 안 좋다.
		
		/*
		int [] arr = new int [] {1,3,5,7,9,2,4,6,8,};
		
		//반복 횟수 : (배열의 크기 - 1)
		for(int i =0; i<arr.length-1-i; i++){
			for(int j=0; j<arr.length-1; j++){
				if(arr[j] > arr[j+1]){		//오름차순
					int tmp  = arr[j];
					arr[j]   = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int i =0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		*/
		
		
		
		
		
		
		
		
		
		
		
				
				
				
		
		
	}

}
