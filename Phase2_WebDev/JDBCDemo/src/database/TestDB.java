package database;

import java.sql.SQLException;

import entity.Customer;

public class TestDB {

	public static void main(String[] args) throws SQLException {
		//DBConnection.dbConn();
		CustomerDatabase db = new CustomerDatabase();
		for(Customer c: db.getAllCustomers())
			System.out.println(c);
		
		db.getAllCities();
		
//		boolean insertSuccess = db.insertCustomer(new Customer("ge@g.c","9999999999","ge","Chicago",false));
//		System.out.println(insertSuccess);

	}

}
