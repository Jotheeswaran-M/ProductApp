package edu.jsp.product_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.product_app.dao.ProductDao;
import edu.jsp.product_app.dto.Product;
@Service
public class ProductService {
	@Autowired
	private ProductDao dao;
	
	public Product saveProduct(Product p) {
		return dao.saveProduct(p);
		
	}
	
	public Optional<Product> fetchById(int id) {
		return dao.fetchById(id);
	}
	
	
	public List<Product> fetchAll(){
		return dao.findAllProducts();
	}

	public String deletebyId(int id) {
		return dao.deletebyId(id);
	}

	public Product updateproduct(int id, Product p) {
		Optional<Product> p1=dao.fetchById(id);
    	if(p1!=null) {
    		return p1.get();
    	}
    	return null;
	}

	public Product fetchByName(String name) {
		return dao.fetchByName(name);
	}

	public List<Product> fetchByRange(double start, double end) {
		return dao.fetchByRange(start, end);
	}
	

}