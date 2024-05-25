package com.nitesh.eCommerceProject.service;

import java.util.List;

import com.nitesh.eCommerceProject.dto.ProductDTO;
import com.nitesh.eCommerceProject.entity.CategoryEnum;
import com.nitesh.eCommerceProject.entity.Product;
import com.nitesh.eCommerceProject.entity.ProductStatusEnum;

public interface ProductService {

	public Product addProductToCatalog(String token, Product product);

	public Product getProductFromCatalogById(Integer id);

	public String deleteProductFromCatalog(Integer id);

	public Product updateProductIncatalog(Product product);
	
	public List<Product> getAllProductsIncatalog();
	
	public List<ProductDTO> getAllProductsOfSeller(Integer id);
	
	public List<ProductDTO> getProductsOfCategory(CategoryEnum catenum);
	
	public List<ProductDTO> getProductsOfStatus(ProductStatusEnum status);
	
	
	
	public Product updateProductQuantityWithId(Integer id,ProductDTO prodDTO);

}
