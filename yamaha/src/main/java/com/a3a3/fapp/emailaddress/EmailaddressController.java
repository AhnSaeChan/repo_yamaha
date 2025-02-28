package com.a3a3.fapp.emailaddress;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailaddressController {
	
	// 입력되는 주소에 매칭이 되는 html 정보를 정의
	// html로 데이터 전달
	
	@Autowired
	EmailaddressService emailaddressService;
	
//	@RequestMapping(value = "/emailaddress/emailaddressXdmList")
//	public String codeGroupXdmList(Model model) {
//		List<EmailaddressDto> emailaddressDtos = new ArrayList<>();
//		
//		emailaddressDtos =emailaddressService.selectList();
//		
//		model.addAttribute("list", emailaddressDtos);
//		
//		return "emailaddress/emailaddressXdmList";
//	}
	@RequestMapping(value = "/emailaddress/emailaddressXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", emailaddressService.selectList());
		return "emailaddress/emailaddressXdmList";
	}
}
