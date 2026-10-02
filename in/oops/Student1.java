package in.oops;

public class Student1 extends User{
	int rank;
	
	public Student1() {
		System.out.println("Child-- Params Construcor");
	}
	
	public void m1() {
		System.out.println("m1() Method");
	}
	public static void main(String[] args) {
		Student1 stu = new Student1();
		stu.name="Praveen";
		stu.id =101;
		stu.rank=1;
		stu.m1();
		
		System.out.println(stu.name+"--"+stu.id+"--"+stu.rank);
	}

}
