package com.myapp.spring.repository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.jpa.repository.JpaRepository;
import com.myapp.spring.model.Product;

@RestResource(path="products")

public interface ProductRepository extends JpaRepository<Product, Integer> {

	//Extending jpaRepository because it contains various functions that can be useful
	
}
