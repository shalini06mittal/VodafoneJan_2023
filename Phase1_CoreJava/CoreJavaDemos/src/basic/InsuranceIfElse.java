package basic;

import java.util.Scanner;

/*
Design for insurance system where insurance is provided based on following parameters . 
If person is married he/she is insured
If person is unmarried and female with age 25 and above is insured.
If person is unmarried and male with age 30 and above is insured.
WAP to take input gender, age and marital status as input. Find  whether person is insured or not.

 */
public class InsuranceIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gender m or f");
		char gender = sc.next().charAt(0);
		System.out.println("Enter marital status m or u");
		char ms = sc.next().charAt(0);
		System.out.println("Enter age");
		int age = sc.nextInt();
		if(ms=='m'|| ms=='M')
			System.out.println("Insured");
		else {
			if( (gender == 'f' && age>=25 ) || (gender == 'm' && age>=30) )
					System.out.println("Insured");
			else
				System.out.println("Not Insured");
		}
	}
}
