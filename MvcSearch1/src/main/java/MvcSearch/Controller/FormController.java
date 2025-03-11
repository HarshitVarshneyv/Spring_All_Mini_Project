package MvcSearch.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

	@RequestMapping("/complex")
	public String showForm() {
		return "complex_form";
	}
	
	//This is not a good implementation that is why we use seperate entity for student
	//to make our code more effective.
	/*
	 * @RequestMapping(path="/handleForm",method=RequestMethod.POST) 
	 * public String formHandler(@RequestParam("name") String name
	 * ,@RequestParam("email") String email){ 
	 * System.out.println(name);
	 * System.out.println(email);
	 * return "success";
	 * } 
	 */
	@RequestMapping(path="/handleForm",method=RequestMethod.POST)
	public String formHandler(@ModelAttribute("student") Student student) {
		System.out.println(student);
		System.out.println(student.getAddress());
		return "success";
	}
}

