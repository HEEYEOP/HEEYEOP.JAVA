package Day9;

public class Tv {
	//일반 멤버 변수, 객체 멤버 변수
	private int channel;
	private int volume;
	private final int MAX_CHANNEL = 500;
	private final int MAX_VOLUME = 100;
	
	//클래스 멤버 변수
	public static final String BRAND ="삼성" ;
	
	
	//-----------------------------------------
	
	
	//일반 멤버 메소드, 객체 멤버 메소드
	public void channelUp(){
		if(channel < MAX_CHANNEL)
		channel++;
	}
	public void channelDown(){
		if(channel>1)
			channel --;
	}
	public void setChannel(int ch){
		if( ch == 0)
			channel = 1;
		else if(ch > MAX_CHANNEL)
			channel = MAX_CHANNEL;
		else
			channel = ch;
		
	}
	public void volumeUp(){
		if(MAX_VOLUME > volume)
			volume++;
	}
	
	public void volumeDown(){
		if(volume > 0)
			volume--;
	}
	
	public void printVolume(){
		System.out.println("현재 소리 크기 :"+ volume);
	}
	public void printChannel(){
		System.out.println("현재 채널 번호 :"+ channel);
		//System.out.println(BRAND);		//	객체멤버 메소드에서는 클래스 멤버 변수 또는 클래스 멤버 메소드를 사용할 수 있다있다있다!!
	}
	
	
	public static void printBrand(){
		System.out.println("TV 브랜드 :" + BRAND);
		//System.out.println(channel);		//	오류발생---> 클래스 멤버 메소드에서는 객체 멤버 변수는 사용할 수 없다
		
	}
	
	
	//멤버 메소드는 원하는 시점에서 호출이 가능하지만, 생성자는 객체를 생설할 때에만 호출한다
	//객체 멤버 변수를 초기화
	//생성자가 없을 때 기본생성자가 컴파일러에 의해 자동으로 추가된다.
	
	//기본 생성자 없이 다른 생성자를 만들고, 기본생성자를 호출하면 에러가 난다.
	
	public Tv(){   				//기본생성자
		
		this(1,10);
		/*
		channel = 1;
		volume = 10;
		*/
	}
	
	public Tv(int channel, int volume){
		setChannel(channel);
		
		if(volume > MAX_VOLUME)
			this.volume = MAX_VOLUME;		
		else
			this.volume = volume;

	}
	
	//복사 생성자
	public Tv(Tv stv){
		this(stv.channel , stv.volume);
		
		/*
		channel = stv.channel;
		volume = stv.volume;
		*/
		
	}
	
	
	
} //class꺼 -------------
