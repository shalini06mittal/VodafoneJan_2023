package basic;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		/**
		 * unary : operates on single operand and modified the value
		 * ++ pre/post incr
		 * -- pre/post decr 
		 * -
		 * !
		 * binary : operate on 2 operands
		 * arithmetic : + - * / %
		 * relational/comparison < > <= >= == !=
		 * logical : & && | ||
		 * ternary : operates on 3 operands ?:
		 */
		// UNARY
		/*
		 * x = 10
		 * m = x
		 * x = x+1
		 */
		int x = 10;
		int m = x++; // post incr
		System.out.println(x);
		System.out.println(m);
		System.out.println();
		/*
		 * x1 = 10
		 * x1 = x1+1
		 * m1 = x1
		 */
		int x1 = 10;
		int m1 = ++x1; // pre incr
		System.out.println(x1);
		System.out.println(m1);
		
		int a=1, b=2;
		int r = a++ + a/5;
		// r = 1 + 2/5 = 1 + 0
		System.out.println(r+" "+a );
		
		// arithmetic 
		System.out.println(5/2); // integer
		System.out.println(5.0/2); // double
		System.out.println(20+20);
		System.out.println(34-12);
		System.out.println(5%2);// remainder
		
		// relational 
		System.out.println(20<20);
		System.out.println(20==20);
		System.out.println(20<=20);
		System.out.println(20>20);
		System.out.println();
		// logical 
		// Is 25 divisible by 3 and 5 : 	
		// Is 25 divisible by 3 or 5
		// login un and pwd
		// registration : linkedin, google, 
		System.out.println(25%3==0 && 25%5==0);
		System.out.println(25%3==0 || 25%5==0);
		System.out.println();
		int p = 5;
		// && || short circuit 
		System.out.println(p++ > 5 & p++ == 6);//F
		System.out.println(p);
	
		// ternary
		// (expn that evaluates to a boolean value) ? <if condition is true>
		// : <if condition is false>
		// take input from the user
		System.out.println("Enter your age");
		// defined the source of input
		// jdk5 DataInputStreamReader
		// BufferedReader
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		String res = (age >= 18) ? "Can Vote ": "Cannot vote";
		System.out.println(res);
		
		System.out.println("Enter total amount of the bill");
		double amt = sc.nextDouble();
		// if amt > 10000 give a 10% discount 
		double totalamt = (amt > 10000) ? amt - amt * 10/100 : amt; 
		System.out.println(totalamt);
		
		/*
		 * leap year?
		 * 2000 => Y %4 and %100 and %400 
		 * 1996 => Y %4 and ! %100 
		 * 1900 => N %4 and %100 but !%400 NLY
		 * take year as input and print if it s LY or not
		 */
		System.out.println("Enter a year");
		int year = sc.nextInt();
		String isLeapYear = ( (year % 4==0 && year %100==0 && year%400==0)
							|| (year%4==0 && year % 100 !=0) ) ? "Leap year" : "Not Leap year";
		System.out.println(isLeapYear);
	}

}
