package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, Product> map = new HashMap<Integer, Product>();
		map.put(1, new Product(1, "P1","D1", 120));
		map.put(2, new Product(2, "P2","D2", 500));
		map.put(3, new Product(3, "P3","D3", 720));
		map.put(4, new Product(4, "P4","D4", 9020));
		
		Set<Integer> set = map.keySet();
		for(Integer key: set)
			System.out.println(key +" => "+map.get(key));
		
		System.out.println();
		map.forEach(new BiConsumer<Integer, Product>() {

			@Override
			public void accept(Integer key, Product value) {
				// TODO Auto-generated method stub
				System.out.println(key +" => "+value);
			}
		});
		
		/**
		 * IT department => how many time every employee logged in the system
		 *
		 */
	}
}
