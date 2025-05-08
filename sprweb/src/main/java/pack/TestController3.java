package pack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController3 {
	@RequestMapping("/java/korea")
	public String ghi(Model model) {
		model.addAttribute("msg","korea 요청 처리 완료");
		return "list";
	}
	
	@GetMapping(value ={"/java/good","ok","hello"})
	public String ghi2(Model model) {
		model.addAttribute("msg","good 요청 처리 완료");
		return "list";
	}
}