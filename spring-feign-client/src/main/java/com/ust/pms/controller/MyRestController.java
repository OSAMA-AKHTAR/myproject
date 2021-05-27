package com.ust.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.pms.client.ProductClient;
import com.ust.pms.model.Product;

@RestController
@RequestMapping("/productData")
public class MyRestController {

	@Autowired
	private ProductClient productClient;
	
	@GetMapping("/{id}")
	public Product getPById(@PathVariable int id) {
		return productClient.getProductById(id);
	}
	
	@PostMapping
	public String saveProduct(@RequestBody Product product) {
		productClient.saveProduct(product);
		return "saving product";
	}
	
	@PutMapping
	public String updateProduct(@RequestBody Product product) {
		productClient.updateProduct(product);
		return "updating Product";
	}
	
	@DeleteMapping("/{id}")
	public Product deleteProduct(@PathVariable int id) {
		return productClient.deleteProduct(id);
	}
}
