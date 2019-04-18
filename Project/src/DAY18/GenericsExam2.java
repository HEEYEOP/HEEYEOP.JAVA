  package DAY18;

public class GenericsExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

class Fruit implements Eat{}

class Apple extends Fruit{}

class FruitBox<T extends Fruit & Eat> {}

interface Eat {}