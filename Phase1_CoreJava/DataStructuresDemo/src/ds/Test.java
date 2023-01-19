package ds;

public class Test {

	public static void main(String[] args) {
	
		MyStack ob = new MyStack();
		System.out.println(ob.isEmpty());
		System.out.println(ob.isFull());
		System.out.println(ob.push(10));
		ob.push(5);
		ob.push(100);
		System.out.println(ob.isEmpty());
		ob.push(20);
		ob.push(40);
		System.out.println(ob.push(10));
		System.out.println(ob.pop());
		System.out.println(ob.pop());
	}

}
