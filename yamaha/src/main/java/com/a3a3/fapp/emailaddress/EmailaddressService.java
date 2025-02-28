package com.a3a3.fapp.emailaddress;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailaddressService {
	
// 로직을 정의 하는 부분
	
// 여러건의 데이터를 가지고 온다
	
	@Autowired
	EmailaddressDao emailaddressDaos;
//	
//	public List<EmailaddressDto> selectList(){
//		List<EmailaddressDto> emailaddressDtos = new ArrayList<>();
//		
//		
//		emailaddressDtos =emailaddressDaos.selectList();
//		
//		return emailaddressDtos;
//	}
	
	 public List<EmailaddressDto> selectList(){
	 return emailaddressDaos.selectList();
	}
}
