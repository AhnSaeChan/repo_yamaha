package com.a3a3.fapp.emailaddress;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.a3a3.fapp.addnaveraddress.AddnaveraddressDto;

@Repository
public interface EmailaddressDao {
	
//	mapper 에서 해당하는 쿼리와 연결 시켜 줌
//	쿼리 결과를 가져옴	
	
	public List<EmailaddressDto> selectList(); // 추상 메서드
	public EmailaddressDto selectOne(EmailaddressDto emailaddressDto);	 //mapper의 추상 메서드를 하나로 제한한다
	public int insert(EmailaddressDto emailaddressDto);
	public int update(EmailaddressDto emailaddressDto);
	public int delete(EmailaddressDto emailaddressDto);
	public int uelete(EmailaddressDto emailaddressDto);
	
}
