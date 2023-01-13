package oops.inheritance;
// are of type Item
// parent or super or base
// abstract classes
/**
 * 1. abstract is a keyword
 * 2. it can be declared at class and method level only
 * 3. Abstract classes cannot be instantiated means cannot create objects using new
 * 4. Abstract classes may or may not have abstract methods
 * 5. If a class has even 1 abstract method then it is mandatory to declare the class itself as abstract
 * 6. Abstract methods are the methods that have no implementation or no body and they
 * should either be implemented by the respective child classes or 
 * declare the child class itself as abstract 
 * @author Shalini
 *
 */
public abstract class Item {

	private int itemid;
	private String desc;
	private double price;
	
	
	public abstract void calculate();
	
	// if parent class has even 1 parameterized constructor then
	// better to add a default constructor or call the parameterized constructor from child class
	public Item() {
		// TODO Auto-generated constructor stub
	}
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
		return "itemid=" + itemid + ", desc=" + desc + ", price=" + price ;
	}
	
}
