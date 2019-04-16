package Day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(10);
		
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));		//생성자 오버로딩 사용(매개변수가 List인 경우) , 
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("c");
		list2.add(3, "A");
		print(list1, list2);
		
		list2.set(3, "AA");
		print(list1, list2);
		
		System.out.println("list1.retainAll(list2):"+list1.retainAll(list2));		//겹치지 않은 내용이 있어서 삭제가 되면 true, 삭제가 안되면 false 		//????retain함수의 리턴타입은 boolean인데 언제 삭제를 한것일까?

		print(list1, list2);
		
		//0번지부터 시작하면 remove()에 의해 삭제가 되면 확인해야하는 내용이 있는 번지가 변경이 되어 확인하지 않은 원소가 생길 수 있기 때문에 거꾸로 확인해서 작업해야한다
		for(int i=list2.size()-1; i>=0; i--){
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}

		print(list1, list2);
	}//main꺼
	
	static void print(ArrayList list1, ArrayList list2){
		System.out.println("list1 :"+list1);
		System.out.println("list2 :"+list2);
		System.out.println();
	}

}//class꺼
