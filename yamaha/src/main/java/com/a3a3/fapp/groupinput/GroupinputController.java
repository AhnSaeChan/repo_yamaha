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
@RequestMapping(value = "/groupinput/groupinputXdmView")
public String groupinputXdmView(Model model, GroupinputDto groupinputDto) {
	model.addAttribute("item", groupinputService.selectOne(groupinputDto));
	return "groupinput/groupinputXdmView";
}
@RequestMapping(value = "/groupinput/groupinputXdmForm")
public String groupinputXdmForm() {
	
	return "groupinput/groupinputXdmForm";
}
@RequestMapping(value = "/groupinput/groupinputXdmInst")
public String groupinputXdmInst(GroupinputDto groupinputDto) {
	groupinputService.insert(groupinputDto);
	return "redirect:/groupinput/groupinputXdmList";
}
@RequestMapping(value = "/groupinput/groupinputXdmMform")
public String groupinputXdmMform(Model model,GroupinputDto groupinputDto ) {
	model.addAttribute("item", groupinputService.selectOne(groupinputDto));
	return "/groupinput/groupinputXdmMform";
}
@RequestMapping(value = "/groupinput/groupinputXdmUpdt")
public String groupinputXdmUpdt(GroupinputDto groupinputDto) {
	groupinputService.update(groupinputDto);
	return "redirect:/groupinput/groupinputXdmList";
}
}
