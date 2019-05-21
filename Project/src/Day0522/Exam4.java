package Day0522;

import java.util.ArrayList;
import java.util.Collections;


public class Exam4{	
	public static void main(String[] args){
		
		CardPack cp = new CardPack();
		cp.shuffle();
		cp.show();
		System.out.println();

		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.show();
	}
}


class CardPack{

	private ArrayList<Card> list = new ArrayList<Card>();
	
	//기본생성자
	public CardPack(){
		cardPackSetAll();
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

	public void cardPackSetAll(){
		list.clear();
		cardPackSet("S");
		cardPackSet("C");
		cardPackSet("H");
		cardPackSet("D");
	}

	public void show(){
		for(int i=0; i<list.size();i++){
			System.out.print(list.get(i) + " ");
			if( (i+1)% 10 == 0){
				System.out.println();
			}
		}
	}

	public void shuffle(){
		Collections.shuffle(list);
	}
	public Card give(){
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
