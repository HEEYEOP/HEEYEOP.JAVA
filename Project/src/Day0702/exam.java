package Day0702;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import Day0520.point;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		1. 정수형 변수에 10을 저장 후 콘솔에 출력하는 코드를 작성
		
		int a = 10;
		System.out.println(a);
		*/
		
		
		/* 
		2. 1부터 10까지의 합을 구하는 코드를 작성
		
		int num = 0;
		for(int i=0; i<=10; i++){
			num += i;
		}
		System.out.println(num);
		*/
		
		
		/*
		3. 정수 7이 소수인지 아닌지 판별하는 코드를 작성
		
		int cnt =0 ;
		int num = 7;
		for(int i=2; i<=num; i++){
			if(num % i == 0){
				cnt ++;
			}
		}
		if(cnt == 1){
			System.out.println(num+"은 소수 입니다");
		}else{
			System.out.println(num+"은 소수가 아닙니다");
		}
		
		*/
		
	
		
		//4. 산술연산하는 함수를 생성하여 테스트하는 코드를 작성
		//System.out.println(calc(10,20,'+'));
		
		
	
		 /*5. 2차원 좌표의 점을 저장하는 Point 클래스를 생성하고 테스트 하는 코드를 작성
				-멤버변수: x,y
				-멤버함수: 생성자 / getter setter / 좌표이동 / 좌표출력
		
		  Point p = new Point(3,5);
		  p.print();
		  
		  */
		
		
		  
		//6. 5번에서 생성한 Point클래스를 이용하여 점의 이동 경로를 저장하는 코드를 작성하세요
		
		ArrayList<Point> pointPath = new ArrayList<>();
		Point p = new Point();
		pointPath.add(new Point(p));
		p.move(4, 4);
		pointPath.add(new Point(p));
		p.move(10,10);
		pointPath.add(new Point(p));
		
		Iterator<Point> it = pointPath.iterator();
		while(it.hasNext()){ 
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		  
		  

	}
	
	public static double calc(int num1, int num2, char op){
		double res = 0;
		switch(op){
		case '+':
			res = num1 + num2;
			return res;
		case '-': 
			res = num1 - num2;
			return res;
		case '/': 
			if(num2 != 0){
				res = num1 / num2;
				return res;
			}
		case '*':
			res = num1 * num2;
			return res;
			
		case '%': 
			if(num2 != 0){
			res = num1 % num2;
			return res;
		}
		default :
			return 0.0;		
		}
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
	

	public void move(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void print(){
		System.out.println("("+x+","+y+")");
	}
	
	
	public Point(){}
	
	public Point(int x, int y){
		move(x,y);
	}
	
	public Point(Point p){
		move(p.x, p.y);
	}
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
	
	
	

	
	
	
}
