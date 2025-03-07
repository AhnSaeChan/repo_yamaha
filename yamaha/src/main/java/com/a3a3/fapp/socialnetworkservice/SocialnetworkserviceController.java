package com.a3a3.fapp.socialnetworkservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SocialnetworkserviceController {
@Autowired
SocialnetworkserviceService socialnetworkserviceService;

@RequestMapping(value = "/socialnetworkservice/socialnetworkserviceXdmList")
public String codeGroupXdmList(Model model) {
	model.addAttribute("list", socialnetworkserviceService.selectList());
	return "socialnetworkservice/socialnetworkserviceXdmList";
}
@RequestMapping(value = "/socialnetworkservice/socialnetworkserviceXdmView")
public String codeGroupXdmView(Model model,SocialnetworkserviceDto socialnetworkserviceDto) {
	model.addAttribute("item", socialnetworkserviceService.selectOne(socialnetworkserviceDto));
	return "socialnetworkservice/socialnetworkserviceXdmView";
}
@RequestMapping(value = "/socialnetworkservice/socialnetworkserviceXdmForm")
public String socialnetworkserviceXdmForm() {
	
	return "socialnetworkservice/socialnetworkserviceXdmForm";
}
@RequestMapping(value = "/socialnetworkservice/socialnetworkserviceXdmInst")
public String socialnetworkserviceXdmInst(SocialnetworkserviceDto socialnetworkserviceDto) {
	socialnetworkserviceService.insert(socialnetworkserviceDto);
	return "redirect:/socialnetworkservice/socialnetworkserviceXdmList";
}
@RequestMapping(value = "/socialnetworkservice/socialnetworkserviceXdmMform")
public String socialnetworkserviceXdmMform(Model model,SocialnetworkserviceDto socialnetworkserviceDto) {
	model.addAttribute("item", socialnetworkserviceService.selectOne(socialnetworkserviceDto));
	return "/socialnetworkservice/socialnetworkserviceXdmMform";
}
@RequestMapping(value = "/socialnetworkservice/socialnetworkserviceXdmUpdt")
public String socialnetworkserviceXdmUpdt(SocialnetworkserviceDto socialnetworkserviceDto) {
	socialnetworkserviceService.update(socialnetworkserviceDto);
	return "redirect:/socialnetworkservice/socialnetworkserviceXdmList";
}
}
