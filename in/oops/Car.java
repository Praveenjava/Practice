package in.oops;

public class Car {

	void drive() {
		Engine e = new Engine();
		e.start();
		System.out.println("Journey Started..");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.drive();
	}

}
