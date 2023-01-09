package basic;

public class DataTypes_Variables {

	public static void main(String[] args) {
		// 8 data types
		/*
		 * basic or primitive or standard
		 * 
		 * byte : 1 bytes
		 * char : 2
		 * can store only integer number
		 * short : 2
		 * int : 4
		 * long : 8
		 * can store decimal values
		 * float : 4
		 * double : 8
		 * boolean : JVM specific (true or false)
		 * 
		 * derived
		 * String :  "true"
		 */
		// variables => they are like containers that store values/ data
		// values can vary 
		// represent the memory location
		/**
		 * 1. they can start only with alphabets _ or $
		 * 2. they can contain numbers or _ or $ but no other symbols are allowed
		 * 3. Variables cannot be keywords
		 */
		// craete a variable of type num that can store integer values
		int num; // variable declaration
		num = 10; // variable initialization
		
		// declaration and initialization or assignment
		int age = 10;
		int temp1 = 10, temp2;
		
		char vowel = 'a';
		double price = 1000.67;
		boolean choice = true;
		double discamt = price - price * 10/100;
		// Amount to be paid : 
		System.out.println("Amount to be paid : "+discamt);
		/**
		 * Declare 2 variables cp and profit and initialize them 
		 * with cp = 1500 , profit = 200
		 * calculate profit percentage and display the output 
		 * profit/ cp * 100
		 */
		double cp = 1500, profit = 200;
		double profper = profit / cp *100;
		System.out.println("Profit percentage is "+profper);
	}

}
