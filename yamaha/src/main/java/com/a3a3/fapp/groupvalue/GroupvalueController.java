package com.a3a3.fapp.groupvalue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GroupvalueController {
@Autowired
GroupvalueService groupvalueService;

@RequestMapping(value = "/groupvalue/groupvalueXdmList")
public String codeGroupXdmList(Model model) {
	model.addAttribute("list", groupvalueService.selectList());
	return "groupvalue/groupvalueXdmList";
}
}
