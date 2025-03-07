package com.a3a3.fapp.socialnetworkservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialnetworkserviceService {
@Autowired
SocialnetworkserviceDao socialnetworkserviceDaos;

public List<SocialnetworkserviceDto> selectList(){
	return socialnetworkserviceDaos.selectList();
}
public SocialnetworkserviceDto selectOne(SocialnetworkserviceDto socialnetworkserviceDto){
	return socialnetworkserviceDaos.selectOne(socialnetworkserviceDto);
}
public int insert(SocialnetworkserviceDto socialnetworkserviceDto){
	return socialnetworkserviceDaos.insert(socialnetworkserviceDto);
}
public int update(SocialnetworkserviceDto socialnetworkserviceDto){
	return socialnetworkserviceDaos.update(socialnetworkserviceDto);
}
}
