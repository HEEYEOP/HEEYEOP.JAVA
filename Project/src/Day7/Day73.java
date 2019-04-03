package Day7;

public class Day73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 3. 50이하의 소수를 출력하는 코드를 작성하세요.
		
		int i ;
		int j = 0;
		int cnt =0;
		

		for(i=1; i<=50; i++){
			for(j=1; j<=i; j++){
				if(i % j == 0){
					cnt = cnt + 1;	
				}
			}
			
			if(cnt == 2){
				System.out.println(i);
			}
		
			cnt =0 ;
		
		}
		
	
		
		
	
	}

}
