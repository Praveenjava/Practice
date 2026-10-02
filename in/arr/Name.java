package in.arr;

public class Name {
	public static void main(String[] args) {
		String s = "Manish";
		s=s.intern();
		System.out.println(s);
		
//		String s1 = new String("hello");
//		String s2 = "hello";
//
//		System.out.println(s1 == s2); // false
//
//		String s3 = s1.intern();
//
//		System.out.println(s3 == s2); // true
//		
//		String s1 = new String("test");
//		String s2 = new String("test");
//
//		System.out.println(s1 == s2);      // false
//		System.out.println(s1.equals(s2)); // true
//
//		System.out.println(s1.intern() == s2.intern()); // true

	}

}
