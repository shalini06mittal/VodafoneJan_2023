package basic;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		/**
		 * take the cp and sp as input 
		 * profit or loss
		 * profit or loss per
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cp");
		double cp = sc.nextDouble();
		System.out.println("Enter sp");
		double sp = sc.nextDouble();
		if(cp>sp) {
			double loss = cp-sp; 
			double lossper = loss/cp*100  ;
			System.out.println();
		}
		else {
			double profit = sp-cp; 
			double pper = profit/cp*100;
		}

		int x = 10, y=20;
		if(x>=10) 
			if(y==20) 
				System.out.println(1);
			else 
				System.out.println(2);
		System.out.println(3);
		/**
		 * 
		 */

	}

}
