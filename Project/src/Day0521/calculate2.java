package Day0521;

public class calculate2 {

	public static void main(String[] args) {
		System.out.println(calc(5,10,'%'));
	}
	

public static double calc(int a, int b, char op){
	
	double res =0;
	
	switch(op){
	case '+' : 
		res = a+b;
		break;
	case '-' : 
		res = a-b;
		break;
	case '/' : 
		res = a/(double)b ;
		break;
	case '*' : 
		res = a*b;
		break;
	case '%' : 
		res = a%b;
		break;
	default :
		System.out.println("잘못된 연산자 입니다.");
	}
	return res;

	
	}
}
