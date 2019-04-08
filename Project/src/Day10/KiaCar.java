package Day10;

import Day9.Car;

public class KiaCar extends Car{
	public final static String brand ="KIA";

	public KiaCar(){
		
		//speed =1;		// 접근불가 ---> 부모에서 접근제한자가 private이기 때문에
		
		setSpeed(0);
		
		
	}
}
