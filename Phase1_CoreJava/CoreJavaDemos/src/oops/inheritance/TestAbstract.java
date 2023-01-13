package oops.inheritance;

public class TestAbstract {

	public static void main(String[] args) {
		
		Item item;
		
		/*
		 * reference variable decides which methods can be called
		 * and object decides methods of  which class  will be called
		 */
		item = new Book(1, "some desc", 32, "some title", "");
		System.out.println();
		System.out.println(item);// Book
		item.calculate(); // Book
		
		Book book = (Book) item;
		System.out.println(book.getTitle());
		
		item =  new Audio();
		System.out.println();
		System.out.println(item); // Audio
		item.calculate(); // Audio
		
		Book book1 = (Book) item;
		System.out.println(book1.getTitle());
		
	}

}
