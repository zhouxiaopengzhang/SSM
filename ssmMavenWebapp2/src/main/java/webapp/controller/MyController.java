package webapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import webapp.model.User;
import webapp.service.UserService;
@Controller
@RequestMapping("user")
public class MyController {
	@Autowired
	private UserService service;
	@RequestMapping("/welcome")
	public String welcome(){
		return "success";
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addUser(User user,Model model){
		//id主键自动生成，因此不要输入id（因为输入无效，也会可能导致程序异常）
		service.addUser(user);
		model.addAttribute("adduser", user.toString());
		return "success";
	}
	@RequestMapping("/delete")
	public String deleteUser(int id){
		service.deleteUser(id);
		return "success";
	}
	@RequestMapping("/update")
	public String updateUser(User user,Model model){
		service.updateUser(user);
		model.addAttribute("updateuser", user.toString());
		return "success";
	}
	@RequestMapping("/get")
	public String getUser( int id,Model model){
		User user=service.getUserById(id);
		model.addAttribute("getuser", user.toString());
		return "success";
	}
	
}
