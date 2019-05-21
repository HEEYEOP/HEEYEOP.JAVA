package Day0521;

import java.util.ArrayList;
import java.util.Collections;

public class cardExam {

	public static void main(String[] args) {
		
		/*list에 모든카드(52장)을 넣고 섞는 코드*/
		
		card c = new card();
		c.num = 10;
		c.shape = "Heart";
		c.print();
		
		ArrayList<card> list = new ArrayList<card>();
		
		
			for(int i =1; i<=13; i++){
				card t = new card();
				t.num = i;
				t.shape="Heart";
				list.add(t);
			}
			for(int i =1; i<=13; i++){
				card t = new card();
				t.num = i;
				t.shape="Space";
				list.add(t);
			}
			for(int i =1; i<=13; i++){
				card t = new card();
				t.num = i;
				t.shape="Clover";
				list.add(t);
			}
			for(int i =1; i<=13; i++){
				card t = new card();
				t.num = i;
				t.shape="Diamond";
				list.add(t);
			}
			
			System.out.println(list);
			
			
			Collections.shuffle(list);
			System.out.println(list);
			
			
		
}


}
