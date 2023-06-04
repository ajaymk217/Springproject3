package org.ass.mus.controll;

import java.util.List;

import org.ass.mus.entity.ProductEntity;
import org.ass.mus.serviceimp.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControll {
	
	@Autowired
	private ProductServiceImp productServiceImp;
	
	
	@PostMapping(value = "/saveProduct")
	public  ProductEntity saveProduct(@RequestBody ProductEntity productEntity) {
		return productServiceImp.saveProduct(productEntity);
	}

	@GetMapping(value = "/findProductById/{id}")
	public  ProductEntity findProductById(@PathVariable("id") long id) {
		return productServiceImp.findProductById(id);
		
	}

	@GetMapping(value = "/findAllProduct")
	public  List<ProductEntity> findAllProduct() {
		return productServiceImp.findAllProduct();
		
	}

	@PostMapping(value = "/deleteProductById/{id}")
	public  ProductEntity deleteProductById(@PathVariable("id") long id) {
		return productServiceImp.deleteProductById(id);
		 
	}

	@PostMapping(value = "/Product")
	public  ProductEntity Product(@RequestBody ProductEntity entity) {
		return productServiceImp.Product(entity);
		
	}

	@GetMapping(value = "/findProductQuantityById/{id}")
	public  Integer findProductQuantityById(@PathVariable("id") long id) {
		return productServiceImp.findProductQuantityById(id);
		
	}

	@GetMapping(value = "/findAllProductSortedByName")
	public  List<ProductEntity> findAllProductSortedByName() {
		return productServiceImp.findAllProductSortedByName();
		

	}
	
	@GetMapping(value = "/getProductByName")
	public List<ProductEntity> productByName(@RequestParam("name") String name){
		return productServiceImp.productByName(name);
	
	}
	@GetMapping(value = "/getProductInRange")
	public List<ProductEntity> getProductInRange(@RequestParam("higher") double higherPrice,@RequestParam("lower") double lowerPrice){
		
		return productServiceImp.getProductInRange(higherPrice, lowerPrice) ;
		
	}
	
	@GetMapping(value="/getProductPriceById/{id}")
	public double getProductByPrice(@PathVariable("id") long id) {
		return productServiceImp.getProductByPrice(id);
	}
}
