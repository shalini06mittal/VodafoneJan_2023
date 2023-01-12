package oops.hasa;

public class TestHasA {

	public static void main(String[] args) {
		Address a1 = new Address(1, "C1", "Country1");
		Customer c1= new Customer("em@g.c", "EM", a1);
		System.out.println(c1);

	}

}
