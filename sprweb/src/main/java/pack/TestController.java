package pack;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import pack.good.DataVo;

@Controller // 사용자 요청 처리한 후 뷰에 반환
public class TestController {
	
	@RequestMapping("test") // 클라이언트의 요청과 매핑 내부에서 뷰 Resolver 수행
	public ModelAndView abc() {
		String msg = "성공";
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("list"); // 기본값 포워딩
//		modelAndView.addObject("msg",msg); // request.setAttribute(msg);와 같다
		return new ModelAndView("list", "msg", msg);
	}
	
	@RequestMapping(value = "test2", method = RequestMethod.GET)
	public ModelAndView abc2() {
		String msg = "성공2";
		return new ModelAndView("list", "msg", msg);
	}
	
	@GetMapping(value = {"test3","testgood","nice"})
	public ModelAndView abc3() {
		return new ModelAndView("list", "msg", "성공3");
	}
	
	@GetMapping("test4")
	public String abc4(Model model) {
		model.addAttribute("msg", "성공4");
		return "list";
	}
	
	@RequestMapping(value = "test5", method = RequestMethod.POST)
	public String abc5(Model model) {
		model.addAttribute("msg", "성공5");
		return "list";
	}
	
	@PostMapping("test6")
	public String abc6(Model model) {
		model.addAttribute("msg", "성공6");
		return "list";
	}
	
	@PostMapping("test7")
	public String abc7(Model model) {
		model.addAttribute("msg", "성공7");
		return "list";
	}
	
	@GetMapping("test8")
	@ResponseBody
	public String abc8() {
		String value="일반 데이터-String, Map, JSON 등을 전달";
		return value;
	}
	
	@GetMapping("test8_1")
	@ResponseBody
	public DataVo abc8_1() {
		DataVo dataVo = new DataVo();
		dataVo.setCode(10);
		dataVo.setName("한국인");
		return dataVo; // Json으로 넘어간다
	}
	
	@GetMapping("test8_2")
	@ResponseBody
	public List<DataVo> abc8_2() {
		List<DataVo> list = new ArrayList<DataVo>();
		for(int i=1; i<=5; i++) {
		DataVo dataVo = new DataVo();	
		dataVo.setCode(i);
		dataVo.setName("한국인"+i);
		list.add(dataVo);
		}
		return list; // Json으로 넘어간다
	}
}