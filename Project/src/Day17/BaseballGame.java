package Day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseballGame { //list : 순서o , 중복o

	public static void main(String[] args) {
		//1.숫자 3개를 랜덤으로 뽑아내기
		//1.1 랜덤 숫자 3개를 컴퓨터에도 주고 나도 쓰고
		
		//2.자릿수가 맞는지  비교하는 메소드
		//3.숫자가 맞는지 비교하는 메소드
		Scanner scan = new Scanner(System.in);
		
		List<Integer> com = TeacherLotto.randomArr(1, 9, 3);
		List<Integer> me = new ArrayList<Integer>();
		
		System.out.println("숫자를 입력하세요");
		me.add(scan.nextInt());
		me.add(scan.nextInt());
		me.add(scan.nextInt());
		
		System.out.println(com);
		System.out.println(me);
		
		numberPosition(com, me);
		
		scan.close();
	}
	
	public static void numberPosition(List<Integer> com, List<Integer> me){
		
		int strike = 0;
		int ball = 0;
		
		for(int i =0; i<com.size(); i++){
			for(int j=0; j<me.size(); j++){
				System.out.println(com.get(i)+","+me.get(j));
				if(com.get(i).equals(me.get(j))){			//주의주의!!!! 같다(==)으로하면 객체==객체 이기때문에 주소로 비교한다. 그러므로 equals함수를 써서 비교한다.
					if(i == j){
						strike ++;
						System.out.println(" ----");
					}
					else{
						ball ++;
						System.out.println(" ----");
					}
				}
			}
		}
		System.out.println("스트라이크: "+strike);
		System.out.println("볼: "+ball);		
	}
	
	
	
	
	

}
