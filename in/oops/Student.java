package in.oops;

public class Student {

	public void hello() {
		System.out.println("Hello My Friend");
	}

	static void greet() {
		System.out.println("Hi GoodMorning");
	}

	public static void main(String[] args) {
		Student s = new Student();
		Student.greet();
		s.hello();
	}

}
