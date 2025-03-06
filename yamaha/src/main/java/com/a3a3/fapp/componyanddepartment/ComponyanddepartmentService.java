package com.a3a3.fapp.componyanddepartment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComponyanddepartmentService {
@Autowired
ComponyanddepartmentDao componyanddepartmentDaos;

public List<ComponyanddepartmentDto> selectList(){
	 return componyanddepartmentDaos.selectList();
	}
public ComponyanddepartmentDto selectOne(ComponyanddepartmentDto componyanddepartmentDto){
	 return componyanddepartmentDaos.selectOne(componyanddepartmentDto);
	}
public int insert(ComponyanddepartmentDto componyanddepartmentDto){
	 return componyanddepartmentDaos.insert(componyanddepartmentDto);
	}
public int update(ComponyanddepartmentDto componyanddepartmentDto){
	 return componyanddepartmentDaos.update(componyanddepartmentDto);
	}
}
