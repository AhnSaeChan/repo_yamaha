package com.a3a3.fapp.personalhomepage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalhomepageService {
@Autowired
PersonalhomepageDao personalhomepageDoas;

public List<PersonalhomepageDto> selectList(){
	return personalhomepageDoas.selectList();
}
public PersonalhomepageDto selectOne(PersonalhomepageDto personalhomepageDto){
	return personalhomepageDoas.selectOne(personalhomepageDto);
}
public int insert(PersonalhomepageDto personalhomepageDto){
	return personalhomepageDoas.insert(personalhomepageDto);
}
public int update(PersonalhomepageDto personalhomepageDto){
	return personalhomepageDoas.update(personalhomepageDto);
}
}
