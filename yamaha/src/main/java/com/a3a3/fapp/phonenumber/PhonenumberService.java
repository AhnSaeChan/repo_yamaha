package com.a3a3.fapp.phonenumber;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhonenumberService {
	@Autowired
	PhonenumberDao phonenumberDaos;

	public List<PhonenumberDto> selectList(){
		return phonenumberDaos.selectList();
	}
	public PhonenumberDto selectOne(PhonenumberDto phonenumberDto){
		return phonenumberDaos.selectOne(phonenumberDto);
	}
	public int insert(PhonenumberDto phonenumberDto){
		return phonenumberDaos.insert(phonenumberDto);
	}
	public int update(PhonenumberDto phonenumberDto){
		return phonenumberDaos.update(phonenumberDto);
	}
	
}
