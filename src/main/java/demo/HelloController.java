package demo;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String defaultHome() {
		return "Hello";
	}
	
	@RequestMapping("/hello")
	public String hello(@RequestParam String name) {
		return "Hello " + name;
	}
	
	@RequestMapping("/student")
	public HashMap<Long,Student> getAllStudents() {
		return HelloBootApplication.hmStudent;
	}

}
