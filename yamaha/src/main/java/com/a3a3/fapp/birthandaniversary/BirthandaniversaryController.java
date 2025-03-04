package com.a3a3.fapp.birthandaniversary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BirthandaniversaryController {
@Autowired
BirthandaniversaryService birthandaniversaryService;

@RequestMapping(value = "/birthandaniversary/birthandaniversaryXdmList")
public String codeGroupXdmList(Model model) {
	model.addAttribute("list", birthandaniversaryService.selectList());
	return "birthandaniversary/birthandaniversaryXdmList";
}
}
