package pack.contoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping("thymeleaftest")
	public String sijak(Model model) {
		model.addAttribute("msg", "타임리프 사용");
		model.addAttribute("msg2", "tom");
		
		// Dto 자료 출력
		Sangpum sangpum = new Sangpum();
		List<Sangpum> list = new ArrayList<Sangpum>();
		sangpum.setCode("1");
		sangpum.setSang("한약");
		sangpum.setSu(5);
		sangpum.setDan(5000);
		list.add(sangpum);
		
		model.addAttribute("sangpum", sangpum);
		model.addAttribute("list",list);
		return "list";
	}
}