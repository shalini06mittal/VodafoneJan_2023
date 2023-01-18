package threads;
/**
 * 1. Implements Runnable
 * 2. Override the run()
 * 3. Implement run() what task will be performed by this method
 * 4. Craete Runnable class object 
 * 5. Pass this object as a parameter to Thread class constructor
 * 6. Say start
 */
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(char c='A';c<='E';c++) {
			System.out.println(Thread.currentThread().getName()+" "+c);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
