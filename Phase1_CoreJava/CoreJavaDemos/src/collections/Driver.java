package collections;

public class Driver implements Comparable<Driver>{

	private Integer id;
	private String name;
	private String location;
	private String phone;
	public Driver() {
		// TODO Auto-generated constructor stub
	}
	public Driver(int id, String name, String location, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.phone = phone;
	}
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", location=" + location + ", phone=" + phone + "]";
	}
	@Override
	public int compareTo(Driver o) {
		// TODO Auto-generated method stub
		return getId().compareTo(o.getId());
	}
	
}
