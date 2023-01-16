package exception;

public class ThrowThrowsDemo {
// throw is used to manually throw an exception from your code
	// throws is used at method definition if method
	// is throwing a checked exception
	public static void squarerootUnchecked(int no)
	{
		if(no <= 0)
			throw new RuntimeException("no cannot be negative");
		else
			System.out.println(Math.sqrt(no));
	}
	public static void squarerootChecked(int no) throws Exception
	{
		if(no <= 0)
			throw new Exception("no cannot be negative");
		else
			System.out.println(Math.sqrt(no));
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		squarerootUnchecked(20);
		try {
		squarerootUnchecked(-20);
		}catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Main In Between");
		try {
			squarerootChecked(-2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main END");
		
	}

}
