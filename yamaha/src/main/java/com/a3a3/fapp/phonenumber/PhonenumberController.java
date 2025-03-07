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
	@RequestMapping(value = "/phonenumber/phonenumberXdmForm")
	public String phonenumberXdmForm() {
		return "phonenumber/phonenumberXdmForm";
	}
	@RequestMapping(value = "/phonenumber/phonenumberXdmInst")
	public String phonenumberXdmInst(PhonenumberDto phonenumberDto) {
		
		phonenumberService.insert(phonenumberDto);
		
		return "redirect:/phonenumber/phonenumberXdmList";
	}
	@RequestMapping(value = "/phonenumber/phonenumberXdmMform")
	public String phonenumberXdmMform(Model model ,PhonenumberDto phonenumberDto) {
		
		model.addAttribute("item", phonenumberService.selectOne(phonenumberDto));
		return "phonenumber/phonenumberXdmMform";
	}
	@RequestMapping(value = "/phonenumber/phonenumberXdmUpdt")
	public String phonenumberXdmUpdt(PhonenumberDto phonenumberDto) {
		phonenumberService.update(phonenumberDto);
		
		return "redirect:/phonenumber/phonenumberXdmList";
	}
}
