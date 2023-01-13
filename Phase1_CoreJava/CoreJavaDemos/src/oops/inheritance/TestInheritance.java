package oops.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		// Book inherits Item class
		Book book = new Book(1,"desc",23423.34,"titlw","author");
		System.out.println(book); // book.toString()
		System.out.println();
		
		// Item is a generalized term?
		Item item; // = new Item();
		//Book b1 = new Book();
		
		//new Fiction();
	}
}

class Fiction extends Book{
	public Fiction() {
		System.out.println("Fiction default");
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		
	}
}