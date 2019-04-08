package Day10;

public class Rect extends Shape {
	
	private int area;
	
	public int getArea() {
		return area;
	}
	
	
	public Rect(){}
	public Rect(int x, int y, int w, int h){
		super(x,y,w,h);
		area = w * h;
	}
	
	@Override
	public void print(){
		super.print();
		System.out.println("넓이 :" + area);
	}
	
	public void resize(int width, int height){
		this.width = width;
		this.height = height;
		area = width * height;  		//area를 추가해줘야한다 왜?? 위에 생성자 area = w*h 는 생성될때 한번만 호출되고 끝이기 때문이에 수정할때는 호출되지 않기 때문이다.!
		
	}
	
}
	
	
	
	/*			---내가한거
	private int area;
	
	

	public int getArea() {
		return area;
	}

	
	@Override				
	public void print(){
		super.print();
		System.out.println("넓이 : "+ area);
	}

	public Rect(){
		area = 0;
	}
	
	public Rect(int x, int y, int a, int b){
		super(x,y,a,b);
		area = a*b;
	}
	*/
	
	
	

