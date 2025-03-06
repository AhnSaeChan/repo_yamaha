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
@RequestMapping(value = "/groupvalue/groupvalueXdmView")
public String groupvalueXdmView(Model model,GroupvalueDto groupvalueDto ) {
	model.addAttribute("item", groupvalueService.selectOne(groupvalueDto));
	return "groupvalue/groupvalueXdmView";
}
@RequestMapping(value = "/groupvalue/groupvalueXdmForm")
public String groupvalueXdmForm() {
	
	return "groupvalue/groupvalueXdmForm";
}
@RequestMapping(value = "/groupvalue/groupvalueXdmInst")
public String groupvalueXdmInst(GroupvalueDto groupvalueDto) {
	groupvalueService.insert(groupvalueDto);
	return "redirect:/groupvalue/groupvalueXdmList";
}
@RequestMapping(value = "/groupvalue/groupvalueXdmMform")
public String groupvalueXdmMform(Model model,GroupvalueDto groupvalueDto ) {
	model.addAttribute("item", groupvalueService.selectOne(groupvalueDto));
	return "groupvalue/groupvalueXdmMform";
}
@RequestMapping(value = "/groupvalue/groupvalueXdmUpdt")
public String codeGroupXdmList(GroupvalueDto groupvalueDto) {
	groupvalueService.update(groupvalueDto);
	return "redirect:/groupvalue/groupvalueXdmList";
}
}
