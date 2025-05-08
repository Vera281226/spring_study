package pack.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import pack.model.DataDao;
import pack.model.JikwonDto;

@Controller
public class ListController {
	
	@Autowired
	private DataDao dataDao;
	
	@PostMapping("/search")
	public String listProcess(JikwonDto jikwonDto,Model model) {
		ArrayList<JikwonDto> list = dataDao.getDataSearch(jikwonDto);
		model.addAttribute("list", list);
		return "list";
	}
}