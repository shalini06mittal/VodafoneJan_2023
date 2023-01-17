package collections.assignment;

public class Customer {

	private int id;
	private String email;
	private String city;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String email, String city) {
		super();
		this.id = id;
		this.email = email;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", city=" + city + "]";
	}
	
}
