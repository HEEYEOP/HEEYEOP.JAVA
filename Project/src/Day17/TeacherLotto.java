package Day17;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TeacherLotto {

	public static void main(String[] args) {
		//1. 번호들을 생성
		//1.1 로또 당첨 번호를 생성 7개짜리
		//1.2 로또 자동 번호를 생성 6개짜리
		
		//2. 당첨번호와 자동 번호를 비교해서 등수
		//2.1 당첨번호와 자동번호를 비교하여 일치하는 갯수확인
		//2.2 보너스 일치여부 확인
		//2.3 등수 출력
		
		
		int min =1;
		int max =45;
		List<Integer> lotto = randomArr(min, max, 7);
		List<Integer> list = randomArr(min, max, 6);
		System.out.println(lotto);
		System.out.println(list);
		System.out.println(countList(lotto, list));
		printRank(lotto, list);
		
	}//main꺼 ---------------------------------

	
	
	
	
	//기능 : min, max가 주어지면 해당 범위에서 중복되지 않는 랜덤한 수를 count갯수만큼 생성하여 리스트로 반환하는 메소드
	//매개변수 : int min, int max, int count
	//리턴타입 : List
	public static List<Integer> randomArr(int min, int max, int count){
	
		if(max-min+1 < count)	//생성할 수 있는 숫자의 범위보다 만들어야 하는 갯수가 더 크면 중복될 수 밖에 없기 때문에 무한루프에 빠지는 경우가 생기는것을 막기 위한 코드
			return null;
		
		HashSet<Integer> set = new HashSet();
		
		while(set.size() < count){					//count개 만큼 생성하기 위한 조건식
			int num = (int)(Math.random()*(max-min+1))+min;
			set.add(new Integer(num));
		}
		List<Integer> list = new LinkedList<Integer>(set);		//Set으로 저장되어 있는 데이터들을 List 데이터들로 변환 (왜? set에는 원하는 번지에 직접 접근할 수 있는 메소드가 없기 때문에)
		return list;
	}
	
	//기능 : 로또 당첨번호들과 번호들이 주어지면 보너스 번호를 제외하고 일차하는 갯수가 몇개인지 알려주는 메소드
	//매개변수 : 당첨번호들 -> List<Integer> lotto
	//		    번호들 -> List<Integer> list
	//리턴타입 : 갯수 -> int
	//메소드명 : countList
	public static int countList(List<Integer> lotto, List<Integer> list){
		
		if(lotto.size() < list.size())			//첫번째 매개변수에 당첨번호가 와야하는데 당첨번호가 아닌 번호가 오면 -1을 리턴후 종료
			return -1;
		
		int count = 0;
		for(int i =0; i<list.size(); i++){		//당첨번호에서 보너스 번호를 제외하기 위해서 조건식에 lotto.size()가 아닌 list.size()를 이용한다.
			if(list.contains(lotto.get(i))){	//lotto에서 원소를 하나 꺼내서 꺼낸 원소가 list에 있는지 없는지 확인하여 있으면 count를 증가, 없으면 아무것도 안함
			count++;
			}
		}
		
		return count;
	}
	public static void printRank(List<Integer> lotto, List<Integer> list){
		
		int count = countList(lotto, list);				//보너스 번호를 제외한 일치하는 갯수
		int rank = 0;
		
		int bonusNum = lotto.get(lotto.size()-1);		//보너스 번호
		boolean checkBonus = list.contains(bonusNum);	//보너스 번호와 일치하는 번호가 있는지 없는지
		
		switch(count){
			case 6: rank=1; break;
			case 5: rank=checkBonus?2:3; break;
			case 4: rank=4; break;
			case 3: rank=5; break;
			default: rank=-1;
		}
	
		if(rank>0)
			System.out.println(rank+"등 당첨!!");
		else
			System.out.println("꽝!!");
	}
	
}//class꺼
