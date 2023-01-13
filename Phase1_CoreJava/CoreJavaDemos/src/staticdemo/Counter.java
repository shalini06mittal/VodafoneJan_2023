package staticdemo;

/**
 * 1. static is an access modifier
 * 2. static can be applied to instance variables , methods or inner class
 * 3. static cannot be applied to local variables
 * 4. static are like global variable meaninig they are shared across objects
 * 5. static methods cannot access non-static methods
 * 6. static members are called directly using class name, no need of class object
 * 7. static is used when you have some constant value or for values which are shared across objects 
 * 
 * @author Shalini
 *
 */
public class Counter {

	int x; // instance
	private static int y; // static
	public static final String company = "Vodafone";
	public final int ff = 100;
	public Counter() {
		
		x++;
		y++;
	}

	public int getX() {
		return x;
	}

	public static int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public static void setY(int y) {
		Counter.y = y;
	}
	
	
	
	
}


