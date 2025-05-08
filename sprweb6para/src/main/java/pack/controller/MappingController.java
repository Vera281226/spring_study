package pack.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MappingController {
	@GetMapping(value="kbs/login", params = "type=admin")
	public String admin(Model model) {
		model.addAttribute("msg", "관리자");
		return "list";
	}
	@GetMapping(value="kbs/login", params = "type=user")
	public String user(Model model) {
		model.addAttribute("msg", "일반 고객");
		return "list";
	}
	@GetMapping(value="kbs/login", params = "!type")
	public String nope(Model model) {
		model.addAttribute("msg", "파라미터 없음");
		return "list";
	}
	@PostMapping(value = "kbs/login")
	public String form(Model model, @RequestParam("type")String type) {
		if(type.equals("user")) model.addAttribute("msg", "사용자");
		else if(type.equals("admin")) model.addAttribute("msg", "관리자");
		else model.addAttribute("msg", "기타");
		return "list";
	}
	@GetMapping(value="ent/{co}/singer/{singer}")
	public String hive(Model model, @RequestParam("title")String title,
			@PathVariable("co")String co, @PathVariable("singer")String singerName) {
		String msg = "소속사 : "+co+", 가수 "+singerName+", 노래 제목 "+title;
		model.addAttribute("msg", msg);
		return "list";
	}
}