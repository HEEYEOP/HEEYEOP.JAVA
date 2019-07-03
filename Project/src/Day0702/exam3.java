package Day0702;

import Day0520.point3D;

public class exam3  { //상속 관련하여 복습

	public static void main(String[] args) {
		/*상속 : 부모 클래스에게 멤버 변수와 메소드를 물려 받는 것. 
		 * 		단, private로 된 변수와 메소드는 상속을 받아도 직접 접근할 수 없음.(상속받은 자식 클래스는 접근할 수 있으나 외부에서 접근하는 것을 막는 접근제한자 protected를 이용하면 된다.)
		 * 		
		 * */
		
		/*접근제한자*/
		//private : 나(일반적으로 멤버 변수)
		//default : 나 + 패키지
		//protected : 나 + 자식 + 패키지(일반적으로 멤버 변수)
		//public : 누구나(일반적으로 멤버 메소드, 필수적으로 생성자)
		
		//오버라이딩 : 부모 클래스의 메소드를 재정의 하는 것.
		//오버로딩 : 동일한 이름의 메소드가 여러개 있는것 (조건1 매개변수의 갯수가 다르거나,	 조건2 매개변수의 갯수는 같지만 자료형이 다른 경우)
		
		//부모클래스의 메소드나 생성자에 접근하기 위한 super

		Point3D p = new Point3D();
		p.print();
		p.move(1, 1, 1);
		p.print();
	}//main꺼

}//class꺼

class Point3D extends Point{
	//x,y는 Point클래스에서 상속받아 존재하지만(보이지는 않지만)	  x,y의 접근제한자가 private이기 때문에 직접 접근할 수 없다. ==> setter와 getter를 이용
	
	private int z;

	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	//메소드 오버로딩 (부모와 메소드명은 같으나, 매개변수 갯수가 다르기 때문에)
	public void move(int x, int y, int z){
		super.move(x, y);
		this.z = z;
	}
	
	//메소드 오버라이딩
	@Override
	public void print(){
		System.out.println("("+getX()+","+getY()+","+z+")");
	}
	
	@Override 
	public String toString() {
		return "("+getX()+","+getY()+","+z+")";
	}
	
	
	
	public Point3D(){
		//super(); 자동호출. 단, 기본생성자가 있을 경우
	}
	public Point3D(int x, int y, int z){
		move(x,y,z);
	}
	public Point3D(Point3D p){
		move(p.getX(), p.getY(), p.z);
	}
}
