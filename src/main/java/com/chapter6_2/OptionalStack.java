package com.chapter6_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class OptionalStack<E> {
	

	public static void main(String[] args) {
		
		OptionalStack<String> optStack = new OptionalStack<>();
		Optional<String> optional = optStack.pop();
		String optElement = optional.orElse("empty");
		
		System.out.println(optElement);//empty
		
		optStack.push("Scala");
		optStack.push("Groovy");
		optStack.push("Java");
		
		optional = optStack.pop();
		
		if(optional.isPresent()) {
			System.out.println(optional.get());//Java
		}

		optional = optStack.pop();
		
		optional.ifPresent(System.out::println);//Groovy

		optional = optStack.pop();
		
		optional.ifPresent(System.out::println);//Scala
		
	}
	
	
	private List<E> taskList;
	
	public OptionalStack() {
		this.taskList = new ArrayList<>();
	}
	
	public boolean push(E task) {
		return this.taskList.add(task);		
	}
	
	public Optional<E> pop() {
		if(this.taskList.isEmpty()) {
			return Optional.empty();
		}		
		return Optional.of(this.taskList.remove(this.taskList.size() - 1));
	}	
	
	
	

}