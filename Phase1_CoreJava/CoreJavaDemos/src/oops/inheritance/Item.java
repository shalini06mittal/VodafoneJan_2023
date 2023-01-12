package oops.inheritance;
// are of type Item
// parent or super or base
public class Item {

	private int itemid;
	private String desc;
	private double price;
	// if parent class has even 1 parameterized constructor then
	// better to add a default constructor or call the parameterized constructor from child class
//	public Item() {
//		// TODO Auto-generated constructor stub
//	}
	public Item(int itemid, String desc, double price) {
		System.out.println("Item parameterized  3 constructor");
		this.itemid = itemid;
		this.desc = desc;
		this.price = price;
	}
	public Item(int itemid, double price) {
		System.out.println("Item parameterized 2 constructor");
		this.itemid = itemid;
		this.price = price;

	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
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
		return "Item [itemid=" + itemid + ", desc=" + desc + ", price=" + price + "]";
	}
	
}
