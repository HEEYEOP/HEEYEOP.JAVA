package Day9;

public class Car1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		car.printCar();
		car.turnOn();
		car.printCar();
		
		car.setGear('D');
		for(int i =1; i<=50; i++)
			car.accCar();
		
		car.printCar();
		car.turnoff();
		car.printCar();
	
	}
	

}
