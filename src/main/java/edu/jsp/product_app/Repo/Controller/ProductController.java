package edu.jsp.product_app.Repo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.product_app.dao.ProductDao;
import edu.jsp.product_app.dto.Product;
import edu.jsp.product_app.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product p) {
		return service.saveProduct(p);
	}
	
	@GetMapping("/getall")
    public List<Product> fetchall() {
        return service.fetchAll();
    }
	@DeleteMapping("/delete/{id}")
	public String deletebyid(@PathVariable int id) {
		return service.deletebyId(id);
	}
	@PutMapping("/update")
	public Product updateproduct(@RequestParam int id,@RequestBody Product p) {
		return service.updateproduct(id, p);
	}
	@GetMapping("/findbyname/{name}")
	public Product findByName(@PathVariable String name) {
		return service.fetchByName(name);
	}
	
	@GetMapping("/fetchbyrange/{start}/{end}")
	public List<Product> fetchByRange(@PathVariable double start,@PathVariable double end){
		return service.fetchByRange(start, end);
	}
}