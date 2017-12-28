package com.chapter.MapStruct;

import lombok.Data;

@Data
public class Profile {
	
	protected String name;
	protected int age;
	protected String location;
    

    public Profile(String name,Integer age,String location) {
    	this.name = name;
    	this.age = age;
    	this.location = location;
    }


 	/*
 	//setterとgetterはlombokを使って自動生成
 	*/
    

}