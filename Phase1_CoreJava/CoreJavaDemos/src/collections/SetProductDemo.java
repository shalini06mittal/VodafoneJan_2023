package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetProductDemo {

	public static void main(String[] args) {
//		Set<Integer> set = new HashSet();
//		set.add(10);
//		set.add(20);
//		set.add(10);
//		
//		System.out.println("size "+set.size());
		
		
		Set<Product> products = new HashSet<Product>();
		Product p1 = new Product(1, "Laptop", "MAC OS", 78900, "Apple");
		Product p2 = new Product(1, "Laptop", "MAC OS", 78900, "Apple");
		Product p3 = new Product(2, "Laptop", "Windows OS", 67989, "Microsoft");
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println();
		products.add(p1);
		System.out.println();
		products.add(p3);
		System.out.println();
		products.add(p2);
		System.out.println();
		
		System.out.println("prodcuts "+products.size());
				
	
	}

}

