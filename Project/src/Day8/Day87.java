package Day8;

// 접근제한자 : public
// 클래스에 public을 붙일 수 있는 경우는 단 하나다.
// 클래스명과 파일명이 일치하는 경우에만 public을 붙일 수 있다.


// 접근제한자 : default
// 접근제한자 default는 default라는 키워드를 쓴 것이 아니라, 클래스나 메소드에 접근제한자를 명시하지 않은 경우를 default라 한다.
// default는 같은 패키지안에서만 접근 가능하다.


// 접근제한자 : private
// 일반적으로 멤버 메소드나 멤버 변수에 붙이고, 자신(해당 멤버 메소드를 포함하는 클래스)을 제외한 다른 클래스에서 사용할 수 없다.

public class Day87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv t = null;		// t는 참조변수 
		t = new Tv(); 		// Tv()라는 생성자를 호출해서 객체를 생성.
		
		/*t.printVolume();
		t.volumeUp();
		t.printVolume();*/
		
		t.printChannel();
		
		t.channelUp();
		t.printChannel();
		
		
		t.channelUp();
		t.printChannel();
		
		
		t.channelDown();
		t.printChannel();
		
		
		t.setChannel(5);
		t.printChannel();
		
		
	
	
	}//main꺼-----------
	

	
}//class꺼 ---------


class Tv{
	
	//일반적으로 멤버 변수는 접근제한자를 private로 설정하여 멤버 변수를 직접 수정할 수 없게 하고, 멤버 메소드를 통해 수정하도록 한다.
	
	//멤버 변수 : 부품, 요소
	private int channel;
	private int volume;
	private final int MAX_CHANNEL = 100;
	private final int MAX_VOLUME = 100;
	
	//-------------------------------------
	
	//일반적으로 멤버 메소드는 접근제한자를 public으로 많이 한다.
	
	//멤버 메소드 : 기능 
	
	//기능 : 멤버 변수 volume의 크기를 하나 증가, 감소, 프린트 하는 메소드
	//매개변수 : 없다 -> void(써도 되고 안써도 된다)
	//리턴타입 : 없다 -> void
	//메소드명 : volumeUp , volumeDown, printVolume,
	
	public void volumeUp(){
		if(MAX_VOLUME> volume)
			volume ++;	
	}
	
	public void volumeDown(){
		if(volume > 0)
			volume --;	
	}
	
	public void printVolume(){
		System.out.println(volume);
	}
	
	//채널 업다운 -------------
	
	public void channelUp(){
		if(MAX_CHANNEL > channel)
			channel ++;
	}
	
	public void channelDown(){
		if(channel > 0)
			channel --;
	}
	
	public void setChannel(int ch){
		channel = ch;
	}
	
	public void printChannel(){
		System.out.println("현재 채널 :"+ channel);
	}
	
	
	
	 
	
	
}