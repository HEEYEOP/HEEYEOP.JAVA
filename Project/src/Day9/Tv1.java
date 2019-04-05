package Day9;

public class Tv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//기본 생성자를 이용한 객체 생성 후 초기화
		Tv t1 = new Tv();
		t1.printChannel();
		t1.printVolume();
		
		//생성자 오버로딩을 이용한 객체 생성 후 초기화
		Tv t2 = new Tv(100, 15);
		t2.printChannel();
		t2.printVolume();

		// t3는 새로 생성되는 것이고 , 다만 t3에 t2의 정보를 가져다 쓸뿐이다.
		Tv t3 = new Tv(t2);
		System.out.println("t3");
		t3.printChannel();
		t3.printVolume();
		t3.volumeDown();
		System.out.println("t3 소리 줄이기 실행 후 t3");
		t3.printVolume();
		System.out.println("t2의 소리");
		t2.printVolume();
		
		//위에꺼랑 다름
		//t4를 생성하지 않고 t3의 다른이름으로 t4라고 부른다.
		Tv t4 = t3;
		System.out.println("t3 소리 줄이기 실행 후 t4");
		t4.printVolume();
		
		System.out.println("t5");
		Tv t5 = new Tv(t2);
		t5.printChannel();
		t5.printVolume();
		
	}

}
