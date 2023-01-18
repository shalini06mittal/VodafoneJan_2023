package threads;
/**
 * Thread
 * 
 * 1. Inheritance => extends Thread
 * 2. implement the run() => where mention the task thread will perform
 * 3. create object and call the start method
 */
public class MyThread extends Thread{
	
	private int start, stop;
	
	public MyThread() {
		// TODO Auto-generated constructor stub
	}
	
	public MyThread(int start, int stop) {
		// TODO Auto-generated constructor stub
		this.start = start;
		this.stop = stop;
	}
	@Override
	public void run() {
		
		for(int i=start;i<=stop;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" ended");
	}
	

}
