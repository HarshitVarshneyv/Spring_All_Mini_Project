package MvcSearch.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController{

	@RequestMapping("/home")
	public String home() {
		System.out.println("Going to home views");
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("queryBox") String query) {
		
		String url="https://www.google.com/search?q="+query;
		RedirectView r=new RedirectView();
		if (query.isEmpty()) {
			r.setUrl("home");
			System.out.println("Please search something to show..");
			return r;
		}
		else
		r.setUrl(url);
		return r;
	}
}
