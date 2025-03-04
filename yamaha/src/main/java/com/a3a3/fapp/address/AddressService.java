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
}
