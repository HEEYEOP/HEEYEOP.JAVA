package Day13;

public class ForExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//구구단 전체를 출력하는 코드를 작성하세요.
		int i,j ;
		
		for(i=2; i<=9; i++){
			for(j=1; j<=9; j++){
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
		*/
		

		int arr[] = new int[]{1,3,9,5,7,2,4,6,8};
		
		//1.다음 배열의 모든 값을 출력하는 코드를 작성하세요.------------------------------------------------------
		
		/*			
		//향상된 for문 사용조건 	1.배열이나 컬렉션프레임워크 일 때 사용 		2.배열의 값을 확인할 때 사용	3.배열의 값을 수정할때는 사용하지 않음.	4.모든 배열을 확인하면서 번지를 신경안쓸때
		
		for(int tmp : arr){
			System.out.print(tmp +" ");
		}
		
		//-------------------------------------
		
		
		
		for(int i =0; i<arr.length; i++){
				int t = arr[i];
				System.out.println("arr["+i+"]"+"="+t);
		}
		*/
		
		
		//2. 위의 배열에서 짝수번지에 있는 값을 출력하세요.------------------------------------------------------
		/*
		for(int j=0; j<arr.length; j+=2){
			t = arr[j];
			System.out.println("arr["+j+"]"+"="+t);
		}
		*/
		
		//3. 위의 배열에서 가장 큰 수를 출력하세요.--------------------------------------------------------------
		
		/*
		int max = arr[0];
		for(int tmp : arr){
			if(max < tmp){
				max= tmp;
			}
		}
		System.out.println("배열의 최대값 : "+ max);
	
		//---------------------------------------
		
		int max= arr[0];
		
		for(int i =0; i<arr.length; i++){
			int t= arr[i];								//배열이 주소값을 갖는다고 생각했는데 여기에 t에는 주소값이 아닌 값이 들어가는데 이거 공부해서 알아놓기!
			if(max < t){
				max = t;
			}
		}
		System.out.println("배열의 최대값 : "+ max);
		*/
		
		


	}

}
