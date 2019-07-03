package Day0702;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1부터 10까지 합을 구하는 메소드를 생성하여 테스트하세요
		System.out.println(sum(1,10)*2);
		
	} //main꺼
	 
	public static int sum(int startNum, int endNum){
		int res = 0;
		for(int i=startNum; i<=endNum; i++){
			res += i;
		}
		return res;
	}

 }//class꺼

/*	static메소드 vs 메소드
 *	static 멤버 변수 vs 일반 멤버 변수
 *
 *	static클래스꺼(클래스와 객체 모드를 이용하여 호출)	==>	  객체 생성없이 만들어짐( 주의!! 객체를 통해 호출할 수 없다는 것이 아님)
 *	static 메소드에는 지역변수나 static멤버 변수만 사용할 수 있음, 일반 멤버변수 사용불가!!
 *	===> static메소드는 객체 생성 없이 사용가능하지만, 일반 멤버변수는 객체를 생성해야 할당되기 때문에 클래스를 이용하여 호출하는 경우 문제됨.
 *	static 멤버 변수는 클래스의 모든 객체가 공유함.
 *
 *	일반메소드에서는 static메소드나 static멤버 변수를 사용할 수 있음
 *
 *	
 *
 * 
 * */
 