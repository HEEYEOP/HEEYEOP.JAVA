package Day15;

public class Square {

	private int startPointX , startPointY;
	private double width;
	private double height;
	private double area;
	
	

	public int getStartPointX() {
		return startPointX;
	}
	public int getStartPointY() {
		return startPointY;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public double getArea() {
		return area;
	}
	public void setStartPointX(int startPointX) {
		this.startPointX = startPointX;
	}
	public void setStartPointY(int startPointY) {
		this.startPointY = startPointY;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	
	
	
	
	public void print(){
		System.out.println("왼쪽위의점 :("+startPointX+","+startPointY+")");
		 System.out.println("가로 :"+ width);
		 System.out.println("세로 :"+ height);
		 area = width*height;
		 System.out.println("넓이 :"+ area);
	}
	
	public Square(){
		
	}
	
	public Square(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Square [startPointX=" + startPointX + ", startPointY=" + startPointY + ", width=" + width + ", height="
				+ height + ", area=" + area + "]";
	}
}
	
