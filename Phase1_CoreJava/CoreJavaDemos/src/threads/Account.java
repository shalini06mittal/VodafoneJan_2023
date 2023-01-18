package threads;

public class Account {

	private String accholder;
	private double balance;
	public Account(String accholder, double balance) {
		super();
		this.accholder = accholder;
		this.balance = balance;
	}
	public String getAccholder() {
		return accholder;
	}
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/*
	 *When not synchronized and shared instance 
T1 in run
T1 in withdraw
T2 in run
T2 in withdraw
T2 Done in withdraw
T1 Done in withdraw
Balance in A2 4500.0
Balance in A2 4500.0

when synchronized and shared instance
T2 in run
T2 in withdraw
T1 in run
T2 Done in withdraw
Balance in A2 3000.0
T1 in withdraw
T1 Done in withdraw
Balance in A2 2500.0

when synchronized but shared and unshared instance
T3 in run
T3 in withdraw
T2 in run
T2 in withdraw
T1 in run
T3 Done in withdraw
T2 Done in withdraw
Balance in A1 500.0
Balance in A2 3000.0
T1 in withdraw
T1 Done in withdraw
Balance in A2 2500.0
	 */
	public synchronized boolean withdraw(double amount)
	{
		System.out.println(Thread.currentThread().getName()+" in withdraw");
		double initial = getBalance();
		boolean flag = false;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(initial - amount > 0)
		{
			initial -= amount;
			setBalance(initial);
			flag = true;
		}
		System.out.println(Thread.currentThread().getName()+" Done in withdraw");
		System.out.println("Balance in "+getAccholder()+" "+balance);
		return flag;
	}
	
	
}
