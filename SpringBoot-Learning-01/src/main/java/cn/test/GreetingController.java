package cn.test;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {


	    @RequestMapping("/greeting")
	    public Greeting greeting() {
	       
	    	Greeting g = new Greeting();
	    	
	    	g.setContent("greeting");
	    	
	    	g.setId("1");
	    	
	    	return g;
	    	
	    }
}
