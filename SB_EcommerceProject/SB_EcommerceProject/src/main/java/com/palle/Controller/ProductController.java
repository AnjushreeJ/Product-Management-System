package com.palle.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palle.Service.ProductService;
import com.palle.entity.Product;

@RestController  // used to create RestAPI and return in JSON format
@RequestMapping("/product")  //used to define base URL
public class ProductController {
	//dependency of service
	@Autowired  // used for connections components automatically
	private ProductService service;
	 @GetMapping("/test")
	    public String test() {
	        return "Working";
	    }
	
	//Rest API
	//1.REST API  TO INSERT DATA
	@PostMapping("/insert")
	public void insertData(@RequestBody Product p) {
		service.insertData(p);
																																																																																																																																																																																																																																																																																																						
	}
	@GetMapping("/readall")
	public List<Product> readAll() {
		return service.readAllProduct();
		}
	
	//3.rest api to read one product
	@GetMapping("/readone/{id}") 
	public Optional<Product> readOne(@PathVariable int id){
			Optional<Product> oneProduct = service.readOneProduct(id);
			return oneProduct;
		}
	//4. rest api /webservice to update product
	@PutMapping("/update/{id}")
	public Product updateProduct(@PathVariable int id, Product newProduct) {
		 Product updateproduct = service.updateproduct(id, newProduct);
		
		
		return updateproduct;
		}
	
	//5. rest PI FOR DELETING THE PRODUCT
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
		}
	}



