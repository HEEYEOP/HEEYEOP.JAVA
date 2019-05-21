package Day0520;

public class point {
	
	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	//기본생성자
	public point(){}
	//복사생성자
	public point(point t){
		move(t.x,t.y);
	}
	public point(int x, int y){
		move(x,y);
	}
	
	
	public void print(){
		System.out.println("(x,y) ="+"("+x+","+y+")");
	}
	
	public void move(int x, int y){
		this.x = x;
		this.y = y;
	}

}
