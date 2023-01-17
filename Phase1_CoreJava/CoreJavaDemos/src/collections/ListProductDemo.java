package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListProductDemo {

	public static void main(String[] args) {
		/**
		 * create a list of products
		 * add few items in the list
		 * arrange the items based on the price
		 * display all the items of a certain brand
		 */
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Laptop", "MAC OS", 78900, "Apple"));
		products.add(new Product(2, "Laptop", "Windows OS", 67989, "Microsoft"));
		products.add(new Product(3, "Mouse", "Wireless mouse", 12000, "Sony"));
		products.add(new Product(4, "Adaptor", "C type to USB", 10000, "Apple"));
		products.add(new Product(5, "Screen Guard", "protect mobiles", 67222, "Samsung"));
				
		
		
		Comparator<Product> comparator = new ProductPriceComparator();
		Collections.sort(products, comparator);
		
		// this class has no name =>? anonymous inner class
//		comparator = new Comparator<Product>()
//		{
//				@Override
//				public int compare(Product o1, Product o2) {
//					// TODO Auto-generated method stub
//					return (int) (o1.getPrice() - o2.getPrice());
//				}
//		};
//		
		
		Collections.sort(products, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getPrice() - o2.getPrice());
			}
		});
		
		System.out.println();
		for(Product p: products)
			System.out.println(p);
		
		System.out.println();
		
		for(Product p: products)
			if(p.getBrand().equals("Apple"))
				System.out.println(p);
	}

}
class ProductPriceComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getPrice() - o2.getPrice());
	}
	
}
