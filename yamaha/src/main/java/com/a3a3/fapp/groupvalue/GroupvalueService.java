package com.a3a3.fapp.groupvalue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupvalueService {
@Autowired
GroupvalueDao groupvalueDaos;

public List<GroupvalueDto> selectList(){
	return groupvalueDaos.selectList();
}
}
