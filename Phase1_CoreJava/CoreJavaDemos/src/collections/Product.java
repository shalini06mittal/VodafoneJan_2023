package collections;

import java.util.Objects;

public class Product {

	private int pid;
	private String pname;
	private String desc;
	private double price;
	private String brand;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pname, String desc, double price) {
		this.pid = pid;
		this.pname = pname;
		this.desc = desc;
		this.price = price;
	}

	public Product(int pid, String pname, String desc, double price, String brand) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.desc = desc;
		this.price = price;
		this.brand = brand;
	}

	
	@Override
	public int hashCode() {
		System.out.println("Hashcode");
		return Objects.hash(brand, desc, pid, pname, price);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(desc, other.desc) && pid == other.pid
				&& Objects.equals(pname, other.pname)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", desc=" + desc + ", price=" + price + ", brand=" + brand
				+ "]";
	}
	
}
