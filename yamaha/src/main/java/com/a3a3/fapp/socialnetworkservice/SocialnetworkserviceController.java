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
}
