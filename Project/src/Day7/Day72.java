package Day7;

public class Day72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2. 5개짜리 배열을 생성하고 배열에 0 번지에 5, 1번지에 4, 2번지에 3, 3번지에 2, 4번지에 1을 저장하고 출력하는 코드를 작성하세요.
		
		int i ;
		
		int []arr = new int [5];
		
		for(i =0; i<arr.length; i++){
			
				arr[i] = (5-i);  					//(5-i)를  arr.length로 대체할 수 있음.
				System.out.println("a["+i+"]"+"="+arr[i]);
		
		}
		
		// System.out.println(arr[i]);   			 ===> 여기서 현재 i는 arr.length 범위를 벗어난 숫자이기 때문에 배열 범위에 오류가 발생한다.

		
		
		
		
		 
		
		
		
		
		
	}
	

}




