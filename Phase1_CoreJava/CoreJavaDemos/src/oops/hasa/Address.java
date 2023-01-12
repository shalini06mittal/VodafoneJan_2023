package oops.hasa;

public class Address {

	private int aid;
	private String city;
	private String country;
	public Address(int aid, String city, String country) {
		super();
		this.aid = aid;
		this.city = city;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", country=" + country + "]";
	}
}
