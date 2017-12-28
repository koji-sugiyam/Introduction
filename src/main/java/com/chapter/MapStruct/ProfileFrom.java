package com.chapter.MapStruct;

import lombok.Data;

@Data
public class ProfileFrom {
	
    protected String name;
    protected Integer age;
    protected String location;
    

    public ProfileFrom(String name,Integer age,String location) {
    	this.name = name;
    	this.age = age;
    	this.location = location;
    }


 	/*
 	//setterとgetterはlombokを使って自動生成
 	*/
}