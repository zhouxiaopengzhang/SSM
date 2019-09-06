package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class MyController {
	@RequestMapping("/welcome")
	public String welcome(){
		return "success";
	}
}
