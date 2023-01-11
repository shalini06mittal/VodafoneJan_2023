package oops;

public class TestBox {

	public static void main(String[] args) {
		Box b1 = new Box();
		System.out.println(b1.calVolume());
		//new Box();
		System.out.println(b1);
		
		int a[] = new int[5];
		a[0]=10;
		System.out.println(a[0]);
		
		Box b2 = new Box(3, 4, 5);
		System.out.println(b2.getColor());
		b2.setColor("Yellow");
		System.out.println(b2.getColor());
		System.out.println(b2.calVolume());
		
		System.out.println();
		int x = 10;
		System.out.println(x);// 10
		System.out.println(b2); // string representation of object b2
	}

}
