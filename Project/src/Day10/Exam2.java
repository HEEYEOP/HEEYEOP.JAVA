package Day10;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class Shape2{
	int x, y;
	int w, h;
	//추상메소드는 주로 자식클래스에서 오버라이딩이 빈번하게 발생하는 경우에 해당 메소드를 구현하지 않고 추상메소드로 선언후에 자식 클래스에서 구현하도록 한다.
	
	abstract void print();
	
}
// 추상 메소드를 사용하려면 추상 클래스를 상속받는 자식 클래스를 만들고 만들어진 자식 클래스에서 메소드 오버라이딩을 통해 구현한 후 사용한다.
// 추상 클래스를 상속받으면 추상 메소드를 반드시 오버라이딩을 통해 구현해야한다.

class Rect2 extends Shape2{

	@Override
	void print() {
		// TODO Auto-generated method stub
		
		
		
	}
	
	
	
}