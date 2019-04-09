package Day11;

public class Circle extends Shape {

	//반지름의 정보를 가져오는 get메소드
	public double getRadius(){
		return getWidth()/2;
	}
	
	//넓이 구하는 메소드
	public double getArea(){
		return getRadius()*getRadius()*Math.PI;
	}     
	
	@Override
	public void print(){
		System.out.println("-------------");
		System.out.println("중심점: ");
		getCenter().print();				//getCenter()는 Shape클래스에 구현되어 있고 center를 리턴한다. 사용이유) center가 private로 구현되어있기 때문에 자식클래스에서 사용할 수 없으므로
		System.out.println("반지름: "+ getRadius());
		System.out.println("넓이: "+ getArea());
		System.out.println("-------------");
	
	}
	public void resize(double r){			//이건 내가 r을 반지름을 준다고 가정했을때 밑에가 r*2가 되는거쥬?
		setWidth(r*2);
		setHeight(r*2);
	}
	
	public Circle(){}
	
	public Circle(int x, int y, int r){
		super(x,y,r*2,r*2);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*private int radius;

	public int getRadius() {
		return radius; 
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	@Override
	public void print() {
		super.print();
		System.out.println("반지름 : " + radius);
	}
	
	
	public Circle(){}
	
	public Circle(int x, int y, int r){
		super(x,y,r,r);
		radius  = r;
		
		
	}*/
	
	
	
	
	
	

}
