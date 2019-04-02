
public class Day65 {

/*	배열을 생성
	1. 랜덤한 수 (1~45)
	2. 중복되지 않고
	3. 7개짜리, 6개짜리
	
	1. 랜덤한 수를 생성하는 메소드 : random
	2. (중복되지 않게 하기 위해서) 배열에 검색하려는 수가 있는지 없는지 확인하는 메소드 : contain
	3. 배열을 생성(1,2를 만족)하는 메소드: createRandArr												*/
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min =1, max =40;			//max가 7보다 작으면 배열생성에 실패
		int r = random(min,max);
		int [] arr = new int [7];		//int [] arr = null; // 배열 생성에 실패
		int [] arr2 =new int [6];
		
		if(createRandArr(min, max, arr)){
			printArr(arr);
		}else{
			System.out.println("배열 생성에 실패");
		}
		
		//로또 번호 (6개) 생성하기
		if(createRandArr(min, max, arr2)){
			printArr(arr2);
		}else{
			System.out.println("배열 생성에 실패");
		}
		
		
	} //	main--------------------

		
		// 기능	:최소값(min)과 최대값(max)가 주어지면 최소값과 최대값 사이의 임의의 정수를 알려주는 메소드
		//매개변수 : 최소값, 최대값 ->int min, int max
		//리턴타입 : 정수 -> int
		//매소드명 : random
	
		//int r =(int)(Math.random()*(max-min+1) + min);
	
	
	public static int random(int min, int max){
		
		if(min > max){
			
			int tmp = min;
				min = max;
				max= tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
	}
	
	
	//------------------------------------------
	
	// 기능 : 배열에 검색숫자가 있는지 없는지 확인하는 메소드
	// 매개변수 : 검색숫자, 배열 -> int [] arr, int num
	// 리턴타입 : 있는지(true), 없는지(false)  ->boolean
	// 메소드명 : contain
	

	public static boolean contain( int []arr, int num, int cnt){		//int num이 찾으려고 하는 숫자 
		
		if( arr == null ){
			return false;
		}
		
		//배열의 크기보다 더 많이 검색하려고 하는 경우
		if(cnt> arr.length){
			cnt = arr.length;
		}
		for(int i =0; i<cnt; i++){			//
			if(arr[i] == num){				//  ==> for(int tmp : arr)   :::향상된 for문
				return true;
			}
		}
		return false;
	}
	
	//------------------------------------------------------
	
	// 기능 : 최소값과 최대값, 배열이 주어지면 중복되지 않은 랜덤한 수(min~max)로 배열을 채우는 메소드
	// 매개변수 : 최소값, 최대값, 배열 -> int min, int max, int [] arr
	// 리턴타입 : boolean(배열을 채웠는지 못채웠는지 여부)
	// 메소드명 : createRandArr
	public static boolean createRandArr (int min, int max, int [] arr){
		
		if( arr == null){
			return false;
		}
		if(max-min+1 < arr.length){
			return false;
		}
		int cnt =0;  //cnt는 랜덤이 배열에 저장된 갯수
		while ( cnt < arr.length){
			int r = random(min,max);
			
			// arr에 r이 없으면
			if(!contain(arr, r, cnt)){
				arr[cnt] = r;
				cnt++;
				
			}
		}
		
		return true;
		
	}
	
	//------------------
	
	// 기능 : 배열이 주어지면 배열의 모든 원소값을 콘솔에 출력하는 메소드
	// 매개변수 : 배열 -> int [] arr
	// 리턴타입 : 없다 -> void
	// 메소드명 : printArr
	
	public static void printArr( int [] arr){
		System.out.print("[ ");
		
		for(int tmp:arr){
			System.out.print(tmp+" ");
		}
		
		System.out.print("]\n");
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}// 	class
