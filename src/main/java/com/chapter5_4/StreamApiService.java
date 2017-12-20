package com.chapter5_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.chapter5.Student;

public class StreamApiService implements StreamApiInterface {
	
	private List<String> memberList;
	private List<Integer> scoreList;
	private Map<Integer,String> memberMap;
	private List<String> memberArray;
	private List<Integer> scoreArray;
	private List<Student> students;
	
	//コンストラクタ
	public StreamApiService() {

		memberList = new ArrayList<>();
		memberList.add("杉山");
		memberList.add("佐藤");
		memberList.add("田中");
		memberList.add("米沢");
		
		scoreList = new ArrayList<>();
		scoreList.add(100);
		scoreList.add(30);
		scoreList.add(90);
		scoreList.add(40);
		

		memberMap = new HashMap<>();
		memberMap.put(1,"弘二");
		memberMap.put(2,"友香");
		memberMap.put(3,"幸太郎");
		memberMap.put(4,"守");
		
		memberArray = Arrays.asList("杉山","佐藤","田中","米沢");
		
		scoreArray = Arrays.asList(100,40,80,60);
		

		students = new ArrayList<>();
		students.add(new Student("杉山",100));
		students.add(new Student("杉山",90));
		students.add(new Student("佐藤",80));
		students.add(new Student("田中",60));
		students.add(new Student("飯沼",60));
		students.add(new Student("清水",40));
		students.add(new Student("高田",30));
		students.add(new Student("和田",20));
		students.add(new Student("川上",10));
		students.add(new Student("杉山",100));
		students.add(new Student("杉山",90));
		students.add(new Student("佐藤",80));
		students.add(new Student("田中",60));
		students.add(new Student("飯沼",50));
		students.add(new Student("清水",40));
		students.add(new Student("高田",60));
		students.add(new Student("和田",20));
		students.add(new Student("川上",10));
		
		
	}
	
	
	public void loopAction() {
		
		//List
		System.out.println("List----");
		memberList.forEach(v -> {
			System.out.println(String.format("あなたの苗字は「%s」です。", v));
			}
		);
		
		//Map
		System.out.println("Map----");
		memberMap.forEach((k,v) -> {
			int index = k-1;
			System.out.println(String.format("No.%d ： 「%s %s」です。", k, memberList.get(index),v));
			}
		);
	}
	
	public void collectAction() {
		
		//collect
		System.out.println("collect----");
		String csv = memberArray.stream()
				.collect(Collectors.joining(","));
		System.out.println(String.format("結合結果(CSV形式)　：　%s", csv));
			
	}
	

	public void groupingByAction() {
		
		//groupingBy
		System.out.println("groupingBy----");
		Map<Integer,List<Student>> map = students.stream()
				.collect(Collectors.groupingBy(Student::getScore));
		
		List<Student> prefects = map.get(60);
		prefects.forEach(v-> {
			System.out.println(String.format("%s %d",v.getName(),v.getScore()));
			}
		);
	}
	
	

	public void findAction() {
		//findAction
		System.out.println("findAction----");
		System.out.println("findFirst : " + scoreList.stream().findFirst());
		System.out.println("findAny : " + scoreList.stream().findAny());
		
		//min maxはComparatorを渡す
		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1,Integer o2) {
				//降順
				return o2.compareTo(o1);
			}			
		};
		System.out.println("min : " + scoreList.stream().min(c));
		System.out.println("max : " + scoreList.stream().max(c));
		
	}
	
	
	
	
	public void aggregateAction() {

		//aggregateAction
		System.out.println("aggregateAction----");
		System.out.println(String.format("memberList count : %d", memberList.stream().count()) );
		System.out.println(String.format("memberMap count : %d", memberMap.entrySet().stream().count()) );
		System.out.println(String.format("students count : %d", students.stream().count()) );
		System.out.println(String.format("students count 重複考慮 : %d", students.stream().distinct().count()) );
		
		//min max はOptionalで帰ってくるので、String型でフォーマット
		IntStream minIntStream = IntStream.rangeClosed(1,5);
		System.out.println(String.format("scoreList min : %s",minIntStream.min()) );
		IntStream maxIntStream = IntStream.rangeClosed(1,5); 
		System.out.println(String.format("scoreList max : %s", maxIntStream.max()) );
		IntStream sumIntStream = IntStream.rangeClosed(1,5);
		System.out.println(String.format("scoreList sum : %s", sumIntStream.sum()) );
		IntStream aveIntStream = IntStream.rangeClosed(1,5);
		System.out.println(String.format("scoreList average : %s", aveIntStream.average()) );
		
	}
	
	
	
}