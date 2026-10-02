package in.oops;

public class Machine extends DieselMachine {

	public Machine() {
		System.out.println("Machine-Constructor");
	}

	public void fillfuel() {
		System.out.println("Filling Fuel Tank");
	}

	public static void main(String[] args) {
		Machine m = new Machine();
		m.fillfuel();
		m.start();
		
	}

}
