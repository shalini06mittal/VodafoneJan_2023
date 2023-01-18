package threads;


class TaskThread extends Thread{
	private Account account;
	private double amount;
	
	public TaskThread(String name, Account account, double amount)
	{
		super(name);
		this.account = account;
		this.amount = amount;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" in run");
		account.withdraw(amount);
	}
}

public class AccountThread {

	public static void main(String[] args) {
		Account a1 = new Account("A1", 1000);
		Account a2 = new Account("A2", 5000);
		TaskThread t1 = new TaskThread("T1", a2, 500);
		TaskThread t2 = new TaskThread("T2", a2, 2000);
		TaskThread t3 = new TaskThread("T3", a1, 500);
		t1.start();
		t2.start();
		t3.start();

	}

}
