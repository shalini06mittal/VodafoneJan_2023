package prodmngtsys;

public class ProductDatabase {

	private Product products[];
	int count =0;
	
	public ProductDatabase(int noofproducts) {
		products = new Product[noofproducts];
	}
	public int getCount() {
		return count;
	}
	public boolean insertProduct(Product product)
	{
		if(count < products.length)
		{
			products[count++] = product;
			return true;
		}
		return false;
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
