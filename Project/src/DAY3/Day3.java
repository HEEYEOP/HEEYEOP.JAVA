package DAY3;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1���� 5������ ���� ���ϴ� �ڵ带 �ݺ����� �̟G�Ͽ� �ۼ�
		
				/*int i;
				int sum=0;
				for(i=1; i<=5; i++){
					sum= sum +i;
				}
				System.out.println(sum);*/
				
				//1���� 10���� ¦���� ���� ���ϴ� �ڵ带 �ݺ����� �̿��Ͽ� �ۼ�
				//���1: 1���� 10���� �ϳ��� �����ϸ鼭 ¦���̸� ���Ѵ�------------
				
				/*int i;
				int sum=0;
				
				for(i=0; i<=10; i++){
					if(i % 2 == 0 ){
						sum =sum+i;
					}
				}
					System.out.println("���1:" +sum);*/
				
				//���2 : 2���� 10���� 2���� �����ϸ鼭 ���Ѵ�
				
				/*int i;
				int sum =0;
				
				for(i=2; i<=10; i+=2){
					sum =sum+i;
				}
					
				System.out.println("���2:" +sum);*/
				
				//���3 :1���� 5���� �ϳ��� �����ϸ鼭 �ش���� 2�� ���� ���Ѵ� --------
				
				/*int i;
				int sum=0;
				
				for(i=1; i<=5; i++){
					sum += (i*2);
					
				}
				System.out.println("���3:"+sum);*/
		
		//-----------------------------------------------
		
		
		//�� ���� �ִ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���
		/*int num1 =8, num2 =12;
		int i, gcd = 0;
	
		for(i=1; i<=num1; i++){
			if(num1 % i == 0 && num2 % i == 0){
				gcd = i;
				System.out.println(num1+ " �� "+ num2+ "����� :" +gcd);
			}
			
		}
		System.out.println(num1+" �� "+num2+" �ִ����� :" +gcd);*/
		
		
		
		//���μұ��ϴ� ����------------------------------
		/*int num1 =3, num2 = 7;
		int i, gcd =0;
		
		for(i=1; i<=num1; i++){
			if(num1 % i == 0 && num2 % i == 0){
				gcd = i;
		}
			
		}	if(gcd == 1){
				System.out.println(num1+"��"+ num2+"�� ���μ� �Դϴ�");
			}else{
				System.out.println(num1+"��"+ num2+"�� ���� ���μҰ� �ƴմϴ�");
			}*/
		
		
		//�� ���� �ּ� ������� ���ϴ� �ڵ带 �ۼ��϶�------------
		
		/*int num1 =10 ,num2 =15;
		int i , lcm =0;
		
		for(i=1; i<=num1*num2; i++){
			
			if(i % num1 == 0 && i % num2 ==0){
					lcm = i;
					break;
			}
			
			
		}
		System.out.println(num1+"��"+ num2+"�� �ּҰ������:"+lcm);*/
		
		//ȿ�����ڵ�-------------------
		/*int num1 =10 ,num2 =15;
		int i ,tmp,  lcm =0;
		
		if(num2> num1){
			//�� ���� �ٲ۴�.
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
		
		System.out.println(num1+"��"+ num2+"�� �ּҰ������:"+lcm); */
		
		//------------------------------------------------
		
		//������ ��ü�� ����ϴ� �ڵ带 �ۼ��ϼ���.
		/*int num ;
		int i;
		
		for(num=2; num<=9; num++){
			System.out.println(num+"��");
			
			for(i=1; i<=9; i++){
			System.out.println(num+"*"+i+"="+num*i);
			}
		
		}*/
		
		
		//����� (���� �ټ��� ���� ������)
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
		
		
		//�� ž���-----------------------------
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

		
		
		
		//�� ž ����־����---------------------------
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
		
		
		
	    // �� Ʈ�� �����--------------------------
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
		
	
		
		
		//��ž �Ųٷ� ���
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
