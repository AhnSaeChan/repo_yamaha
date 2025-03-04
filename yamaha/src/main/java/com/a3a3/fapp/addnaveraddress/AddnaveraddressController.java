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
}
