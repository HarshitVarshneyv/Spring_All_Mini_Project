package productCrudApp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import productCrudApp.model.Product;

//Purpose: The @Component annotation is used to define a Spring bean. 
//When a class is annotated with @Component, Spring will automatically detect it during classpath 
//scanning and create an instance of it in the Spring context.
//This allows the class to be managed by the Spring IoC (Inversion of Control) container.
@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hiber;
	
	//Create
	@Transactional
	public void createProduct(Product product) {
		this.hiber.saveOrUpdate(product);
	}
	
	//get all product
	public List<Product> getProducts(){
		List<Product> products = this.hiber.loadAll(Product.class);
		return products;
	}
	
	//Delete the single product
	@Transactional
	public void deleteProduct(int pid) {
		Product p=this.hiber.load(Product.class, pid);
		this.hiber.delete(p);
	}
	
	//get the single product
	public Product getproduct(int pid) {
		return this.hiber.get(Product.class,pid);
	}
	
}







