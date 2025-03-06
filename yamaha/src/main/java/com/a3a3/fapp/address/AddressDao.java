package com.a3a3.fapp.address;

import java.util.List;

public interface AddressDao {
	public List<AddressDto> selectList();
	public AddressDto selectOne(AddressDto addressDto);
	public int insert(AddressDto addressDto);
	public int update(AddressDto addressDto);
}
