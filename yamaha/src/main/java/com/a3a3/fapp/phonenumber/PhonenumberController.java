package com.a3a3.fapp.phonenumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhonenumberController {
	
	@Autowired
	PhonenumberService phonenumberService;
	
	@RequestMapping(value = "/phonenumbe/phonenumbeXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", phonenumberService.selectList());
		return "phonenumber/phonenumbeXdmList";
	}
}
