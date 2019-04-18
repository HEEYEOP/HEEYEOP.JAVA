package DAY18;

import DAY18.Card.Kind;

public class EnumExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
class Card{
	
	enum Kind {SPACE(1), CLOVER(2), HEART(3), DIA(4);
	
	
	private final int value;
	
	Kind(int value) {this.value = value;}
	
	public int getValue() { return value;}
	
	}
	
}
