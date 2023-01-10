package basic;

import java.util.Scanner;

public class SwichCaseDemo {

	public static void main(String[] args) {

		/**
		 * dice => 1,2,3,4,5,6
		 * playing cards => hearts (13 1 to 10 J Q K A)
		 * registration => dropdown (country)
		 * 5 countries =>  India 
		 * state
		 * city
		 * state
		 * toss a coin heads and tails
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("enter dice value");
		int dice = sc.nextInt();//3
		switch(dice ) {
		case 1: // dice ==1
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3: 
			System.out.println(3);
			break;
		case 4:
			System.out.println(4);
			break;
		case 5:
			System.out.println(5);
			break;
		case 6 :
			System.out.println(6);
			break;
		default:
			System.out.println("roll over again");
		}

		System.out.println("enter a alphabet");
		char vowel = sc.next().charAt(0);
		
		switch(vowel)
		{
		case 'a': 
		case 'e': 
		case 'i': 
		case 'o': 
		case 'u': System.out.println("Yes its a vowel");
		break;
		default:
			System.out.println("It is a consonant");
		}


	}

}
