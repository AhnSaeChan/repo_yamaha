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

}
