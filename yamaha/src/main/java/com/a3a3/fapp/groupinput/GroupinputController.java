package com.a3a3.fapp.groupinput;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GroupinputController {
@Autowired
GroupinputService groupinputService;

@RequestMapping(value = "/groupinput/groupinputXdmList")
public String codeGroupXdmList(Model model) {
	model.addAttribute("list", groupinputService.selectList());
	return "groupinput/groupinputXdmList";
}
}
