package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Customer;

public class CustomerDatabase {

	// fetch all records -> select *
	public List<Customer> getAllCustomers() throws SQLException
	{
		List<Customer> customers = new ArrayList<Customer>();

		// select * from customer
		//String sql = "select city, phone from customer";
		String sql = "select * from customer";

		// 1. DB connection 
		Connection conn = DBConnection.dbConn();
		//2. create the statememt
		Statement stat = conn.createStatement();
		// 3. execute the query
		ResultSet rs = stat.executeQuery(sql);
		while(rs.next()) {
			Customer c1 = new Customer();
			c1.setEmail(rs.getString(1));
			c1.setPhone(rs.getString(2));
			c1.setPassword(rs.getString(3));
			c1.setCity(rs.getString(4));
			c1.setIsmember(rs.getBoolean(5));
			customers.add(c1);
		}
		return customers;
	}
	// fetch all records -> select *
	public void getAllCities() throws SQLException
	{

		String sql = "select city from customer";

		// 1. DB connection 
		Connection conn = DBConnection.dbConn();
		//2. create the statememt
		Statement stat = conn.createStatement();
		// 3. execute the query
		ResultSet rs = stat.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString(1));
		}
	}
	public boolean insertCustomer(Customer customer) throws SQLException
	{
		String sql = "insert into customer values('" + customer.getEmail()+
				"','"+ customer.getPhone()+  "','"+customer.getPassword() +
				"','"+customer.getCity()+"',"+customer.isIsmember()+")";
		System.out.println(sql);
		// 1. DB connection 
		Connection conn = DBConnection.dbConn();
		//2. create the statememt
		Statement stat = conn.createStatement();
		try {
			stat.executeUpdate(sql);
		}catch(Exception e)
		{
			System.out.println("error "+e.getMessage());
			return false;
		}
		return true;
	}
}
