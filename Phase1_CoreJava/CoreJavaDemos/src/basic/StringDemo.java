package basic;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		String s1 ="Hello";
		String s2 ="Hello";
		String s3 =s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter str");
		String s4 =sc.next();
		// == compares memory address and equals compares content
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println();
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println();
		String s5="Simpli Learn";
		String s6="Simpli ";
		String s7 = "Learn";
		String s8=s6+s7;
		System.out.println(s8);
		System.out.println(s5==s8);
		System.out.println(s5.equals(s8));
		
	}
}
