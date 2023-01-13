package oops.inheritance;
// are of type Item
// child or sub or derived
public  class Book extends Item {

	private String title;
	private String author;
	// super is used to call immediate parent class constructor
	public Book() {
		/*
		 * it is mandatory to call parent class parameterized  constructor using super
		 * if parent class has NO default constructor
		 * BUt super can otherwise be also used to call a specific parent
		 * class constructor
		 */
		super(1, 0.0);
		System.out.println("Book default constructor");
	}
	public Book(int itemid, String desc, double price, String title, String author) {
		super(itemid, desc, price);
		System.out.println("Book parameterized constructor");
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book ["  + super.toString()+
				", title=" + title +", author=" + author+ 
				"]";
	}
	// Item => 10
	// Televiiosn => 5
	// Furnitture => 8
	// Audio => 6
	// Video
	@Override
	public void calculate() {
		System.out.println("Book price calculate");
		setPrice(1000);
		
	}
	
	
}
