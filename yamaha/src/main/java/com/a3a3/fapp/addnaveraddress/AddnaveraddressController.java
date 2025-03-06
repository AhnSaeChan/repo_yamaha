package com.a3a3.fapp.addnaveraddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddnaveraddressController {
	@Autowired
	AddnaveraddressService addnaveraddressService;

	@RequestMapping(value = "/addnaveraddress/addnaveraddressXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", addnaveraddressService.selectList());
		return "addnaveraddress/addnaveraddressXdmList";
	}
	@RequestMapping(value = "/addnaveraddress/addnaveraddressXdmView")
	public String codeGroupXdmView(Model model, AddnaveraddressDto addnaveraddressDto ) {
		
		System.out.println("addnaveraddressDto/getSeq():"  + addnaveraddressDto.getSeq());
		
		model.addAttribute("item", addnaveraddressService.selectOne(addnaveraddressDto));
		return "addnaveraddress/addnaveraddressXdmView";
	}
	@RequestMapping(value = "/addnaveraddress/addnaveraddressXdmForm")
	public String addnaveraddressXdmForm() {
		
		return "addnaveraddress/addnaveraddressXdmForm";
	}
	@RequestMapping(value = "/addnaveraddress/addnaveraddressXdmInst")
	public String addnaveraddressXdmInst(AddnaveraddressDto addnaveraddressDto) {
		
		System.out.println("addnaveraddressDto/getSeq():"  + addnaveraddressDto.getSeq());
		System.out.println("addnaveraddressDto/getSeq():"  + addnaveraddressDto.getSeq());
		
		addnaveraddressService.insert(addnaveraddressDto);
		
		System.out.println("emailaddressDto.getSeq():" + addnaveraddressDto.getSeq());
		
		
		return "redirect:/addnaveraddress/addnaveraddressXdmList";
		
		
	}
	@RequestMapping(value = "/addnaveraddress/addnaveraddressXdmMform")
	public String addnaveraddressXdmMform(Model model, AddnaveraddressDto addnaveraddressDto) {
		
		System.out.println("addnaveraddressDto/getSeq():"  + addnaveraddressDto.getSeq());
		
		model.addAttribute("item", addnaveraddressService.selectOne(addnaveraddressDto));
		
		
		return "/addnaveraddress/addnaveraddressXdmMform";
		
		
	}
	@RequestMapping(value = "/addnaveraddress/addnaveraddressXdmUpdt")
	public String addnaveraddressXdmUpdt(AddnaveraddressDto addnaveraddressDto) {
		
		addnaveraddressService.update(addnaveraddressDto);
		
		return "redirect:/addnaveraddress/addnaveraddressXdmList";
		
		
	}

}
