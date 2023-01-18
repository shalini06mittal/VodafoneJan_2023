package threads;

public class RunnableDemo {

	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		
		Thread t1 = new Thread(r1);
		t1.setName("R1");
		
		MyRunnable r2 = new MyRunnable();
		Thread t2 = new Thread(r2);
		t2.setName("R2");
		
		t1.start();
		t2.start();
		

	}

}
