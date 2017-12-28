package com.chapter.MapStruct;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.chapter.MapStruct.Profile;
import com.chapter.MapStruct.ProfileFrom;


@Mapper
public interface ProfileMapper {

	ProfileMapper INSTANCE = Mappers.getMapper(ProfileMapper.class);
	
	public Profile profileFromToProfile(ProfileFrom from);
	
	
}
