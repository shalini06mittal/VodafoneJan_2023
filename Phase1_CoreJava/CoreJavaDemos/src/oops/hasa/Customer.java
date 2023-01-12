package oops.hasa;

public class Customer {

	private String email;
	private String cname;
	// has-a relationship 1 to 1
	private Address address;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String email, String cname, Address address) {
		super();
		this.email = email;
		this.cname = cname;
		this.address = address;
	}
	public Customer(String email, String cname) {
		super();
		this.email = email;
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", cname=" + cname + ", address=" + address + "]";
	}
	
}
