package Day16;

import java.util.HashSet;

public class HashSetEx3 {// set : 순서를 유지하지 않는 데이터의 집합, 데이터의 중복을 허용하지 않는다.

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		//문자열 abc를 set에 여러번 추가하면 추가할때마다 String 클래스의 오버라이딩 된 euqals()와 hashCode()가 호출이 되어 같은지 다른지 비교하여  같은 문자열이면 추가를 하지 않음
		set.add("abc");
		set.add("abc");
		
		//동일한 값을 가지는 Person 클래스의 객체를 여러개 만들어서 추가하면 Person 클래스에 오버라이딩 된 equals()와 hashCode()를 찾는데 없으면 Object 클래스에 있는 equals()와 hashCode()를 찾아 사용한다
		//이때 Object 클래스의  equalds()는 주소값이 같아야 같은 객체로 판별하므로 아래 예제처럼 값이 같은 두 객체라도 다른 객체로 판별해서 set에 각각 저장한다.
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);
		
	}
}

class Person{
		String name;
		int age;
		
		Person(String name, int age){
			this.name = name;
			this.age = age;
		}
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (age != other.age)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		public String toString(){
			return name +":"+age;
		}
}
