package database;

import java.sql.SQLException;

import entity.Customer;

public class TestDB {

	public static void main(String[] args) throws SQLException {
		//DBConnection.dbConn();
		CustomerDatabase db = new CustomerDatabase();
//		for(Customer c: db.getAllCustomers())
//			System.out.println(c);
//		
//		db.getAllCities();
		
//		boolean insertSuccess = db.insertCustomer(new Customer("ge@g.c","9999999999","ge","Chicago",false));
//		System.out.println(insertSuccess);

//		boolean insertSuccess = db.insertCustomerUsingPrepareStatement(new Customer("ge@g.c","9999999999","ge","Chicago",false));
//		System.out.println(insertSuccess);
		
		Customer c1 = new Customer();
		c1.setEmail("ge@g.c");
		c1.setCity("New York");
		c1.setPhone("9898989898");
		//System.out.println(db.updateCustomerByEmail(c1.getEmail(), c1.getPhone(), c1.getCity()));
		
//		for(Customer c: db.getAllCustomers())
//			System.out.println(c);
		
		System.out.println(db.getCustomerByEmail("cd@g.c"));
		
		System.out.println(db.deleteCustomerByEmail("xyz@g.c"));
		

	}

}
