package org.ass.mus.serviceimp;

import java.util.List;

import org.ass.mus.entity.ProductEntity;
import org.ass.mus.repository.ProductRepository;
import org.ass.mus.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public ProductEntity saveProduct(ProductEntity productEntity) {
		return productRepository.saveProduct(productEntity);
	}

	@Override
	public ProductEntity findProductById(long id) {
		
		return productRepository.findById(id);
	}

	@Override
	public List<ProductEntity> findAllProduct() {

		return productRepository.findAllProduct();
		
	}

	@Override
	public ProductEntity deleteProductById(long id) {

		return productRepository.deleteProductById(id);
		
	}

	@Override
	public ProductEntity Product(ProductEntity entity) {

		productRepository.Product(entity);
		return null;
	}

	@Override
	public Integer findProductQuantityById(long id) {

		return productRepository.findProductQuantityById(id);
	}

	@Override
	public List<ProductEntity> findAllProductSortedByName() {

		return productRepository.findAllProductSortedByName();
	
	}

	@Override
	public List<ProductEntity> productByName(String name) {
		return productRepository.productByName(name);
		
	}

	@Override
	public List<ProductEntity> getProductInRange(double higherPrice, double lowerPrice) {
		return productRepository.getProductInRange(higherPrice, lowerPrice) ;
	}

	@Override
	public double getProductByPrice(long id) {

		return productRepository.getProductPriceById(id);
	}

	

}
