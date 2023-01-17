package collections.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestAssn {

	public static void main(String[] args) {
		/*
		 * 1. Create a list of customers
		 * 2. Display the names of unique cities from where you get busoness
		 * 3. Display the count of customers in every city
		 */

		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1, "a@a.c", "Mumbai"));
		customers.add(new Customer(2, "b@a.c", "Chennai"));
		customers.add(new Customer(3, "c@a.c", "Mumbai"));
		customers.add(new Customer(4, "d@a.c", "Pune"));
		customers.add(new Customer(5, "e@a.c", "Chennai"));
		customers.add(new Customer(6, "f@a.c", "Mumbai"));
		
		Set<String> cities = new HashSet<String>();
		for(Customer cust : customers)
			cities.add(cust.getCity());
		
		System.out.println(cities);
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(Customer cust : customers)
		{
			String key = cust.getCity();
			if(map.containsKey(key))
			{
				Integer count = map.get(key);
				count += 1;
				map.put(key, count);
			}
			else
				map.put(key, 1);
		}
		System.out.println(map);
	}

}
