package edu.jsp.product_app.dao;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import edu.jsp.product_app.Repo.ProductRepo;
import edu.jsp.product_app.dto.Product;
@Repository
public class ProductDao {
	//save(T t)
	//findById(Id id)
	//deleteById(Id id)
	//findAll
	
	@Autowired
	private ProductRepo repo;
	
	public Product saveProduct(Product p) {
		return repo.save(p);
	}
	

    // Delete product by ID
    public void deleteProductById(int id) {
        repo.deleteById(id);
    }

    // Find all products
    public List<Product> findAllProducts() {
        return repo.findAll();
    }
    public Optional<Product> fetchById(int id) {
    	return repo.findById(id);
    }
    //  delete by id
    public String deletebyId(int id) {
    	repo.deleteById(id);
    	return "data deleted";
    }
    
    public Product updateproduct( Product newProduct) {
    	return repo.save(newProduct);
    		
    }
    
    public Product fetchByName(String name) {
    	return repo.findByName(name);
    }
    
    public List<Product> fetchByRange(double start,double end){
    	return repo.findByRange(start, end);
    }
    
}