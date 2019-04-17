package Day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Lotto { //set : 순서X , 중복X

	public static void main(String[] args) {

		HashSet<Integer> s = new HashSet<Integer>();
		
		for(int i = 0; s.size() < 6; i++){
			int num = (int)(Math.random()*45)+1;
			s.add(new Integer(num));
		}
		System.out.println(s);
		//------------여기까지 로또번호 6개 생성
		HashSet<Integer> t = new HashSet<Integer>();
		
		for(int i = 0; t.size() < 7; i++){
			int num = (int)(Math.random()*45)+1;
			t.add(new Integer(num));
		}
		System.out.println(t);
		
		int r = rank(s, t);
		printRank(r);
		

	}//main꺼
	
	public static int compareSet(HashSet s, HashSet t){
		int cnt =0; 
		int size =0;
		
		if(s.size() > t.size()){
			size = t.size();
		}else{
			size = s.size();
		}
		
		Iterator set = s.iterator();
		
		if(t.contains(set.next()));
				cnt++;
		
	return cnt;
	}
	
	
	public static int rank(HashSet s, HashSet t){
		
		List list = new LinkedList(t);
		
		switch(compareSet(s, t)){
		
		case 6: return 1;
		case 5: if(s.contains(list.get(6)))
					return 2;
				else
					return 3;
		case 4: return 4;
		case 3: return 5;
		default: return -1;
		}
	}
	
	public static void printRank(int r){
		if(r ==-1){
			System.out.println("꽝");
		}else{
			System.out.println("등수: "+ r +"등");
		}
	}
	
	
	
}//class꺼
