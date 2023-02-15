package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	/*
	 * 1. very tedious and clumsy to write the insert query
	 * 2. risk of SQL injection attacks
	 * 3. it is slow only when the request comes it prepares the query and executes
	 */
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
	public boolean insertCustomerUsingPrepareStatement(Customer customer) throws SQLException
	{
		//		String sql = "insert into customer values('" + customer.getEmail()+
		//				"','"+ customer.getPhone()+  "','"+customer.getPassword() +
		//				"','"+customer.getCity()+"',"+customer.isIsmember()+")";
		String sql = "insert into customer values(?,?,?,?,?)";
		System.out.println(sql);
		// 1. DB connection 
		Connection conn = DBConnection.dbConn();
		//2. create the statememt
		PreparedStatement stat = conn.prepareStatement(sql);
		stat.setString(1, customer.getEmail());
		stat.setString(2, customer.getPhone());
		stat.setString(3, customer.getPassword());
		stat.setString(4, customer.getCity());
		stat.setBoolean(5, customer.isIsmember());
		try {
			stat.execute();
		}catch(Exception e)
		{
			System.out.println("error "+e.getMessage());
			return false;
		}
		return true;
	}

	public boolean updateCustomerByEmail(String email, String phone, String city) throws SQLException
	{

		String sql = "update customer set phone=?, city=? where email=?";
		System.out.println(sql);
		// 1. DB connection 
		Connection conn = DBConnection.dbConn();
		//2. create the statememt
		PreparedStatement stat = conn.prepareStatement(sql);
		stat.setString(1, phone);
		stat.setString(2, city);
		stat.setString(3, email);
		try {
			stat.execute();
		}catch(Exception e)
		{
			System.out.println("error "+e.getMessage());
			return false;
		}
		return true;
	}
	public boolean deleteCustomerByEmail(String email) throws SQLException
	{

		String sql = "delete from customer where email=?";
		System.out.println(sql);
		// 1. DB connection 
		Connection conn = DBConnection.dbConn();
		//2. create the statememt
		PreparedStatement stat = conn.prepareStatement(sql);

		stat.setString(1, email);
		try {
			stat.execute();
		}catch(Exception e)
		{
			System.out.println("error "+e.getMessage());
			return false;
		}
		return true;
	}
	public Customer getCustomerByEmail(String email) throws SQLException
	{
		String sql = "select * from customer where email=?";

		// 1. DB connection 
		Connection conn = DBConnection.dbConn();
		//2. create the statememt
		PreparedStatement stat = conn.prepareStatement(sql);

		stat.setString(1, email);
		// 3. execute the query
		Customer c1 = null;
		ResultSet rs = stat.executeQuery();
		while(rs.next()) {
			c1= new Customer();
			c1.setEmail(rs.getString(1));
			c1.setPhone(rs.getString(2));
			c1.setPassword(rs.getString(3));
			c1.setCity(rs.getString(4));
			c1.setIsmember(rs.getBoolean(5));
		}
		return c1;
	}
	public boolean validateCustomer(String email, String password) throws SQLException
	{
		boolean isValid = false;
		String sql = "select password from customer where email=?";

		// 1. DB connection 
		Connection conn = DBConnection.dbConn();
		//2. create the statememt
		PreparedStatement stat = conn.prepareStatement(sql);

		stat.setString(1, email);
		ResultSet rs = stat.executeQuery();
		if(rs.next()) {
			String pass = rs.getString(1);
			if(pass.equals(password))
				isValid = true;
		}
		
		return isValid;
	}

}
