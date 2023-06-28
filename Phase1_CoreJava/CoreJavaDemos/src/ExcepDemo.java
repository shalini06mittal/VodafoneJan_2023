import java.util.Scanner;

public class ExcepDemo {

	public static void main(String[] args) {
		
		/**
		 * try
		 * catch
		 * throw
		 * throws
		 * finally
		 */
		// checked IOException, FileNotFoundException, SQLException
		// unchecked NullPointerException, ArithmeticException, ArraysIndexOutOfBoundsException,
		// NumberFormatException, StringIndexOutOfBoundsException
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt();
		try {
			System.out.println(n1/n2); // 2/0
			String s ="";
			System.out.println(s.length());
		}
		catch(ArithmeticException ae)
		{
			System.out.println("n2 cannot be 0");
		}
		catch(NullPointerException npe)
		
		{
			
		}
		finally {
			System.out.println("fianlly");
		}
		System.out.println(n1+n2);
	}

}
