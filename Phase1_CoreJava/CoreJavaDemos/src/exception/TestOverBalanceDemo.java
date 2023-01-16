package exception;

public class TestOverBalanceDemo {

	public static void withdraw(double amount) throws OverBalanceExcpetion
	{
		if(amount >= 10000)
			throw new OverBalanceExcpetion("Limit over flow");
	}
	public static void main(String[] args){
		double amount = 12000;
		
		try {
			withdraw(amount);
		} catch (OverBalanceExcpetion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
