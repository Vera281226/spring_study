package pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping("login")
	public String submitCall() {
		return "redirect:http://localhost/login.html";
	}
	@PostMapping("login")
	public String submit(@RequestParam(value = "id")String id,
			@RequestParam(value = "pwd")String pwd,Model model) {
		String data = "";
		if(id.equals("aa") && pwd.equals("11")) {
			return "redirect:http://localhost/input.html";
		}
		else { 
			return "redirect:http://localhost/login.html"; 
		} 
	}
}