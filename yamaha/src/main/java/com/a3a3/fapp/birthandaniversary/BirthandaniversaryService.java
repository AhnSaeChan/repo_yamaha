package com.a3a3.fapp.birthandaniversary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BirthandaniversaryService {
@Autowired
BirthandaniversaryDao birthandaniversaryDaos;

public List<BirthandaniversaryDto> selectList(){
	return birthandaniversaryDaos.selectList();
}
public BirthandaniversaryDto selectOne(BirthandaniversaryDto birthandaniversaryDto ){
	return birthandaniversaryDaos.selectOne(birthandaniversaryDto);
}
public int insert(BirthandaniversaryDto birthandaniversaryDto){
	return birthandaniversaryDaos.insert(birthandaniversaryDto);
}
public int update (BirthandaniversaryDto birthandaniversaryDto){
	return birthandaniversaryDaos.update(birthandaniversaryDto);
}
public int delete (BirthandaniversaryDto birthandaniversaryDto){
	return birthandaniversaryDaos.delete(birthandaniversaryDto);
}
public int uelete (BirthandaniversaryDto birthandaniversaryDto){
	return birthandaniversaryDaos.uelete(birthandaniversaryDto);
}

}
