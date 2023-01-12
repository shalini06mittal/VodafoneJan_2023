package prodmngtsys.entity;

public class Product {

	private int pid;
	private String pname;
	private String desc;
	private double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pname, String desc, double price) {
		this.pid = pid;
		this.pname = pname;
		this.desc = desc;
		this.price = price;
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

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", desc=" + desc + ", price=" + price + "]";
	}
	
}
