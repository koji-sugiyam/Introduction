package com.chapter5_2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiService extends StreamApiAbstract implements StreamApiInterface {

	private List<String> friendList;
	private Set<String> friendSet;
	private Map<Integer,String> friendMap;

	//コンストラクタ
	public StreamApiService() {

	}
	
	public void makeStreamFromList() {

		//Listデータ
		this.friendList = new ArrayList<>();
		this.friendList.add("飯沼");
		this.friendList.add("山下");
		this.friendList.add("清水");
		this.friendList.add("長森");
		this.friendList.add("中井");
		this.friendList.add("和田");
		this.friendList.add("川上");
		this.friendList.add("杉山");
		
		//丁寧な書き方
		System.out.println("List------");
		Stream<String> stream = this.friendList.stream();
		stream.forEach(System.out::println);
		
		//ラムダ式 //ArrayListはstreamしなくてもそのまま回せる
		System.out.println("List(Lambda)------");
		this.friendList.forEach(System.out::println);
		
		
	}
	public void makeStreamFromSet() {

		//Setデータ
		this.friendSet = new HashSet<>();
		this.friendSet.add("飯沼");
		this.friendSet.add("山下");
		this.friendSet.add("清水");
		this.friendSet.add("長森");
		this.friendSet.add("中井");
		this.friendSet.add("和田");
		this.friendSet.add("川上");
		this.friendSet.add("杉山");

		//丁寧な書き方
		System.out.println("List------");
		Stream<String> stream = this.friendSet.stream();
		stream.forEach(System.out::println);
		
		//ラムダ式 //ArraSetはstreamしなくてもそのまま回せる
		System.out.println("List(Lambda)------");
		this.friendSet.forEach(System.out::println);
		
	}
	public void makeStreamFromArray() {
		
	}
	public void makeStreamFromMap() {

		//Mapデータ
		this.friendMap = new HashMap<>();
		this.friendMap.put(1,"山下");
		this.friendMap.put(2,"清水");
		this.friendMap.put(3,"長森");
		this.friendMap.put(4,"中井");
		this.friendMap.put(5,"和田");
		this.friendMap.put(6,"川上");
		this.friendMap.put(7,"杉山");

		//丁寧な書き方
		//Mapは丁寧に書く場合Setを取得しないとStreamを取得できない
		System.out.println("Map------");
		Stream<Entry<Integer, String>> stream = this.friendMap.entrySet().stream();
		stream.forEach(System.out::println);
		
		//ラムダ式 //その代わりMapは、そのまま回せる
		System.out.println("Map(Lambda)------");
		this.friendMap.forEach((k,v) -> System.out.println(String.format("k=%d v=%s",k,v)));
		
	}
	public void makeStreamFromRange() {

		//Rangeは末尾を含まない
		System.out.println("IntStream Range------");
		IntStream stream1 = IntStream.range(1,5);
		stream1.forEach(System.out::println);
		//こういうこと
		// for(int i=0; i<5; i++)

		//rangeClosedは末尾を含む
		System.out.println("IntStream RangeClose------");
		IntStream stream2 = IntStream.rangeClosed(1,5);
		stream2.forEach(System.out::println);
		//こういうこと
		// for(int i=0; i<=5; i++)
		
		//IntStreamは、n回ができる
		System.out.println("IntStream RangeClose with count------");
		int count=5;
		IntStream.rangeClosed(0, count).forEach(System.out::println);
		//こういうこと
		// for(int i=0; i<=count; i++)
		
		
	}
	
	
	
}