package collections;

import java.util.Arrays;
import java.util.List;

interface Calculator{
	public void calculate(int no);
}
class ICalculatorImplSquare implements Calculator{

	@Override
	public void calculate(int no) {
		System.out.println(no*no);
	}
	
}
class ICalculatorImplCubes implements Calculator{
	@Override
	public void calculate(int no) {
		System.out.println(no*no*no);
	}
	
}

public class AnonymousInterface {

	public static void main(String[] args) {
		Calculator c = new ICalculatorImplSquare();
		// Arrays.aslist is a convenient method to initialize a list
		List<Integer> nos = Arrays.asList(1,2,3,4,5);
		
		for(Integer n : nos)
			c.calculate(n);
		
		System.out.println();
		
		c = new ICalculatorImplCubes();
		for(Integer n : nos)
			c.calculate(n);
		
		// square root of the numbers, below class has no name means anonymous inner class
		// not known is the class name
		// what is known the name of the interface
		System.out.println();
		c = new Calculator(){
			@Override
			public void calculate(int no) {
				System.out.println(Math.sqrt(no));
			}
		};
		
		// below part is same as line no 45
		//c= (n1) -> System.out.println(Math.sqrt(n1));
		
		for(Integer n : nos)
			c.calculate(n);

		
	}

}
