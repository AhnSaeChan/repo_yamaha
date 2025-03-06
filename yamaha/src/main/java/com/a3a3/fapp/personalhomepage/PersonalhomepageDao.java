package com.a3a3.fapp.personalhomepage;

import java.util.List;

public interface PersonalhomepageDao {
	public List<PersonalhomepageDto> selectList();
	public PersonalhomepageDto selectOne(PersonalhomepageDto personalhomepageDto);
	public int insert(PersonalhomepageDto personalhomepageDto);
	public int update(PersonalhomepageDto personalhomepageDto);
}
