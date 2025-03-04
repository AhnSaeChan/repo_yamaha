package com.a3a3.fapp.phonenumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhonenumberController {
	
	@Autowired
	PhonenumberService phonenumberService;
	
	@RequestMapping(value = "/phonenumber/phonenumberXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", phonenumberService.selectList());
		return "phonenumber/phonenumberXdmList";
	}
	@RequestMapping(value = "/phonenumber/phonenumberXdmView")
	public String codeGroupXdmView(Model model ,PhonenumberDto phonenumberDto) {
		System.out.println("phonenumberDto/getSeq():"  + phonenumberDto.getSeq());
		model.addAttribute("item", phonenumberService.selectOne(phonenumberDto));
		return "phonenumber/phonenumberXdmView";
	}
}
