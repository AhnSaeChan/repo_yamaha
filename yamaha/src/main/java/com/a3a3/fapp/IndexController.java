package com.a3a3.fapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}
	@RequestMapping(value = "/index2")
	public String index2() {
		return "abc/inddex";
	}
	@RequestMapping(value = "/index3")
	public String index3() {
		return "efg/indddexx";
	}
	@RequestMapping(value = "/helloWorld")
	public String helloWorld() {
		return "helloWorld/helloWorld";
	}
	@RequestMapping(value = "/aaa")
	public String aaa() {
		return "aaa/bbb/aaa/aaa";
	}
	@RequestMapping(value = "/xxx")
	public String xxx() {
		return "ttt/yyy/zzz/yyy/xxx";
	}
	@RequestMapping(value = "/zzz")
	public String zzz() {
		return "xxx/yyy/zzz/yyy/zzz";
	}
	@RequestMapping(value = "/loginForm2")
	public String loginForm2() {
		return "/infra/member/loginXdmForm/adm/v1/tmphame/infra/member/loginForm";
	}
	@RequestMapping(value = "/codeGroupList")
	public String codeGroupList() {
		return "/infra/codegroup/codeGroupXdmList/adm/v1/tmpname/infra/codegroup/codeGroupList";
	}
	@RequestMapping(value = "/codeGroupForm")
	public String codeGroupForm() {
		return "/infra/codegroup/codeGroupXdmForm/adm/v1/tmpname/infra/codegroup/codeGroupForm";
	}
	@RequestMapping(value = "/loginForm")
	public String loginForm() {
		return "/infra/member/loginUsrForm/usr/v1/tmpname/infra/member/loginForm";
	}
//	/helloWorld
//	helloWorld
//	
//	/aaa/bbb
//	bbb/aaa
//	
//	/xxx/yyy/zzz
//	yyy/zzz
//	
//	/ttt/yyy
//	zzz/yyy/xxx
	
//	/infra/member/loginXdmForm
//	adm/v1/tmpname/infra/member/loginForm
//	
//	/infra/codegroup/codeGroupXdmList
//	adm/v1/tmpname/infra/codegroup/codeGroupList
//	
//	
//	/infra/codegroup/codeGroupXdmForm
//	adm/v1/tmpname/infra/codegroup/codeGroupForm
//	
//	/infra/member/loginUsrForm
//	usr/v1/tmpname/infra/member/loginForm
	
//	<br><a href="/helloWorld">helloWorld</a>
}
