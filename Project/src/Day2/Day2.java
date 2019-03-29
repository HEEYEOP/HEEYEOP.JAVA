package Day2;
import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//정수를 입력받아 입력받은 정수가 짝수인지 아닌지 확인하는 코드를 작성하세요.
	
		/*Scanner scan= new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num%2==0);*/
		
		//boolean isEven = num %2 ==0;
		//System.out.println(isEven);
		
		//짝수, 홀수 출력------------------------------------------------
		/*int num = 10;
		
		if(num % 2 == 0){
			System.out.println("짝수");
		}
		//num가 홀수라면 콘솔에 홀수라고 출력
		if( num %2 ==1){
			System.out.println("홀수");
		}*/
		
		
		
		/*//if-else문-------------------
		int num = 10;
		
		if(num % 2 == 0){
			System.out.println("짝수");
		}
		//위의 조건식이 거짓이면
		else{
			System.out.println("홀수");
		}
*/		
		
		//---------------------------------------------
		
		//나이가 20이상이면 성인이라고 출력하고 20미만이면 청소년이라고 출력하는 코드를 작성하세요.
		/*Scanner scan= new Scanner(System.in);
		int age = scan.nextInt();
		
		if(age >= 20){
			System.out.println("성인");
		}
		
		else{
			System.out.println("청소년");
		}
		
		scan.close();*/
		
		//-------------------------------------
		
		//numdl 0이면 0이라고 출력하고, 1이면 1이라고 출력하고
		//0과 1이 아니면 0과 1이 아닙니다라고 출력하는 예제
		
		/*int num =0;
		
		if(num == 0){
			System.out.println("0입니다.");
		}
		else if(num ==1){
			System.out.println("1입니다.");
		}
		//if(num !=0 && num != 1)
		else{
			System.out.println("0과1이 아닙니다.");
		}*/
		
		
		//-----------------------------------------------
		
		
		//num가 2의 배수이면 2의 배수라고 출력하는 예제
		//num를 2로 나누었을 때, 나머지가 0과 같다면 2의 배수
		
		/*int num = 3;
		if(num%2 == 0){
			System.out.println(num + "는 배수입니다");
		}*/
		
		//2의 배수, 3의 배수, 6의 배수를 출력한다(단, 6은 6의 배수라고 출력함)---------------------------------------
		
		/*Scanner scan= new Scanner(System.in);
		int num = scan.nextInt();
		
		
		if( num % 6 == 0 ){
			System.out.println(num +"는 6의 배수입니다.");
		}
		else if( num % 2 == 0 ){
			System.out.println(num +"는 2의 배수입니다.");
		}
		else if( num % 3 == 0 ){
			System.out.println(num +"는 3의 배수입니다.");
		}
		else{
			System.out.println(num + "2,3,6 의 배수가 아닙니다.");
		}
		
		scan.close();*/
		
		
		
		//--------------------------------------------------
		//점수가 주어지면 점수에 맞는 학점을 출력하는 코드를 작성하세요
		
		/*Scanner scan= new Scanner(System.in);
		float score = scan.nextFloat();
		
		if(score >= 90 && score <= 100){
			System.out.println('A');
		
		}else if(score >= 80 && score < 90){
			System.out.println('B');
		
		}else if(score >= 70 && score < 80){
			System.out.println('C');
		
		}else if(score >= 60 && score < 70){
			System.out.println('D');
		
		}else if(score >= 0 && score < 60){
			System.out.println('F');
		
		}else{
			System.out.println("잘못된 점수입니다.");
		}
		
		scan.close();*/
		
		
	//--------------------------------------------------
		
		/*int num  = 6;
		
		if(num % 2 == 0 ){
			if(num % 3 == 0){
				System.out.println(num + "는 6의 배수");
			}else {
				System.out.println(num + "는 2의 배수");
			}
		
		}else if(num % 3 == 0 ){
				System.out.println(num + "는 3의 배수");
			}else{
					System.out.println(num+ "는 2,3,6의 배수가 아님");
				}*/
	
		
		//홀수 짝수 판별------------------------------
		
		/*int num = 3;
		switch(num % 2){
			case 0: //if(num % 2 ==0)
				System.out.println("짝수");
				break;
				
			case 1:
				System.out.println("홀수");
				break;
				
		 
		}*/
		
		
		//달력의 각 달마다 마지막 일수가 다릅니다.
		//달이 입력되면 행당하는 달의 마지막 일수를 출력하는 코드를 switch case 문을 이용하여 작성
		
		/*Scanner scan= new Scanner(System.in);
		int month = scan.nextInt();
		
		switch(month){
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
		case 12:
			System.out.println("30일"); break;
		case 4:
		case 6:
		case 8:
			System.out.println("31일"); break;
			
		default:
				System.out.println("잘못 입력했습니다");
			
		}
		 
		scan.close();*/
		
		
		//가위바위보-----------------------------------------
		
		/*int min = 1;
		int max = 3;
		
		//min~max사이의 정수를 랜덤으로 생성하는 코드
		//com가 가위(1), 바위(2), 보(3) 중에서 랜덤으로 하나 선택
		int com =(int)(Math.random()*(max-min+1) + min);
		int user =0;
		 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요 :>");
		user = scan.nextInt();
		
		switch(user-com){
		case 0:
			System.out.println("무승부입니다.");
			break;
			
		case -1: case 2:
			System.out.println("컴퓨터 승입니다");
			break;
			
		case 1: case -2: //default:
			System.out.println("사용자 승입니다");
			break;
		}
		
		System.out.println(com);
		
		scan.close();*/
		
		//-------------------------------------
		
		/*int i =0; //반복문에서 사용할 변수
		
		for(i=1; i<=5; i++){
			System.out.println("Hello world!");
		}*/
		
		
		//1에서 5까지 출력하는 코드를 반복문을 통해 작성하세요.
		
		/*int i =0;
		for(i=1; i<=5; i++){
			System.out.println(i);
		}*/
	
		
		
		//1에서 10까지의 합을 구하라
	
		/*int sum =0;
		  int i;
	
		for(i=0; i<=10; i++){
			sum= sum + i; // sum += i;
		
		}
		
		System.out.println("1부터 10까지의 합 :" + sum);*/
		//----------------------------------------------
		
		
		//구구단의 7단을 출력하는 코드를 반복문을 이용하여 작성하세요
		
		/*int i;
		for(i=1; i<=9; i++){
			System.out.println("7 * "+ i+" = " + 7*i );
		}*/
		
		//---------------------------------------------
		
		
		//정수를 입력 받아 입력받은 정수가 소수인지 아닌지 판별하는 코드를 반복문을 이용하여 작성하세요
		//소수 : 약수가 1과 자기자신인 수
		//약수 : 자신보다 작거나 같은 수 중 에서 나누어 나머지가 0인 수 
		
		/*Scanner scan= new Scanner(System.in);
		int num = scan.nextInt();
		
		int i=0;
		int cnt=0;
		
		//반복횟수 : i는 1부터 num보다 작거나 같을때까지 1씩 증가한다.
		for(i=1; i<=num; i++){
			//i가 num의 약수이면 약수의 갯수를 하나 증가
			//num을 i로 나누었을 때 나머지가 0과 같다 -> i가 num의 약수
			
			if( num % i == 0 ){
				cnt=cnt+1;
			}
			
		}
		
		if(cnt == 2){
			System.out.println(num + "는 소수이다.");
		}	
		else{
				System.out.println(num + "는 소수가 아니다");
				
			}*/
			

		
	}

}
