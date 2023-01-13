package oops.inheritance;

public class TestAbstract {

	
	public static void createBill(int qty, Item item)
	{
		item.calculate();
		double bill = item.getPrice() * qty;
	}
	
	public static void main(String[] args) {
		
		Item item;
		/*
		 * reference variable decides which methods can be called
		 * and object decides methods of  which class  will be called
		 */
		item = new Book(1, "some desc", 32, "some title", "");
		System.out.println();
		System.out.println(item);// Book
		// Book
		createBill(5, item);
		
		Book book = (Book) item;
		System.out.println(book.getTitle());
		
		item =  new Audio();
		System.out.println();
		System.out.println(item); // Audio
		createBill(2, item);
		// Audio
		
		if(item instanceof Book)
		{
			Book book1 = (Book) item;
			System.out.println(book1.getTitle());
		}
	}

}
