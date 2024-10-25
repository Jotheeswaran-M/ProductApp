package edu.jsp.product_app.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.jsp.product_app.dto.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
   
	//save(T, t)
	//findById(ID ,id)
	//deleteById(ID ,id)
	//findAll()

	public Product findByName(String name);
	
	
	@Query("select p from Product p where p.price between ?1 and ?2 ")
	public List<Product> findByRange(double start,double end);

	
}