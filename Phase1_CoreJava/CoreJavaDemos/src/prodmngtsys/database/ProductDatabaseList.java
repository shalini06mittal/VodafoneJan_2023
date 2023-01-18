package prodmngtsys.database;

import java.util.ArrayList;
import java.util.List;

import prodmngtsys.entity.Product;

public class ProductDatabaseList {

	private List<Product> products;
	
	public ProductDatabaseList() {
		products = new ArrayList<Product>();
	}
	
	public void insertProduct(Product product)
	{
		//inserts data in database
		products.add(product);
			
	}
	public List<Product> getAllProducts()
	{
		return products;
	}
	public boolean updateProduct(Product product)
	{
		for(int i=0;i<products.size();i++)
		{
			if(products.get(i).getPid() == product.getPid())
			{
				products.set(i, product);
				return true;
			}
		}
		return false;
	}
	public boolean deleteProduct(int pid)
	{
		for(int i=0;i<products.size();i++)
		{
			if(products.get(i).getPid() == pid)
			{
				products.remove(products.get(i));
				return true;
			}
		}
		return false;
	}
	
	public Product getProductById(int pid)
	{
		for(int i=0;i<products.size();i++)
		{
			if(products.get(i).getPid() == pid)
			{
				
				return products.get(i);
			}
		}
		
		return null;
	}
	
}
