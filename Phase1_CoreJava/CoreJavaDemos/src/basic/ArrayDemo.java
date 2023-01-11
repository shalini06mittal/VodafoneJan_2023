package basic;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		/*
		 *  1. collection of data of same type
		 *  2. it is stored in continous memory locations
		 *  3. size once declared is fixed
		 *  4. uses [] syntax to create arrays
		 *  5. arrays support indexing
		 */

		int x;
		x = 10;

		int arr[];// declared an array
		// new - used to reserve memory
		// int - 4
		// 5*4 = 20 bytes
		// create an arra
		//arr[] = new int[5]; // wrong syntax
		arr = new int[5];
		// initialize the array
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 3;
		arr[3] = 8;
		arr[4] = 5;
		//System.out.println(arr[3]);

		// declarations and creation
		int nos[] = new int[30];
//		System.out.println(nos.length);
//		System.out.println(nos[0]);
//		for(int i=0;i<nos.length;i++)
//		{
//			nos[i] = i+1;
//		}
//		for(int i=0;i<nos.length;i++)
//		{
//			System.out.println(nos[i]);
//		}

		// declare, create and initialize
//		double temps[]= {30.56, 25.89, 56.90, 77.90};
//		System.out.println(temps.length);

		/**
		 * Create an array to store 5 telephone numbers and 
		 * ask the user to enter their tel no
		 * Print Number found if it exists in the array
		 * else print not found
		 */
		int phbook[] = {1234578899, 1989898989, 1878787878,  1343434343, 1676767676};
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter ph no to search");
//		int no = sc.nextInt();
//
//		boolean found = false;
//		for(int i=1;i<phbook.length;i++) {
//			if(no == phbook[i])
//			{
//				found = true;
//				break;
//			}
//		}
//		if(found)
//			System.out.println("Phone number found");
//		else
//			System.out.println("Phone number not found");


		String phone;
		String[] phonebook=new String[5];
		
		for (int i = 0; i < 5 ; i++) {
			System.out.println("Enter your phone number");
			phone = sc.next();//2
			boolean exists = false;
			for (int j = 0; j <5 ;j++ ) {
				if (phonebook[j]!=null && phonebook[j].contains(phone))
				{
					System.out.println("phone is already exists");
					i--;
					exists = true;
					break;
				}
			}
			if(!exists) 
				phonebook[i] = phone;//1 2
		}
		System.out.println("All the list of phone numbers");
		for (int i = 0; i < 5 ; i++) 
			System.out.println(phonebook[i]);

	}

}

