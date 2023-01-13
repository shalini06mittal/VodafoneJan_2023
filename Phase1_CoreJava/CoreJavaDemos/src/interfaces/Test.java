package interfaces;

public class Test {

	public static void payMode(Payment payment)
	{
		payment.pay();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		payMode(new CreditCard());
		payMode(new Neft());
	}
}
