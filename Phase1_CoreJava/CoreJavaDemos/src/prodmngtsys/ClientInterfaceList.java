package prodmngtsys;

import java.util.Scanner;

import javax.management.NotCompliantMBeanException;

import prodmngtsys.database.ProductDatabase;
import prodmngtsys.database.ProductDatabaseList;
import prodmngtsys.entity.Product;
import prodmngtsys.exception.StockFullException;
import prodmngtsys.service.ProductService;
import staticdemo.Counter;

public class ClientInterfaceList {

	public static void displayMenu()
	{
		System.out.println("Welcome ADMIN");
		System.out.println("Choose one of the options");
		System.out.println("1. Display All products");
		System.out.println("2. Edit a Product");
		System.out.println("3. Add a new Product");
		System.out.println("4. Delete a Product");
		System.out.println("5. Search for a product");
		System.out.println("6.Logout");
		Counter.setY(100);
	}
	public static void main(String[] args) {
		/// highly cohesive
		Scanner sc = new Scanner(System.in);
		ProductDatabaseList database = new ProductDatabaseList();

		while(true) { // current context
			displayMenu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				// iterate and display the list
				if(database.getAllProducts().size()==0)
					System.out.println("No poducts yet");
				for(Product p:database.getAllProducts())
					System.out.println(p);
				System.out.println();
				break;
			case 2: // ask the admin to enter product id and
				// ask to enter name, desc or price
				// create the product object and pass to update method
				Product product = new Product();
				// setters
				database.updateProduct(product);
				break;
			case 3:

				System.out.println("\nEnter product details to add");
				System.out.println("Enter id");
				int id = sc.nextInt();
				System.out.println("Enter name");
				String name = sc.next();
				sc.nextLine();
				System.out.println("Enter desc");
				String desc = sc.nextLine();
				System.out.println("Enter price");
				double price = sc.nextDouble();
				Product p = new Product(id, name, desc, price);

				database.insertProduct(p);
				System.out.println("Product added");


				break;
			case 4:// // ask for product id to delete
		
				System.out.println("Enter id to delete");
				int id1 = sc.nextInt();
				database.deleteProduct(id1);
				break;
			case 5:
				// ask for product id
				//database.getProductById(id);
				break;
			case 6:
				System.out.println();
				// System.exit(0);
				break;

			}
			// if
			//break;
		}
		//System.out.println("Logged out successfully");
	}

}
