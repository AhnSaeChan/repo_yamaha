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
}
