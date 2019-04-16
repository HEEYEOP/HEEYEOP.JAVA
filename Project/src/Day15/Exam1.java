package Day15;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Rect r = new Rect();
		r.width = 10;
		r.height = 5;
		r.centerX = 0;
		r.centerY = 0;
		r.print();
		r.move(5, 5);
		r.print();
		r.resize(10, 10);
		r.print();
		
		Square s = new Square();
		System.out.println(s);
	}

}

class Rect{
	public int width;
	public int height;
	public int centerX;
	public int centerY;

	public void print(){
		System.out.println("중심점 :"+centerX+","+centerY);
		System.out.println("가로 :"+width);
		System.out.println("세로 :"+height);
		System.out.println("가로 :"+width*height);
	}
	public void move(int x, int y){
	
		this.centerX =x;
		this.centerY =y;
		
	}
	public void resize(int width, int height){														
		this.width= width;
		this.height=height;
		
	}
}


	
	
	
