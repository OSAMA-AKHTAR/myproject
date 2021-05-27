package com.ust.pms.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ust.pms.model.Product;

@FeignClient(name="product-client", url="http://localhost:8094/product")
public interface ProductClient {


	@GetMapping("/{productId}")
	Product getProductById(@PathVariable int productId);
	
	@PostMapping
	Product saveProduct(@RequestBody Product product);
	
	@PutMapping
	Product updateProduct(@RequestBody Product product);
	
	@DeleteMapping("/{productId}")
	Product deleteProduct(@PathVariable int productId);
	
}
