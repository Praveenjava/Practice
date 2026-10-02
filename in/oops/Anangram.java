package in.oops;

import java.util.Arrays;

public class Anangram {
	public static void main(String[] args) {
		String s = "listen";
		String s1 = "silent";
		
		char[] a = s.toCharArray();
		char[] b = s1.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean equals = Arrays.equals(a, b);
		if(equals) {
			System.out.println("Anangram");
		}else {
			System.out.println("It not Anangram");
		}
	}

}
