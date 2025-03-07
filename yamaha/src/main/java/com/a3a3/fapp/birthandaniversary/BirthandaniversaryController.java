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
@RequestMapping(value = "/birthandaniversary/birthandaniversaryXdmView")
public String codeGroupXdmView(Model model, BirthandaniversaryDto birthandaniversaryDto ) {
	model.addAttribute("item", birthandaniversaryService.selectOne(birthandaniversaryDto));
	return "birthandaniversary/birthandaniversaryXdmView";
}
@RequestMapping(value = "/birthandaniversary/birthandaniversaryXdmForm")
public String birthandaniversaryXdmForm() {
	
	return "birthandaniversary/birthandaniversaryXdmForm";
}
@RequestMapping(value = "/birthandaniversary/birthandaniversaryXdmInst")
public String birthandaniversaryXdmInst(BirthandaniversaryDto birthandaniversaryDto) {
	birthandaniversaryService.insert(birthandaniversaryDto);
	return "redirect:/birthandaniversary/birthandaniversaryXdmList";
}
@RequestMapping(value = "/birthandaniversary/birthandaniversaryXdmMform")
public String birthandaniversaryXdmMform(Model model,BirthandaniversaryDto birthandaniversaryDto ) {
	model.addAttribute("item", birthandaniversaryService.selectOne(birthandaniversaryDto));
	return "/birthandaniversary/birthandaniversaryXdmMform";
}
@RequestMapping(value = "/birthandaniversary/birthandaniversaryXdmUpdt")
public String birthandaniversaryXdmUpdt(BirthandaniversaryDto birthandaniversaryDto) {
	birthandaniversaryService.update(birthandaniversaryDto);
	return  "redirect:/birthandaniversary/birthandaniversaryXdmList";
}
@RequestMapping(value = "/birthandaniversary/birthandaniversaryXdmDele")
public String birthandaniversaryXdmDele(BirthandaniversaryDto birthandaniversaryDto) {
	birthandaniversaryService.delete(birthandaniversaryDto);
	return  "redirect:/birthandaniversary/birthandaniversaryXdmList";
}
@RequestMapping(value = "/birthandaniversary/birthandaniversaryXdmUele")
public String birthandaniversaryXdmUele(BirthandaniversaryDto birthandaniversaryDto) {
	birthandaniversaryService.uelete(birthandaniversaryDto);
	return  "redirect:/birthandaniversary/birthandaniversaryXdmList";
}
}
