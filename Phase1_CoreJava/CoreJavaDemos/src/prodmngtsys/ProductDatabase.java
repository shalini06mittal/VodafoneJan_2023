package prodmngtsys;

public class ProductDatabase {

	private Product products[];
	
	public ProductDatabase(int noofproducts) {
		products = new Product[noofproducts];
	}
	
	// CRUD => insert, update, delete, get all, get prod by id
	public boolean insertProduct(Product product)
	{
		return false;
	}
	public boolean updateProduct(Product product)
	{
		return false;
	}
	public boolean deleteProduct(int pid)
	{
		return false;
	}
	public Product[] getAllProducts()
	{
		return null;
	}
	public Product getProductById(int pid)
	{
		return null;
	}
	
}
