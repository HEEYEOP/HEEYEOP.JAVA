package Day0702;

public class exam4 { //인터페이스 관련하여 복습

	public static void main(String[] args){
		
		
	}//main꺼

}//class꺼

//인터페이스는 기능 명세.
//장점) 기능들을 일목요연하게 볼 수 있다.	통일성을 갖출 수 있다.

//상속과 인터페이스
//상속은 부모가 1명, 인터페이스는 여러개 구현할 수 있다.
interface Draw{
	public void resize(int width, int height);
	public void move(int x, int y);
}

class Rect implements Draw{

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}