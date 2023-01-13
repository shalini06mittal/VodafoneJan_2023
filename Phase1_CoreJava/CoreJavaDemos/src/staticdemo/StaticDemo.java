package staticdemo;

public class StaticDemo {

	public static void main(String[] args) {
		
		Counter obj1 = new Counter();
		Counter obj2 = new Counter();
		Counter obj3 = new Counter();
		Counter obj4 = new Counter();
		Counter obj5 = new Counter();
		
		System.out.println(obj1.getX());
		
		System.out.println(obj1.getY());
		
		System.out.println(Counter.getY());
		
	}
}
