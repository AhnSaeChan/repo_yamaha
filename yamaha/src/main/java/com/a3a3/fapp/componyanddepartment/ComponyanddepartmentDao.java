package com.a3a3.fapp.componyanddepartment;

import java.util.List;

import com.a3a3.fapp.emailaddress.EmailaddressDto;

public interface ComponyanddepartmentDao {

	public List<ComponyanddepartmentDto> selectList();
	public ComponyanddepartmentDto selectOne(ComponyanddepartmentDto componyanddepartmentDto);
	public int insert(ComponyanddepartmentDto componyanddepartmentDto);
	public int update(ComponyanddepartmentDto componyanddepartmentDto);
	public int delete(ComponyanddepartmentDto componyanddepartmentDto);
	public int uelete(ComponyanddepartmentDto componyanddepartmentDto);
}
