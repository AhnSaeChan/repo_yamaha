package com.a3a3.fapp.groupinput;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupinputService {
@Autowired
GroupinputDao groupinputDoas;

public List<GroupinputDto> selectList(){
	return groupinputDoas.selectList();
}
public GroupinputDto selectOne(GroupinputDto groupinputDto){
	return groupinputDoas.selectOne(groupinputDto);
}
public int insert(GroupinputDto groupinputDto){
	return groupinputDoas.insert(groupinputDto);
}
public int update(GroupinputDto groupinputDto){
	return groupinputDoas.update(groupinputDto);
}
}
