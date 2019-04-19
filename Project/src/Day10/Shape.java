package Day10;

public class Shape {

	protected Point center;
	protected int width;
	protected int height;
	
	
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public void print(){
		System.out.print("중심점 : ");
		center.print();
		System.out.println("가로 : "+width);
		System.out.println("세로 : "+height);
	}
	
	//기본생성자
	public Shape(){
		center = new Point();
	}
	//생성자2
	public Shape(int x, int y, int width, int height){
		center = new Point();
		
		center.move(x, y);
		
		this.width = width;
		this.height =height;
		
		
	}
	
	
	
	
	
	
}
