package in.oops;

public class Student2 extends User1 {
	int rank;

	public static void main(String[] args) {
		Student2 stu = new Student2();
		stu.rank = 1;
		stu.id = 2;
		stu.name = "Praveen";

		System.out.println(stu.rank + "-" + stu.id + "-" + stu.name);
	}

}
