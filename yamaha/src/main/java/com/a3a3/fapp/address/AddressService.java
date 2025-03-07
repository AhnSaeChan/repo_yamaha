package com.a3a3.fapp.address;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
@Autowired
AddressDao addressDaos; 

public List<AddressDto> selectList(){
	return addressDaos.selectList();
}
public AddressDto selectOne(AddressDto addressDto){
	return addressDaos.selectOne(addressDto);
}
public int insert(AddressDto addressDto){
	return addressDaos.insert(addressDto);
}
public int update(AddressDto addressDto){
	return addressDaos.update(addressDto);
}
public int delete(AddressDto addressDto){
	return addressDaos.delete(addressDto);
}
public int uelete(AddressDto addressDto){
	return addressDaos.uelete(addressDto);
}

}
