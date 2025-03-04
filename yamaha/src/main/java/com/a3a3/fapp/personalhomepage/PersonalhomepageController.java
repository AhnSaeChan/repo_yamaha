package com.a3a3.fapp.personalhomepage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonalhomepageController {
@Autowired
PersonalhomepageService personalhomepageService;

@RequestMapping(value = "/personalhomepage/personalhomepageXdmList")
public String codeGroupXdmList(Model model) {
	model.addAttribute("list", personalhomepageService.selectList());
	return "personalhomepage/personalhomepageXdmList";
}
}
