package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pack.model.InputModel;


@Controller
public class InputController {
	@Autowired
	private InputModel sangpumModel;
	
	@GetMapping("insdata")
	public String aaa() {
		return "redirect:http://localhost:80/input.html";
	}
	
	@PostMapping("insdata")
	public String bbb(InputBean bean,Model model) {
		model.addAttribute("data", sangpumModel.computeResult(bean));
		return "result";
	}
}