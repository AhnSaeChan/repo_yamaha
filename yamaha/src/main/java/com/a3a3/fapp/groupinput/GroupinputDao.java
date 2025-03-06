package com.a3a3.fapp.groupinput;

import java.util.List;

public interface GroupinputDao {
	public List<GroupinputDto> selectList();
	public GroupinputDto selectOne(GroupinputDto groupinputDto);
	public int insert(GroupinputDto groupinputDto);
	public int update(GroupinputDto groupinputDto);
}
