package Day16;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);		//  동일한 코드 : list.add(new Integer(10));
		list.add(5);
		list.add(1);
		
		/*
		for(int i = 0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		*/
		
		ArrayList<Point> pList = new ArrayList<Point>();
		Point pt = new Point();
		char mode = 'y';
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("이동할 좌표(x,y)를 입력하세요. ");
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			pt.move(x, y);
			System.out.println("이동한 현재 좌표 :"+pt);
			
			pList.add(new Point(pt));
			System.out.println("더 하시겠습니까? (y or n)");
			mode = scan.next().charAt(0);
			
		}while(mode !='n');
		
		for(int i = 0; i<pList.size(); i++){
			System.out.println(pList.get(i));
		}
		
		/*
		pList.add(new Point(pt));
		pt.move(10, 10);
	
		pList.add(new Point(pt));
		
		for(int i = 0; i<pList.size(); i++){
			System.out.println(pList.get(i));
		}
		*/
		
		scan.close();

	}
}

class Point{
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
	
	public Point(){}
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Point(Point p){
		this(p.x, p.y);
	}
	public void move(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	
	@Override
	public int hashCode() { 	//객체가 어느 그룹에 속해있는지 알려주는 메소드로  Point클래스에서는 x,y의 값이 같다면  다른객체이더라도 같은 그룹에 속하기 때문에 검색을 빠르게 할 수 있다.
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {		//두 객체가 같은 객체로 판별할 것 인지를 결정하는 메소드
		if (this == obj)					//주소가 같은 경우면, 
			return true;
		if (obj == null)					
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)					//Point 클래스에서 같은 객체는 x와 y가 같은 경우이다로 설정함.
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
}