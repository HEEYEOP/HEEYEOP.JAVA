package Day10;

public class Circle extends Shape {
	
	private int radius;
	
	//---------------

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override							// 이거 붙이면 무조건!!! 다음에 나오는건 오버라이딩한 코드가 나와야함. 그렇지 않으면 오류가 발생함.
	public void print(){
		System.out.print("중심점 : ");
		center.print();
		System.out.println("반지름 : "+radius);
		
	}
	
	public Circle(){
		//super();
	
	}
	public Circle(int x, int y, int r){
		super(x,y,r,r);			//제일 첫 줄에 작성하기
		radius = r;
	}
	

}
