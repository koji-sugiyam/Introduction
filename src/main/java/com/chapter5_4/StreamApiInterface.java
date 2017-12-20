package com.chapter5_4;

public interface StreamApiInterface{
	
	static final String CONTROLLER_NAME = "StreamApiController"; 
	
	public void loopAction();
	public void collectAction();
	public void groupingByAction();
	public void findAction();
	public void aggregateAction();
}