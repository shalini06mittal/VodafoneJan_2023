package basic;

import java.util.Scanner;

public class NestedLoopProgram {

	public static void main(String[] args) {
		/*
		 * Take input how many customers and for each customer ask for how many bills 
		 * and the customer name. 
		 * Print customer name and total of all the bills 
		 * for that customer
		 * 
		 * Output:
		 * How many customers : 3
		 * enter name of customer 1 : Shalini
		 * how many bills for customer 1 : 2
		 * enter amt for bill 1 : 100
		 * enter amt for bill 2 : 200
		 * 
		 * Shalini has to pay total 300/-
		 * 
		 * enter name of customer 2 : Shalini
		 * how many bills for customer 2 : 2
		 * enter amt for bill 1 : 100
		 * enter amt for bill 2 : 200
		 * 
		 * Shalini has to pay total 300/-
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("How many customers");
		int noofcustomers = sc.nextInt();
		//int noofbills = 0;
		int totalamount = 0;
		for(int i=1;i<=noofcustomers;i++)
		{
			System.out.println("Enter name of customer "+i);
			String name = sc.next();
			System.out.println("Enter no of bills for customer "+name);
			int noofbills = sc.nextInt();
			totalamount = 0;
			for(int j=1;j<=noofbills;j++)
			{
				System.out.println("Enter amount for bill "+j);
				totalamount += sc.nextInt();
			}
			System.out.println(name+" has to pay total "+totalamount);
			System.out.println();
		}
		
	}

}
