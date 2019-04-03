package Day7;

public class Day76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	
	} //main꺼---------------------------------------------
	
	
	
	//기능 : 배열을 num로 초기화 하는 메소드
	//매개변수 : 배열, num  -> int[] arr, int num
	//리턴타입 : 없다 -> void
	//메소드명 : initArr
	
	//참조변수에 대해 정확하게 알아놓자!!!
	
	public static void initArr(int[] arr, int num){
		
		for(int i = 0; i<arr.length; i++){
			//arr = new int [10]
			arr[i] = num;
		
		}
	}
	
	public static void printArr(int [] arr){
		for(int tmp:arr){
			System.out.println(tmp+" ");
		}
		System.out.println();
	}
	
	

}//class꺼
