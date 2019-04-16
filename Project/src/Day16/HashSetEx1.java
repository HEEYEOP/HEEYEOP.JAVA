package Day16;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
	public static void main(String[] args) {
		
		Object[] objArr = {"1", new Integer(1), "2","2","3","3","4","4","4"}; //중복을 제거하고 순서를 고려하지 않는다.
		Set set = new HashSet();	//인터페이스 객체는 인터페이스를 구현한 클래스를 통해서 객체를 생성할 수 있다.
		
		for(int i =0; i < objArr.length; i++){
			set.add(objArr[i]);

		}
		System.out.println(set);
	}

}
