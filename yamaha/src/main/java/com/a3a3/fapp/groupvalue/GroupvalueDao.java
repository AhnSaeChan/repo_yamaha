package com.a3a3.fapp.groupvalue;

import java.util.List;

public interface GroupvalueDao {
	public List<GroupvalueDto> selectList();
	public GroupvalueDto selectOne(GroupvalueDto groupvalueDto);
	public int insert(GroupvalueDto groupvalueDto);
	public int update(GroupvalueDto groupvalueDto);
}
