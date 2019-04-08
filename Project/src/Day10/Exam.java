package Day10;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv t = new Tv();
		t.price = 100;
		t.bonusPoint = 2;
		
		Computer c = new Computer();
		c.price = 50;
		c.bonusPoint = 1;
		
		Audio a = new Audio();
		a.price = 200;
		a.bonusPoint = 5;
		
		Buyer buyer = new Buyer();
		
		buyer.buy(c);
		System.out.println("컴퓨터 산 후 남은 금액 :"+buyer.money);
		
		buyer.buy(a);
		System.out.println("오디오 산 후 남은 금액 :"+buyer.money);
		
		buyer.buy(t);
		System.out.println("Tv 산 후 남은 금액 :"+buyer.money);
		
		
	}

}

class Product{
	int price;
	int bonusPoint;
}
class Tv extends Product{}			//자식클래스1
class Computer extends Product{}	//자식클래스2
class Audio extends Product{}		//자식클래스3

//구매자 클래스
class Buyer{
	int money = 1000;
	int bonusPoint =0;
	
	//원래는 매개변수로  Tv t또는 Computer c 또는 Audio a가 와서 메소드 오버로딩으로 구현해야하지만
	//그럴 경우 Product를 상속받는 제품들이 많아지면 추가해야할 메소드가 늘어난다.
	//그래서 각 클래스의 객체가 아닌 해당 클래스들의 부모인 Product 클래스를 매개변수로 처리하면 Product 클래스를 상속받은 제품들은 일괄처리가 된다.
	void buy(Product p){
		money -= p.price;
		bonusPoint += p.bonusPoint;
	}
	
	
	
	
	
}