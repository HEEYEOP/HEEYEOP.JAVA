package DAY18;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentInfo s = new StudentInfo("gmlduq", 1, 2, 3, Gender.MALE, Major.CHEMISTRY);
		StudentInfo a = new StudentInfo("wldms", 3, 3, 3, Gender.FEMALE, Major.COMPUTER);
		StudentInfo k = new StudentInfo("abab", 2, 1, 3, Gender.FEMALE, Major.MECATRONICS);
		/////이거 에러나는 이유는 tostring에서 gender와 major가 안쓰여있기 때문이양.
		
		InfoManager list = new InfoManager();
		
		
		list.insert(s);
		list.insert(a);
		list.print();
		
		System.out.println(list.search(s));
		
		
		list.modify(s, k);
		list.print();
		
		
		
		

	}

}
