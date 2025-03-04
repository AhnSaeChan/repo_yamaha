package com.a3a3.fapp.addnaveraddress;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddnaveraddressService {
@Autowired
AddnaveraddressDao addnaveraddressDaos;

public List<AddnaveraddressDto> selectList(){
	return addnaveraddressDaos.selectList();
}
}
