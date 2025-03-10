package com.a3a3.fapp.emailaddress;

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
	 public EmailaddressDto selectOne(EmailaddressDto emailaddressDto){ // 함수를 선언 ,Dto를 받겠다고 선언
		 return emailaddressDaos.selectOne(emailaddressDto); //하나씩 추가, 함수를 사용
	 }
	 public int insert(EmailaddressDto emailaddressDto){ // 함수를 선언 ,Dto를 받겠다고 선언
		 return emailaddressDaos.insert(emailaddressDto); //하나씩 추가, 함수를 사용
	 }
	 public int update(EmailaddressDto emailaddressDto){ // 함수를 선언 ,Dto를 받겠다고 선언
		 return emailaddressDaos.update(emailaddressDto); //하나씩 추가, 함수를 사용
	 }
	 public int delete(EmailaddressDto emailaddressDto){ // 함수를 선언 ,Dto를 받겠다고 선언
		 return emailaddressDaos.delete(emailaddressDto); //하나씩 추가, 함수를 사용
	 }
	 public int uelete(EmailaddressDto emailaddressDto){ // 함수를 선언 ,Dto를 받겠다고 선언
		 return emailaddressDaos.uelete(emailaddressDto); //하나씩 추가, 함수를 사용
	 }
}
