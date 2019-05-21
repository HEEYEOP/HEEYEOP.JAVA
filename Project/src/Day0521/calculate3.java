package Day0521;

public class calculate3 {

	public static void main(String[] args) {
		double a =1.23, b= 0;
		char op = '/';
		double res;
		
		try {
			res= calc(a,b,op);
			System.out.println(res);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		

	}// main꺼-----------------------
	
	
	public static double calc(double a, double b, char op) 
			throws Exception{
		
		double res =0.0;
		
		switch(op){
		case '+' : res = a+b; break;
		case '-' : res = a-b; break;
		case '*' : res = a*b; break;

		case '/' :
			if(b == 0) throw new Exception("0으로 나눌 수 없습니다.");
			res = a/b ; break;
		case '%' :
			if(b == 0) throw new Exception("0으로 나눌 수 없습니다.");
			res = a%b; break;
		default  :
			throw new Exception("잘못된 연산자입니다.");
		}
		return res;
	}

}
