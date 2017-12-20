package com.chapter5_5;

import java.util.List;

public interface StreamApiInterface{
	
	static final String CONTROLLER_NAME = "StreamApiController"; 
	
	public void firstAction();
	public void secondAction();
	public void thirdAction();
	
	public List<String> getNameList();
}