package oops.inheritance;

public class Audio extends Item{

	private String track;
	public Audio() {
		// TODO Auto-generated constructor stub
	}
		
	@Override
	public String toString() {
		return "Audio [itemid=" + getItemid() + ", desc=" + getDesc() + ", price=" + getPrice() +
				", track=" +  
				"]";
	}

	@Override
	public void calculate() {
		System.out.println("Audio price calculate");
		setPrice(1000);
	}
}
