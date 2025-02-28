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
}
