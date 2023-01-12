package oops.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		// Book inherits Item class
		Book book = new Book(1,"desc",23423.34,"titlw","");
		System.out.println(book.getDesc());
		System.out.println(book.getTitle());
		System.out.println();
		
		//Book b1 = new Book();
		
		//new Fiction();
	}
}

class Fiction extends Book{
	public Fiction() {
		System.out.println("Fiction default");
	}
}