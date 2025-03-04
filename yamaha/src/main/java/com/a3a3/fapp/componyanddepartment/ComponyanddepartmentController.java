package com.a3a3.fapp.componyanddepartment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ComponyanddepartmentController {
	@Autowired
	ComponyanddepartmentService componyanddepartmentService;
	
	@RequestMapping(value = "/componyanddepartment/componyanddepartmentXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", componyanddepartmentService.selectList());
		return "componyanddepartment/componyanddepartmentXdmList";
	}
	@RequestMapping(value = "/componyanddepartment/componyanddepartmentXdmView")
	public String codeGroupXdmView(Model model, ComponyanddepartmentDto componyanddepartmentDto) {
		System.out.println("componyanddepartmentDto/getseq():" + componyanddepartmentDto.getSeq());
		model.addAttribute("item", componyanddepartmentService.selectOne(componyanddepartmentDto));
		return "componyanddepartment/componyanddepartmentXdmView";
	}
	
}
