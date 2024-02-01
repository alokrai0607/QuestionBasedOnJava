

package com.pms.Service;

import java.util.List;

import com.pms.Model.Product;

public interface ProductService {
	
	public Product SaveProduct(Product product);
	
	public List<Product> getAllProduct();
	
	public Product getProductById(Integer id);
	
	public String deleteProduct(Integer id);

}
