package com.palle.Service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.palle.Repository.ProductRepository;
import com.palle.entity.Product;

@Service  // used to define service layer where used to define business logics
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	//1.insert product data
	public Product insertData(Product p) {
		return repository.save(p);
	}
	//2.read all products data
	public List<Product> readAllProduct() {
		return repository.findAll();
		
	}
	//3. read one product
	public Optional<Product> readOneProduct(int id)
	{
		Optional<Product> byId = repository.findById(id);
		return byId;
		
	}
	//4. udating productc 
	public Product updateproduct(int id, Product newProduct) {

	    Optional<Product> opt = repository.findById(id);
Product existingProduct = null;
	    if (opt.isPresent()) {
	    	

	         existingProduct = opt.get();

	        existingProduct.setProductName(newProduct.getProductName());
	        existingProduct.setProductQuntity(newProduct.getProductQuntity());
	        existingProduct.setProductPrice(newProduct.getProductPrice());

	        return repository.save(existingProduct);   // ✅ correct
	    }

	    return existingProduct;
	}
	//5. deleting a product
	public String deleteProduct(int id) {

	    Optional<Product> opt = repository.findById(id);

	    if (opt.isPresent()) {
	        Product product = opt.get();
	        repository.delete(product);
	        return "Product with id " + id + " is deleted";
	    }

	    return "Product not found";
	}
			
		}
		
		
	
	
	 
	



	

