package basic;

import java.util.Scanner;

public class LoopsPrograms {

	public static void main(String[] args) {
		/**
		 * Take 5 numbers as input and print the squares
		 */
		Scanner sc = new Scanner(System.in);
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println("Enter value "+i);
//			int no = sc.nextInt();
//			System.out.println(no*no);
//		}

		/*
		 * item1 1000
		 * item2 400
		 * item3 900
		 * ..
		 * item5
		 */
//		int sum = 0; // accumulator
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println("Enter amount for item "+i);
//			int price = sc.nextInt();
//			sum = sum + price;
//		}
//		System.out.println(sum);
		
		/**
		 * WAP to take 5 numbers as input and print the 
		 * sum of all the even numbers entered by the user
		 */
//		int se=0;
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println("Enter value "+i);
//			int no = sc.nextInt();
//			if(no%2==0)
//				se += no; // se = se + no
//		}
//		System.out.println("Sum of even nunbers "+se);
		
		/*
			password verification
			can create a variable to temporary store the right password
			1234
			ask the user to enter the password to log in
			1233
			stop the program either the password entered is correct
			or the no of tries are over


		 */
		int correct = 1234;
		int noofattempts = 3;
		do {
			System.out.println("Enter password");
			int pwd = sc.nextInt();
			if(pwd == correct)
			{
				System.out.println("password is correct");
				break;
			}
			else {
				System.out.println("No of attempts left "+--noofattempts);
			}
			
		}while(noofattempts != 0);
		
		if(noofattempts == 0)
			System.out.println("Acoount Locked");
	}

}
