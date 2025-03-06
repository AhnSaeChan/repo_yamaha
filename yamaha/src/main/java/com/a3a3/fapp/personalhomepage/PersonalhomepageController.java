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
@RequestMapping(value = "/personalhomepage/personalhomepageXdmView")
public String personalhomepageXdmView(Model model,PersonalhomepageDto personalhomepageDto ) {
	model.addAttribute("item", personalhomepageService.selectOne(personalhomepageDto));
	return "personalhomepage/personalhomepageXdmView";
}
@RequestMapping(value = "/personalhomepage/personalhomepageXdmForm")
public String personalhomepageXdmForm() {
	
	return "personalhomepage/personalhomepageXdmForm";
}
@RequestMapping(value = "/personalhomepage/personalhomepageXdmInst")
public String personalhomepageXdmInst(PersonalhomepageDto personalhomepageDto) {
	personalhomepageService.insert(personalhomepageDto);
	return "redirect:/personalhomepage/personalhomepageXdmList";
}
@RequestMapping(value = "/personalhomepage/personalhomepageXdmMform")
public String personalhomepageXdmMform(Model model, PersonalhomepageDto personalhomepageDto) {
	model.addAttribute("item", personalhomepageService.selectOne(personalhomepageDto));
	return "/personalhomepage/personalhomepageXdmMform";
}
@RequestMapping(value = "/personalhomepage/personalhomepageXdmUpdt")
public String personalhomepageXdmUpdt(PersonalhomepageDto personalhomepageDto) {
	personalhomepageService.update(personalhomepageDto);
	return "redirect:/personalhomepage/personalhomepageXdmList";
}

}
