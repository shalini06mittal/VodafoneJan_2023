package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * collections -> containers that can store data of any type and the size id dynamic
 * depending upon  the type of collection it can either be stored in continous memory
 * or scattered memory
 * 
 * Collection is an interface
 * List -> anywhere and everywhere => cart, display transaction history, invoices, bills wishlist...
 * Set -> 
 * Bank => list of customers
 * A1 -> c1, A2 c2, A3 c1,A4 c4, A5 c2
 * names of cities from where my account holders are
 * C1
 * 
 * Map => key => cityname  and value => count
 * key => custemail and value => nooftransations
 * 
 * Queue
 * 
 *
 */
public class CollDemo {

	
	
	public static void main(String[] args) {
		
		System.out.println("patients".endsWith("ENTS"));
		List list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add("hello");
		System.out.println("size "+list.size());
		list.add(true);
		list.add(23.798);
		list.add('s');
		list.add(10);
		System.out.println(list);
		System.out.println("size "+list.size());
		list.remove(2);
		System.out.println(list.size());
		System.out.println();
		
		Set set = new HashSet();
		set.add(10);
		set.add(20);
		set.add("hello");
		System.out.println("size "+set.size());
		set.add(true);
		set.add(23.798);
		set.add('s');
		set.add(10);
		System.out.println(set);
		System.out.println("size "+set.size());
		System.out.println(set.remove(2));
		System.out.println(set.size());
		System.out.println();
		// key - value
		Map map = new HashMap();
		map.put("Shalini",4);
		map.put("Michaela",2);
		map.put("Martin",14);
		map.put("Abdul",5);
		map.put("Afsha",8);
		map.put("Nalini",10);
		System.out.println(map);
		System.out.println(map.put("Shalini",40));
		map.remove("Martin");
		System.out.println(map);
		
	}

}
