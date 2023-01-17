package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// generics - <Type>
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(100);
		list.add(10);
		System.out.println(list);
		for(int i =0;i<list.size();i++)
			System.out.println(list.get(i));
		
		System.out.println();
		
		for(int no: list)
			System.out.println(no);
		
		// sort the list
		Collections.sort(list);
		System.out.println(list);
		
		List<Driver> drivers = new ArrayList<Driver>();
		drivers.add(new Driver(1, "Ajay","Mumbai","68686868686"));
		drivers.add(new Driver(2, "Suman","Pune","68686868686"));
		drivers.add(new Driver(5, "Preeti","Kolkatta","68686868686"));
		drivers.add(new Driver(3, "Priya","Chennai","68686868686"));
		drivers.add(new Driver(4, "Shalni","Mumbai","68686868686"));
		
		for(Driver driver:drivers)
			System.out.println(driver);
		Collections.sort(drivers);
		System.out.println();
		for(Driver driver:drivers)
			System.out.println(driver);
		
		Collections.sort(drivers, new DriverNameSort());
		System.out.println();
		for(Driver driver:drivers)
			System.out.println(driver);
		
		
	}

}
