package basic;

import java.util.Scanner;

public class NestedArray {

	public static  double[] getitembill(int y) // y = 5

	{
		Scanner sc = new Scanner(System.in);
		int t,s;
		double billarr[] = new double [y];
		for (t=0; t<y; t++) 
		{
			s=t+1;
			System.out.println("Enter item " + s +" cost :" );
			billarr[t] = sc.nextDouble();
		}
		return billarr;
	}
	public static void main(String[] args) {

		/**
		 * double[][] prodcostlist = new double[custerno][] ;

		for (i=0; i<custerno;i++)
		{
			System.out.println("Enter customer's name");
			customername[i] = sc.next();
			System.out.println("Enter amount of items purchased by "+ customername[i] + " : ");
			k=sc.nextInt();
			prodcostlist[i] = new double[k];
			prodcostlist[i]=billmag.getitembill(k);
			
			jagged array => rows may have different columns
		 */
		double prodcostlist[][]= new double[2][];
		prodcostlist[0] = new double[3];
		prodcostlist[0] = getitembill(3);
		prodcostlist[1] = new double[2];
		prodcostlist[1] = getitembill(2);
		
		System.out.println();
		System.out.println("Details");
		for (int i = 0; i < 2; i++) {
			for(int j=0;j<prodcostlist[i].length;j++)
			System.out.print(prodcostlist[i][j]+" ");
			System.out.println();
		}
		
	}

}
