package pack.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
	// log 출력
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@GetMapping("login")
	public String submitCall() {
		return "redirect:http://localhost/login.html";
	}
	
//	@PostMapping("login")
//	public String submit(HttpServletRequest request, Model model) {
//		String id = request.getParameter("id");
//		String pwd = request.getParameter("pwd");
//		model.addAttribute("id",id);
//		model.addAttribute("pwd",pwd);
//		
//		logger.info(id+" "+pwd);
//		String data = "";
//		if(id.equals("aa") && pwd.equals("pwd"))
//		data = "로그인 성공";
//		else data = "로그인 실패";
//		return "result";
//	}
	
	@PostMapping("login")
	public String submit(@RequestParam(value = "id")String id,
			@RequestParam(value = "pwd")String pwd,
			// @RequestParam(value = "pwd")int pwd, // 이렇게 형변환이 가능하다
			Model model) {
		System.out.println(id+" "+pwd);
		String data = "";
		if(id.equals("aa") && pwd.equals("pwd")) data = "로그인 성공";
		else data = "로그인 실패";
		model.addAttribute("data", data);
		return "result";
	}
}