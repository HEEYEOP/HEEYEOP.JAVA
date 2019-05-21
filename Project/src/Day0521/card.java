package Day0521;

public class card {
	
	/*카드 클래스를 만들고 list에 모든카드(52장)을 넣고 섞는 코드를 작성하세요
	 *카드 클래스의 멤버 변수는 숫자, 모양이 있다*/
	
	public int num;
	public String shape;
	
	
	public void print(){
		System.out.println(shape+num);
	}


	@Override
	public String toString() {
		return num + shape ;
	}
	
	
	
	
	
	
	
	
	
	

}
