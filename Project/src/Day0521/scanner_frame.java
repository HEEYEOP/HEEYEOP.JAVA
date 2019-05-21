package Day0521;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class scanner_frame {

	public static void main(String[] args) {
		
		/*Scanner와  컬렉션 프레임워크를 이용하여 중복되지 않는 6개의 정수를 입력받는 코드를 작성하시오
		
		Scanner scan = new Scanner(System.in);
	
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(  ; set.size()<6 ;  ){
			System.out.print("숫자를 입력하시오 :");
			set.add(scan.nextInt());
			System.out.println(set);
		
		}
		*/
		
		
		/*1~6을 ArrayList에 순서대로 저장하고,
		 * 해당 ArrayList를 섞는 코드를 작성하시오.*/
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for( int i =0; i<=6; i++ ){
			list.add(i);
		}
		System.out.println(list);
		
		for(int i =0; i<=5; i++){
			int tmp = 0;
			int r = (int)(Math.random()*(5)+1);
			
			tmp = list.get(i);
			list.set(i, list.get(r));
			list.set(r, tmp);
			
		}
		System.out.println(list);
		
		
		//--------------------------------------------
		
		list.clear();
		for( int i =0; i<=6; i++ ){
			list.add(i);
		}
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		
	}

}
