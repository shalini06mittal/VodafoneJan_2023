package basic;

class Customer {
	private int id;
	public Customer(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + "]";
	}
	
}
public class CustomerArray {

	public static void main(String[] args) {
 		int a[] = new int[5];
 		System.out.println(a[0]);
		Customer []cutomers = new Customer[3];
		System.out.println(cutomers[0]);
		cutomers[0] = new Customer(10) ;
		cutomers[0].setId(1);
	}

}
