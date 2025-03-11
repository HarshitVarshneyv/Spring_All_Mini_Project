package springmvc.HC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl {
     @RequestMapping("/home")
     public String home() {
    	 System.out.println("This is homr URL");
    	 return "index";
     }
     
     @RequestMapping("/about")
    public String about() {
    	System.out.println("This is About URL");
    	return "about";
    }
}
 