package Day7;

import java.util.Scanner;

public class Day74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		 //4. 콘솔을 통해 3개의 정수를 입력받아 배열에 저장하는 코드를 작성하세요.
	
		Scanner scan =new Scanner(System.in);
		int [] arr = new int [3];
		int i;
		
		for(i=0; i<arr.length; i++){
			arr[i] = scan.nextInt();
			System.out.println("a["+i+"]"+"="+arr[i]);			// 여기를 향상된for문으로 바꿔쓸 수 있음.
		}
	
		// System.out.println(arr[i]);      ===> 여기서 현재 i는 arr.length 범위를 벗어난 숫자이기 때문에 배열 범위에 오류가 발생한다.
		
		scan.close();
		
	}

	
}

