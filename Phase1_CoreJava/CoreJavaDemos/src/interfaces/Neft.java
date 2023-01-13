package interfaces;

public class Neft implements Payment{

	public void pay()
	{
		System.out.println("paying by neft ollecting info");
	}

	@Override
	public void sendMessages(String data) {
		// TODO Auto-generated method stub
		
	}
}
