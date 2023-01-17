package prodmngtsys.service;

import javax.management.NotCompliantMBeanException;

import prodmngtsys.database.ProductDatabase;
import prodmngtsys.entity.Product;
import prodmngtsys.exception.StockFullException;

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
	public boolean addProduct(Product product) throws StockFullException, NotCompliantMBeanException
	{
		// do the validation check
		if(database.getCount() == 5)
			throw new StockFullException("Cannot add products");
		else if(product.getPrice() > 0)
			throw new NotCompliantMBeanException("price should be greater than 0");
		database.insertProduct(product);
		return true;
	}
	
}
