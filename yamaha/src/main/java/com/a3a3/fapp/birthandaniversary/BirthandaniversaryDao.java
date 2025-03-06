package com.a3a3.fapp.birthandaniversary;

import java.util.List;

public interface BirthandaniversaryDao {
	public List<BirthandaniversaryDto> selectList();
	public BirthandaniversaryDto selectOne(BirthandaniversaryDto birthandaniversaryDto);
	public int insert(BirthandaniversaryDto birthandaniversaryDto);
	public int update(BirthandaniversaryDto birthandaniversaryDto);
	
}
