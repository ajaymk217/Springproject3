package org.ass.mus.service;

import java.util.List;

import org.ass.mus.entity.ProductEntity;
import org.springframework.web.bind.annotation.RequestParam;

public interface ProductService {
	
	public ProductEntity saveProduct(ProductEntity productEntity);
	
	public ProductEntity findProductById(long id);
	
	public List<ProductEntity> findAllProduct();
	
	public ProductEntity deleteProductById(long id);
	
	public ProductEntity Product(ProductEntity entity);
	
	public Integer findProductQuantityById(long id);
	
	public List<ProductEntity> findAllProductSortedByName();
	
	public List<ProductEntity> productByName(String name);
	
	public List<ProductEntity> getProductInRange(double higherPrice,double lowerPrice);
	
	public double getProductByPrice(long id);
			

	
	

}
