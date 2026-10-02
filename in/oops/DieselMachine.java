package in.oops;

public abstract class DieselMachine {
	
	public DieselMachine() {
		System.out.println("Desiel Mechine - Constructor");
	}
	
	public void start() {
		System.out.println("Start Method()");
	}
	
	public abstract void fillfuel();

}
