package pack.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "thleaf/")
public class TestController {
	@GetMapping("ex")
	public String abc(Model model) {
		DataDto dto = new DataDto();
		dto.setId("v");
		dto.setName("노트북");
		dto.setPrice(2500000);
		dto.setRegDate(LocalDate.now());
		model.addAttribute("dto", dto);
		return "show";
	}
	 
	@GetMapping("ex2")
	public ModelAndView abc2() {
		List<DataDto> list = new ArrayList<DataDto>();
		for(int i=1; i<=3; i++) {
		DataDto dto = new DataDto();
		dto.setId("v"+i);
		dto.setName("노트북"+i);
		dto.setPrice(250000+i);
		dto.setRegDate(LocalDate.now());
		list.add(dto);
		}
		ModelAndView modelAndView = new ModelAndView("show2");
		modelAndView.addObject("list", list);
		return modelAndView;
	}
	
	@GetMapping("ex3")
	public String abc3(Model model) {
		List<DataDto> list = new ArrayList<DataDto>();
		for(int i=1; i<=3; i++) {
		DataDto dto = new DataDto();
		dto.setId("v"+i);
		dto.setName("노트북"+i);
		dto.setPrice(250000+i);
		dto.setRegDate(LocalDate.now());
		list.add(dto);
		}
		model.addAttribute("list",list);
		return "show3";
	}
	
	@GetMapping("ex4")
	public String abc4(Model model, @RequestParam("param1")String param,
			@RequestParam("param2")String param2) {
		model.addAttribute("param1",param);
		model.addAttribute("param2",param2);
		return "show4";
	}
	
	@GetMapping("ex5")
	public String abc5() {
		
		return "show5";
	}
	@GetMapping("ex5_1")
	public String abc5_1() {
		
		return "show5_1";
	}
}