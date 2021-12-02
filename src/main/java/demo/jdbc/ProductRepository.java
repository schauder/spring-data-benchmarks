package demo.jdbc;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository 
	extends CrudRepository<Product, Integer> {

	@Query("select * from products")
	Product findByName(String name);
	
}

