package threads;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getName());
		MyThread t2 = new MyThread(1,20);
		t2.setName("T2");
		t2.start();
		
		MyThread t1 = new MyThread(11,35);
		t1.setName("T1");
		t1.setDaemon(true);		
		t1.start();
	// sorting => 1 lakh => 25k 25k 25k 25k 
		System.out.println("waiting");
		t2.join();
		System.out.println("Main Ends");
		
	}

}
