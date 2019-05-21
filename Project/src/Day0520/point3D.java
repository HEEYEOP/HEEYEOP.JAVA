package Day0520;

public class point3D extends point{
	
	/*point클래스를 이용하여 3차원의 자표평면을 나타내는 point3D 클래스를 생성*/
	
	private int z;

	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	//기본생성자
	public point3D(){}
	//생성자 오버로딩
	public point3D(int x, int y, int z){
		move(x,y,z);
	}
	//복사생성자
	public point3D(point3D p){
		move(p.getX(),p.getY(),p.z); 	//x와y는 부모의 멤버 변수를 상속받았고, 접근제한자가 private이기 때문에 직접 접근할 수 없다. 따라서 getter를 이용하여 접근한다.	
	}
	
	//메소드 오버로딩(부모클래스에 있는 move()와 메소드 이름도 같고 매개변수도 같기 때문에)
	public void move(int x, int y, int z){
		move(x,y); //point 클래스에 있는 move 메소드
		this.z = z;	
	}
	
	//메소드 오버라이딩
	public void print(){
		System.out.println("("+getX()+","+getY()+","+z+")");
	}
	
	
	/*
	
	private int z;
	point p;
	
	
	public int getZ() {
		return z;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	
	
	
	public point3D(){}
	
	public point3D(point3D t){
		
	}
	
	public point3D(point p, int z){
		move(p.s   	this.z = z);
	}
	
	public void print(){
		System.out.println("(x,y,z) ="+"("+p.getX()+","+p.getY()+","+z+")");
	}
	
	public void move(point p, int z){
		p.setX(p.getX());
		p.setY(p.getY());
		this.z = z;
		
	}
	
	*/
	
	
	
	
	
	
}
