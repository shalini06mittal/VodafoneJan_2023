package prodmngtsys.database;

import prodmngtsys.entity.Product;

public class ProductDatabase {

	private Product products[];
	int count =0;
	
	public ProductDatabase(int noofproducts) {
		products = new Product[noofproducts];
	}
	public int getCount() {
		return count;
	}
	// insert => insertion
	public void insertProduct(Product product)
	{
		//inserts data in database
		products[count++] = product;
			
	}
	public Product[] getAllProducts()
	{
		return products;
	}
	public boolean updateProduct(Product product)
	{
		return false;
	}
	public boolean deleteProduct(int pid)
	{
		return false;
	}
	
	public Product getProductById(int pid)
	{
		return null;
	}
	
}
