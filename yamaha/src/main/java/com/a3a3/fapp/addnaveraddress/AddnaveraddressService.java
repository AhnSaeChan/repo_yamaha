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
public AddnaveraddressDto selectOne(AddnaveraddressDto addnaveraddressDto){
	return addnaveraddressDaos.selectOne(addnaveraddressDto);
}

public int insert(AddnaveraddressDto addnaveraddressDto){
	return addnaveraddressDaos.insert(addnaveraddressDto);
}

public int update(AddnaveraddressDto addnaveraddressDto){
	return addnaveraddressDaos.update(addnaveraddressDto);
}
}
