package oops;
// UI
public class TestCustomer {

	public static void main(String[] args) {
	
		Customer c1 = new Customer();
		c1.initialize("shalinigmail.com","shalini");
//		c1.email="shalini@gmail.com";
//		c1.name="Shalini";
		//System.out.println(c1.name.toUpperCase());
		String msg = c1.displayName();
		
		System.out.println(msg);
		//c1.email="dummy";
		System.out.println(c1.displayEmail());
		
		Customer c2 = new Customer();
		c2.initialize("sia@gmail.com","sia");
//		c2.email="maya@gmail.com";
//		c2.name="Maya";
		//System.out.println(c2.name.toUpperCase());
		System.out.println(c2.displayName());
	}
}
