package entity;

public class Customer {

	private String email;
	private String phone;
	private String password;
	private String city;
	private boolean ismember;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String email, String phone, String password, String city, boolean ismember) {
		super();
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.city = city;
		this.ismember = ismember;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isIsmember() {
		return ismember;
	}

	public void setIsmember(boolean ismember) {
		this.ismember = ismember;
	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", phone=" + phone + ", password=" + password + ", city=" + city
				+ ", ismember=" + ismember + "]";
	}
	
}
