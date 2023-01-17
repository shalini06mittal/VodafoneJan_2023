package collections;

import java.util.Comparator;

public class DriverNameSort implements Comparator<Driver> {

	
	@Override
	public int compare(Driver o1, Driver o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
