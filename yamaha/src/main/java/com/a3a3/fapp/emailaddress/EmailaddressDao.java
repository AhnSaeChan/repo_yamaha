package com.a3a3.fapp.emailaddress;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface EmailaddressDao {
	
//	mapper 에서 해당하는 쿼리와 연결 시켜 줌
//	쿼리 결과를 가져옴	
	
	public List<EmailaddressDto> selectList(); // 추상 메서드
		
	
}
