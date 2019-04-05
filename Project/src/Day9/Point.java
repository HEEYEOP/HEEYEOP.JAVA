package Day9;

public class Point {

		
	private int x;
	private int y;
	
	//---------------------------------------
	
	public Point(){		//기본생성자
		move(0,0);
		//x = 0;
		//x = 0;
	}
	public Point(int x, int y){
		
		move(x,y);
		
		//this.x = x;
		//this.y = y;
	}
	
	public Point(Point p){		//복사생성자
		move(p.x, p.y);
	}
	
	//---------- getter setter --------------
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	//x,y의 값이 주어졌을 때 멤버변수의 값 변경
	public void move(int x, int y){
		setX(x);  //this.x = x;
		setY(y);  //this.y = y;
	}
	
	//현재좌표출력
	public void print(){
		//예시) (1,2)
		System.out.println("("+ x +","+ y +")");			//여기서 그냥 x와 y라고 작성해도 되는 것인가.
	}
	
	//다른 점과의 거리 계산
	
	public double distance(Point p){
		
		return distance(p.x, p.y);	//코드의 중복을 피하기위해서 
		
		/*
		int dx = p.x - x;
		int dy = p.y - y;
		
		return Math.sqrt(Math.pow(dx, 2.0)+Math.pow(dy, 2.0));
		*/
	}
	
	public double distance(int x, int y){
		int dx = x - this.x;
		int dy = y - this.y;
		
		return Math.sqrt(Math.pow(dx, 2.0)+Math.pow(dy, 2.0));
		
	}

	public void moveUp() 	{	y--;	}
	public void moveDown()  {	y++;	}
	public void moveLeft() 	{	x--;	}
	public void moveRight() {	x++;	}
	



}


