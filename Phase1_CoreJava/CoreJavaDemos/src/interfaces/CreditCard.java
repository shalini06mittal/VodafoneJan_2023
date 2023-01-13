package interfaces;

public class CreditCard implements Payment, Notifications
{

	@Override
	public void pay() {
		System.out.println("paying by credit card ollecting info");
		
	}

	@Override
	public void sendMessages(String data) {
		// TODO Auto-generated method stub
		
	}
}
