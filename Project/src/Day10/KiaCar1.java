package Day10;

public class KiaCar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		KiaCar kc = new KiaCar();
		kc.printCar();
		
		
	//-------------------------------------
		Circle c = new Circle(5,5,5);
		c.print();
		
	//-------------------------------------
		
		
		Rect r = new Rect(2, 2, 2, 2);
		r.print();
		
		r.resize(2, 1);
		r.print();
		
		//다형성
		Shape s1 = new Rect();
		Shape s2 = new Circle();
		Shape s3 = new Shape();
		
	//객체의 형변환할때 instanceof 사용!!---------
		if(s1 instanceof Rect){
			Rect r1 = (Rect)s1;
			r1.print();
	
		}
		
		if(s3 instanceof Rect){
			System.out.println("객체 s3은 Rect로 형변환이 가능");
		}
		
		
	
	}

}
