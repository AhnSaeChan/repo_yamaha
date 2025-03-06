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
public GroupvalueDto selectOne(GroupvalueDto groupvalueDto){
	return groupvalueDaos.selectOne(groupvalueDto);
}
public int insert(GroupvalueDto groupvalueDto){
	return groupvalueDaos.insert(groupvalueDto);
}
public int update(GroupvalueDto groupvalueDto){
	return groupvalueDaos.update(groupvalueDto);
}
}
