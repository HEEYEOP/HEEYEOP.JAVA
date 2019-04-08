package Day10;

public class Triangle extends Shape {
	
	double area;
	
	
	public double getArea() {
		return area;
	}


	public Triangle(){}			//area의 default 값이 0이기 때문에 추가적으로 0으로 초기화할 필요가 없다.
	public Triangle(int x, int y, int w, int h){
		super(x,y,w,h);
		area= w* h / 2.0;
	}
	
	@Override
	public void print(){
		System.out.println("삼각형");
		super.print();
		System.out.println("넓이 : "+ area);
	}


}
