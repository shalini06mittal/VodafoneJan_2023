package exception;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class ExceptionDemo {

	Logger logger = Logger.getLogger("My Logger");
	// log4j library 

	public static void main(String[] args) {
		
		/**
		 * compile time => syntax error
		 * runtime => at the time of execution
		 * integer => string
		 * access a file => 
		 * logical => Business logic  (5 + 5 = 10 , 25 )
		 * employee => 10 cols, 7 
		 * exception handling
		 */
		Scanner sc = new Scanner(System.in);
		int n1=0, n2=0;
		try {
			System.out.println("enter number 1");
			n1 = sc.nextInt();
			System.out.println("enter number 2");
			n2 = sc.nextInt();
			System.out.println("Div "+ (n1/n2));// denominator cannot be zero
			String s = null;
			System.out.println(s.toUpperCase());
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input is wrong");
			//e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println("division cannnot be done as Denominato cannot be zero");
			e.printStackTrace();
		}
		// generic one should always be in the last
		catch(Exception e)
		{
			System.out.println("Something went wrong please try again or contact admin");
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			// releasing the resources
			// executes in any scenario
			System.out.println("finally block");
		}
		System.out.println("Add "+ (n1+n2));
		File file = new File("hello.txt");
		System.out.println(file.exists());
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("release resources");
		}
		System.out.println(file.exists());
	}

}
