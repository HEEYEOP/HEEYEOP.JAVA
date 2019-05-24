package Day0522;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class 포커게임{	
	public static void main(String[] args){
		
		boolean s1=false, s2 = false;
		int cnt = 0;
		while( !(s1 || s2)){
		while( cnt < 10){
			CardPack cp = new CardPack();
			
			ArrayList<Card> user = new ArrayList<Card>();
			ArrayList<Card> dealer = new ArrayList<Card>();
			for(int i=1; i<=7; i++){
				user.add(cp.give());
				dealer.add(cp.give());
			}

			//System.out.println(PockerRule.pare(user));
			//s1 = PockerRule.straight(user) == 3;
			//s1 = PockerRule.flush(user);
			s1 = PockerRule.straightFlush(user) >= 1;
			//s1 = PokerRule.straightFlush(user) >= 1;
			//s1 = PokerRule.poker(user);
			System.out.println(s1);
			System.out.println(user);
			//s1 = PokerRule.top(user);
			//System.out.println(s1);
			System.out.println("유저 카드 :" + user);



			//System.out.println(PockerRule.pare(dealer));
			//s2 = PockerRule.straight(dealer) == 3;
			//s2 = PockerRule.flush(dealer);
			s2 = PockerRule.straightFlush(dealer) >= 1;
			//s2 = PokerRule.straightFlush(dealer) >= 1;
			//s2 = PokerRule.poker(dealer);
			System.out.println(s2);
			System.out.println(dealer);
			//s2 = PokerRule.top(dealer);
			//System.out.println(s2);
			System.out.println("딜러 카드 :" + dealer);
			int win = PockerRule.whoIsWin(user, dealer); 
			if(win == 1){
				System.out.println("유저 승리!");
			}else if(win == -1){
				System.out.println("딜러 승리!");
			}else{
				System.out.println("무승부!");
			}
			cnt++;
			System.out.println("-----------------------------");
		}
		System.out.println(cnt);
	}
}
	
	
	
class CardPack{

	private ArrayList<Card> list = new ArrayList<Card>();
	
	//기본생성자
	public CardPack(){
		cardPackSetAll();
		shuffle();	
	}

	
	
	/* 기능 : 모양이 주어지면 해당 모양의 1번카드부터 K카드까지 팩에 추가 */
	private void cardPackSet(String shape){
		for(int i=1; i<=13; i++){
			Card c = new Card();
			c.setNum(i);
			c.setShape(shape);
			list.add(c);
		}
	}

	public void cardPackSetAll(){	//새로운 카드팩을 만드는 메소드
		list.clear();
		cardPackSet("S");
		cardPackSet("C");
		cardPackSet("H");
		cardPackSet("D");
	}

	public void show(){				//현재 카드팩 내용을 보여주는 메소드
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i) + " ");
			if( (i+1)% 10 == 0){
				System.out.println();
			}
		}
	}

	public void shuffle(){			//카드팩을 섞는 메소드
		Collections.shuffle(list);
	}
	
	
	public Card give(){				//카드팩에서 위에서 한장을 꺼내는 메소드
		if(list.size() != 0){
			Card c = new Card(list.get(0));
			list.remove(0);
			return c;
		}else{
			return null;
		}
	}
}



class Card{
	private int num;
	private String shape;
	
	public int getNum() {
		return num;
	}
	public String getShape() {
		return shape;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		String s = new String();
		if(shape.equals("S")){
			s += "♠";
		}else if(shape.equals("H")){
			s += "♥";
		}else if(shape.equals("C")){
			s += "♣";
		}else if(shape.equals("D")){
			s += "◆";
		}

		if(num == 11)	s+="J";
		else if(num == 12)	s+="Q";
		else if(num == 13)	s+="K";
		else
			s+=num;
		return s;
	}
	
	//기본생성자
	public Card(){}
	//복사생성자
	public Card(Card c){
		this.num = c.num;
		this.shape = c.shape;
	}
}


static class PockerRule{
	private static int sameCnt(ArrayList<Card> list, int count){
		
		int sCnt =0;  //페어의 갯수
		
		for(int i =0; i<list.size(); i++){
			int cnt =0; //같은 숫자의 갯수
			for(int j =0; j<list.size(); j++){
				if(list.get(i).getNum() == list.get(j).getNum()){
					cnt++;
				}
			}
			if(cnt == count){
				sCnt++;
			}
		}
		
		return sCnt/count ;
		
	}
	
	
	
	
	
	//onepare : 숫자가 같은 카드가 2장이고 한셋인 경우
	//기능 : 페어를 찾는 메소드
	//매개변수 : 카드 리스트
	//리턴타입 : 0 -페어 없음 / 1-원페이/ 2-투페어(페어가 2개이상)
	public static int pare(ArrayList<Card> list){
		return sameCnt(list,2);
		/*int pareCnt =0;  //페어의 갯수
		
		for(int i =0; i<list.size(); i++){
			int cnt =0; //같은 숫자의 갯수
			for(int j =0; j<list.size(); j++){
				if(list.get(i).getNum() == list.get(j).getNum()){
					cnt++;
				}
			}
			if(cnt == 2){
				pareCnt++;
			}
		}
		
		return pareCnt/2 ; */
		
	}
	
	//트리플 : 숫자가 같은 카드가 3장이고 한셋인 경우
	public static int triple(ArrayList<Card> list){
		
		return sameCnt(list,3);
	
		/*
		int tripleCnt = 0; //페어의 갯수
		for(int i=0; i<list.size(); i++){
			int cnt = 0;	//같은 숫자의 갯수
			for(int j=0; j<list.size(); j++){
				if(list.get(i).getNum() == list.get(j).getNum()){
					cnt++;
				}
			}
			if(cnt == 3){
				tripleCnt++;
			}
		}
		return tripleCnt/3; 
		*/

	}
	
	
	//스트레이트 : 연속된 숫자가 5장 이상인 경우
	//0 : 스트레이트 아님 / 1: 스트레이트 / 2: 백스트레이트(1부터5) / 3: 마운틴
	public static int straight(ArrayList<Card> list){

		Collections.sort(list, new Comparator<Card>(){

			@Override
			public int compare(Card c1, Card c2) {
				return c1.getNum()  - c2.getNum();
			}
		});

		
		//1이 있는지 체크
		boolean flag = false;
		boolean isStraight = false;
		
		for(int i=0; i<list.size()-3; i++){
			int straightCnt = 1;
			int std = list.get(i).getNum();
			
			if(std == 1) { flag = true; }
			
			for(int j=i+1; j<list.size(); j++){
				if(std+straightCnt == list.get(j).getNum()){
					straightCnt++;
				}else if(std+straightCnt-1 == list.get(j).getNum()){
					continue;
				}else{
					break;
				}
			}

			//마운틴의 경우, 10,j,q,k
			if(straightCnt == 4 && std == 10 && flag)	return 3;
			
			if(straightCnt >= 5 && std ==1 ) return 2;		
			if(straightCnt >= 5) isStraight = true;			
			
			if(isStraight){
				return 1;
			}
		}
	
	return 0;
	}
	
	//플러쉬 : 모양이 다섯장 같은 경우
	public static String flush(ArrayList<Card> list){
		String s = null;
		
		for(int shapeCnt=0, i=0; i<list.size(); i++){
			s = list.get(i).getShape();
			for(int j=0; j<list.size()-1; j++){
				if(list.get(i).getShape().equals(list.get(j).getShape())){
					shapeCnt++;
					
				}
			}
			if(shapeCnt == 5) return s;
		}
		return null;
	}
	
	//풀하우스 :  트리플 + 원페어 , 또는 트리플2개
	//트리플 : 숫자가 같은 카드가 3장이고 한셋인 경우
	public static boolean fullHouse(ArrayList<Card> list){
		if((triple(list) >= 1 && pare(list) == 1 ) || triple(list) == 2 ) return true;
		else return false;
	}
	
	
	
	//포커 : 숫자가 같은 카드가 4장인 경우
	public static boolean pocker(ArrayList<Card> list){
		
		if(sameCnt(list,4) == 1)
			return true;
		return false;
		
		/*for(int i =0; i<list.size(); i++){
			int cnt =0; //같은 숫자의 갯수
			for(int j =0; j<list.size(); j++){
				if(list.get(i).getNum() == list.get(j).getNum()){
					cnt++;
				}
			}
			if(cnt == 4){
				return true;
			}
		}
		
		return false;*/

	}
	
	
	//스트레이트 플러쉬 : 모양이 같은 5장의 카드가 숫자가 연속적인 경우
	
	public static int straightFlush(ArrayList<Card> list){
		
		String s = flush(list);
		ArrayList<Card> tmp = new ArrayList<Card>();
		
		if(s != null){
		
			tmp.addAll(list);
			
			for(int i=tmp.size()-1; i>=0; i--){
				if(tmp.get(i).getShape() != s) 
					tmp.remove(i);
			}
		} 
		return straight(tmp);
	}	
	
	
	
	
	//탑 : rule 중에서 하나라도 만족하는 경우가 없는 경우
	public static boolean top(ArrayList<Card> list){
		//원페어, 투페어, 트리플, 풀하우스, 포커체크
		if(sameCnt(list, 1) != 7) return false;
		
		//스트레이트 체크
		if(straight(list) != 0) return false;
		
		//플러쉬 체크
		if(flush(list) != null) return false;
		
		return true;
	}	
	
	
	public static int score(ArrayList<Card> list){
		
		if(straightFlush(list) == 3) 	return 1;
		if(straightFlush(list) == 2) 	return 2;
		if(straightFlush(list) == 1) 	return 3;
		if(pocker(list))				return 4;
		if(fullHouse(list))				return 5;
		if(flush(list)!= null)			return 6;
		if(straight(list)==3)			return 7;
		if(straight(list)==2)			return 8;
		if(straight(list)==1)			return 9;
		if(triple(list) >= 1)			return 10;
		if(pare(list)>=2)				return 11;
		if(pare(list)==1) 				return 12;
		
		return 13;
		
	}
	
	public static int whoIsWin(ArrayList<Card> user1, ArrayList<Card> user2){

		int u1 = score(user1);
		int u2 = score(user2);
		if( u1 < u2 )	return 1;
		if( u1 > u2)	return -1;
		return 0;
	}



}
	




}
