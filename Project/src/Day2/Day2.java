package Day2;
import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//������ �Է¹޾� �Է¹��� ������ ¦������ �ƴ��� Ȯ���ϴ� �ڵ带 �ۼ��ϼ���.
	
		/*Scanner scan= new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num%2==0);*/
		
		//boolean isEven = num %2 ==0;
		//System.out.println(isEven);
		
		//¦��, Ȧ�� ���------------------------------------------------
		/*int num = 10;
		
		if(num % 2 == 0){
			System.out.println("¦��");
		}
		//num�� Ȧ����� �ֿܼ� Ȧ����� ���
		if( num %2 ==1){
			System.out.println("Ȧ��");
		}*/
		
		
		
		/*//if-else��-------------------
		int num = 10;
		
		if(num % 2 == 0){
			System.out.println("¦��");
		}
		//���� ���ǽ��� �����̸�
		else{
			System.out.println("Ȧ��");
		}
*/		
		
		//---------------------------------------------
		
		//���̰� 20�̻��̸� �����̶�� ����ϰ� 20�̸��̸� û�ҳ��̶�� ����ϴ� �ڵ带 �ۼ��ϼ���.
		/*Scanner scan= new Scanner(System.in);
		int age = scan.nextInt();
		
		if(age >= 20){
			System.out.println("����");
		}
		
		else{
			System.out.println("û�ҳ�");
		}
		
		scan.close();*/
		
		//-------------------------------------
		
		//numdl 0�̸� 0�̶�� ����ϰ�, 1�̸� 1�̶�� ����ϰ�
		//0�� 1�� �ƴϸ� 0�� 1�� �ƴմϴٶ�� ����ϴ� ����
		
		/*int num =0;
		
		if(num == 0){
			System.out.println("0�Դϴ�.");
		}
		else if(num ==1){
			System.out.println("1�Դϴ�.");
		}
		//if(num !=0 && num != 1)
		else{
			System.out.println("0��1�� �ƴմϴ�.");
		}*/
		
		
		//-----------------------------------------------
		
		
		//num�� 2�� ����̸� 2�� ������ ����ϴ� ����
		//num�� 2�� �������� ��, �������� 0�� ���ٸ� 2�� ���
		
		/*int num = 3;
		if(num%2 == 0){
			System.out.println(num + "�� ����Դϴ�");
		}*/
		
		//2�� ���, 3�� ���, 6�� ����� ����Ѵ�(��, 6�� 6�� ������ �����)---------------------------------------
		
		/*Scanner scan= new Scanner(System.in);
		int num = scan.nextInt();
		
		
		if( num % 6 == 0 ){
			System.out.println(num +"�� 6�� ����Դϴ�.");
		}
		else if( num % 2 == 0 ){
			System.out.println(num +"�� 2�� ����Դϴ�.");
		}
		else if( num % 3 == 0 ){
			System.out.println(num +"�� 3�� ����Դϴ�.");
		}
		else{
			System.out.println(num + "2,3,6 �� ����� �ƴմϴ�.");
		}
		
		scan.close();*/
		
		
		
		//--------------------------------------------------
		//������ �־����� ������ �´� ������ ����ϴ� �ڵ带 �ۼ��ϼ���
		
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
			System.out.println("�߸��� �����Դϴ�.");
		}
		
		scan.close();*/
		
		
	//--------------------------------------------------
		
		/*int num  = 6;
		
		if(num % 2 == 0 ){
			if(num % 3 == 0){
				System.out.println(num + "�� 6�� ���");
			}else {
				System.out.println(num + "�� 2�� ���");
			}
		
		}else if(num % 3 == 0 ){
				System.out.println(num + "�� 3�� ���");
			}else{
					System.out.println(num+ "�� 2,3,6�� ����� �ƴ�");
				}*/
	
		
		//Ȧ�� ¦�� �Ǻ�------------------------------
		
		/*int num = 3;
		switch(num % 2){
			case 0: //if(num % 2 ==0)
				System.out.println("¦��");
				break;
				
			case 1:
				System.out.println("Ȧ��");
				break;
				
		 
		}*/
		
		
		//�޷��� �� �޸��� ������ �ϼ��� �ٸ��ϴ�.
		//���� �ԷµǸ� ����ϴ� ���� ������ �ϼ��� ����ϴ� �ڵ带 switch case ���� �̿��Ͽ� �ۼ�
		
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
			System.out.println("30��"); break;
		case 4:
		case 6:
		case 8:
			System.out.println("31��"); break;
			
		default:
				System.out.println("�߸� �Է��߽��ϴ�");
			
		}
		 
		scan.close();*/
		
		
		//����������-----------------------------------------
		
		/*int min = 1;
		int max = 3;
		
		//min~max������ ������ �������� �����ϴ� �ڵ�
		//com�� ����(1), ����(2), ��(3) �߿��� �������� �ϳ� ����
		int com =(int)(Math.random()*(max-min+1) + min);
		int user =0;
		 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ��� :>");
		user = scan.nextInt();
		
		switch(user-com){
		case 0:
			System.out.println("���º��Դϴ�.");
			break;
			
		case -1: case 2:
			System.out.println("��ǻ�� ���Դϴ�");
			break;
			
		case 1: case -2: //default:
			System.out.println("����� ���Դϴ�");
			break;
		}
		
		System.out.println(com);
		
		scan.close();*/
		
		//-------------------------------------
		
		/*int i =0; //�ݺ������� ����� ����
		
		for(i=1; i<=5; i++){
			System.out.println("Hello world!");
		}*/
		
		
		//1���� 5���� ����ϴ� �ڵ带 �ݺ����� ���� �ۼ��ϼ���.
		
		/*int i =0;
		for(i=1; i<=5; i++){
			System.out.println(i);
		}*/
	
		
		
		//1���� 10������ ���� ���϶�
	
		/*int sum =0;
		  int i;
	
		for(i=0; i<=10; i++){
			sum= sum + i; // sum += i;
		
		}
		
		System.out.println("1���� 10������ �� :" + sum);*/
		//----------------------------------------------
		
		
		//�������� 7���� ����ϴ� �ڵ带 �ݺ����� �̿��Ͽ� �ۼ��ϼ���
		
		/*int i;
		for(i=1; i<=9; i++){
			System.out.println("7 * "+ i+" = " + 7*i );
		}*/
		
		//---------------------------------------------
		
		
		//������ �Է� �޾� �Է¹��� ������ �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ带 �ݺ����� �̿��Ͽ� �ۼ��ϼ���
		//�Ҽ� : ����� 1�� �ڱ��ڽ��� ��
		//��� : �ڽź��� �۰ų� ���� �� �� ���� ������ �������� 0�� �� 
		
		/*Scanner scan= new Scanner(System.in);
		int num = scan.nextInt();
		
		int i=0;
		int cnt=0;
		
		//�ݺ�Ƚ�� : i�� 1���� num���� �۰ų� ���������� 1�� �����Ѵ�.
		for(i=1; i<=num; i++){
			//i�� num�� ����̸� ����� ������ �ϳ� ����
			//num�� i�� �������� �� �������� 0�� ���� -> i�� num�� ���
			
			if( num % i == 0 ){
				cnt=cnt+1;
			}
			
		}
		
		if(cnt == 2){
			System.out.println(num + "�� �Ҽ��̴�.");
		}	
		else{
				System.out.println(num + "�� �Ҽ��� �ƴϴ�");
				
			}*/
			

		
	}

}
