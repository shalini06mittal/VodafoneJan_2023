package prodmngtsys.service;

import prodmngtsys.database.ProductDatabase;
import prodmngtsys.entity.Product;

public class ProductService {

	private ProductDatabase database;
	
	public ProductService(ProductDatabase database) {
		// TODO Auto-generated constructor stub
		this.database = database;
	}
	
	public boolean isStockFull()
	{
		return database.getCount() == 5;
	}
	public boolean addProduct(Product product)
	{
		// do the validation check
		if(database.getCount() == 5)
			return false;
		database.insertProduct(product);
		return true;
	}
	
}
