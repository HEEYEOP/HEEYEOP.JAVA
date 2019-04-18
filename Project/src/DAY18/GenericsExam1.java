package DAY18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GenericsExam1 {

	public static void main(String[] args) {
	
		Box<Integer> box = new Box<Integer>();
		Box<String> box2 = new Box<String>();
		Box<Object> box3 = new Box<Object>();
		
		//왼쪽에는 인터페이스명, 오른쪽에는 왼쪽의 인터페이스를 구현한 클래스
		//인터페이스 <Integer> test = new 클래스<Integer>();
	
		//왼쪽에 부모클래스, 오른쪽은 자식클래스
		//부모클래스<Integer> set = new 자식클래스<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		
		Box<Integer> b = new Box();
		b.add(10);
		b.add(20);
		System.out.println(b);
		System.out.println(b.size());
	}

}
class Box<T>{
	ArrayList<T> list = new ArrayList<>();
	
	void add(T item)	{list.add(item);}
	T get(int i )		{return list.get(i);}
	ArrayList<T> getlist() {return list;}
	int size() 			{return list.size();}
	public String toString() 	{return list.toString();}
}