package com.a3a3.fapp.socialnetworkservice;

import java.util.List;

public interface SocialnetworkserviceDao {
	public List<SocialnetworkserviceDto> selectList();
	public SocialnetworkserviceDto selectOne(SocialnetworkserviceDto socialnetworkserviceDto);
	public int insert(SocialnetworkserviceDto socialnetworkserviceDto);
	public int update(SocialnetworkserviceDto socialnetworkserviceDto);

}
