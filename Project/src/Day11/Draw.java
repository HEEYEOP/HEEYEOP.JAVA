package Day11;

public interface Draw {
	
	//도형 그리기 기능 대신 콘솔에 정보를 출력하는 기능으로 대체
	void print();
	
	//도형의 크기를 재설정하는 기능
	void resize(double width, double height);
	
	//도형을 이동시키는 기능
	void move(int x, int y);
	
	//디폴트 메소드 : 추상 메소드의 기본적인 구현을 제공하는 메소드,	추상 메소드가 아니기때문에 디폴트 메소드가 새로 추가되어도 인터페이스를 구현한 클래스는 변경하지 않아도 된다. 
	//몸통{}을 달고 다닌다.
	default void test(){}
}
