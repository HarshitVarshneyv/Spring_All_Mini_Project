package productCrudApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import jakarta.servlet.http.HttpServletRequest;
import productCrudApp.dao.ProductDao;
import productCrudApp.model.Product;

@Controller
public class MainController {

	//In mainController we need productDao object.Why?Because we need to use the function createProduct to save the data in the database
	@Autowired
	private ProductDao productDao;

	@RequestMapping("/home")
	public String home(Model m) {
		List<Product> products=productDao.getProducts();
		m.addAttribute("product",products);
		return "home";
	}
	
	//Show Add product detail form
	@RequestMapping("/add-product")
	public String addProduct() {
		return "add_product_form";
	}
	
	//handler to add product form
	@RequestMapping(value="/submit-product",method = RequestMethod.POST)
	public RedirectView submitproduct(@ModelAttribute Product product,HttpServletRequest request) {
		System.out.println(product);
		//ProductDao function to save the data in the database
		productDao.createProduct(product);
		RedirectView  redirectView=new RedirectView() ;
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView ;
	}
	
	//Delete handler
	@RequestMapping("/delete/{pid}")
	public RedirectView deleteProduct(@PathVariable("pid") int productId,HttpServletRequest request) {
		this.productDao.deleteProduct(productId);
		RedirectView  redirectView=new RedirectView() ;
		redirectView.setUrl(request.getContextPath() + "/home");
		return redirectView ;
	}
	
	//Update handler
	@RequestMapping("/update/{pid}")
	public String updateForm(@PathVariable("pid") int pid,Model model) {
		Product product=this.productDao.getproduct(pid);
	    model.addAttribute("p",product);
		return "update_form";
	}
}





