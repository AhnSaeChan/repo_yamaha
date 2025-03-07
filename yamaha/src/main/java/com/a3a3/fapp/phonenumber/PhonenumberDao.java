package com.a3a3.fapp.phonenumber;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.a3a3.fapp.emailaddress.EmailaddressDto;

@Repository
public interface PhonenumberDao {
	public List<PhonenumberDto> selectList();
	public PhonenumberDto selectOne(PhonenumberDto phonenumberDto);
	public int insert(PhonenumberDto phonenumberDto);
	public int update(PhonenumberDto phonenumberDto);
}
