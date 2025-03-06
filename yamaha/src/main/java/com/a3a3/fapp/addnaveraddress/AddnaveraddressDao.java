package com.a3a3.fapp.addnaveraddress;

import java.util.List;

public interface AddnaveraddressDao {
	public List<AddnaveraddressDto> selectList();
	public AddnaveraddressDto selectOne(AddnaveraddressDto addnaveraddressDto);
	public int insert(AddnaveraddressDto addnaveraddressDto);
	public int update(AddnaveraddressDto addnaveraddressDto);
	
}
