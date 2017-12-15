package com.chapter4_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

import lombok.Data;

@Data
public class FourthTermThreeService implements FourthTermThreeInterface {

	public FourthTermThreeService() {
		
	}
	
	
	public void lambda() {

		System.out.println("------"+"ramuda");
		ArrayList<String> list = new ArrayList<>();

		int count = 10;
		for(int i=0; i<count; i++) {
			list.add(String.format("要素 %d",i));
		}
		System.out.println(list);
		
		//ラムダ式　jQueryの「.each()」もこんな感じで書けるよね
		list.forEach(v -> {
			System.out.println(v);
			});
		//コラム
		//mapなら　map.forEach((k,v)->{});　ができるよ　
		System.out.println("------");
	}
	
	
	
	public void makeList() {

		System.out.println("//makeList");
		
		//通常
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(31);
		list.add(6);
		list.add(29);
		
		System.out.println(list);
		System.out.println("--");

		//これはReadOnlyになる
		List<Integer> listReadOnly = Arrays.asList(1,5,2,7,2); 

		System.out.println(listReadOnly);
		//listReadOnly.add(65); //エラー

		//これならMutableになる
		List<Integer> listMutable = new ArrayList<>(Arrays.asList(1,5,2,7,2)); 
		listMutable.add(65);
		System.out.println(listMutable);
		
		System.out.println("-----");
		
	}
	
	
	public void listMethodTest() {

		System.out.println("//listMethodTest");
		
		List<String> names = new ArrayList<>();
		
		//add
		names.add("hassy");
		names.add("sada");
		names.add("kani");
		names.add("hama");
		names.add("tsurumin");
		names.add("koji");
		names.add("sugi");
		System.out.println(names);
		System.out.println("--");
		
		//set
		names.set(0,"takahashi");
		System.out.println(names);
		System.out.println("--");
		
		//get
		System.out.println(names.get(5));
		System.out.println("--");
		
		//remove
		names.remove(5);
		System.out.println(names);
		System.out.println("--");
		
		//size
		System.out.println(names.size());
		System.out.println("--");
		
		//indexOf
		System.out.println(names.indexOf("takahashi"));
		System.out.println(names.indexOf("kani"));
		System.out.println(names.indexOf("sugi"));
		System.out.println("--");
		
		//contains
		if(names.contains("koji")) {
			System.out.println("含まれています");
		}
		else {
			System.out.println("含まれていません");
		}
		System.out.println(names.contains("sugi"));
		

		
		System.out.println("-----");
		
		
	}
	
	public void listSort() {

		System.out.println("//listSort");
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(4);
		list.add(3);
		System.out.println(list);
		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1,Integer o2) {
				//降順
				return o2.compareTo(o1);
			}			
		};
		Collections.sort(list,c);
		System.out.println(list);
		

		System.out.println("-----");
		
	}
	
	public void listSearch() {

		System.out.println("//listSearch");

		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(4);
		list.add(3);
		System.out.println(list);
		
		//binarySearchはソートが必須
		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1,Integer o2) {
				//降順
				return o1.compareTo(o2);
			}			
		};
		Collections.sort(list,c);
		
		//検索実行
		int found = Collections.binarySearch(list, 2);
		System.out.println(found);
		
		
		System.out.println("-----");
	}

	
	
	
	
	public void listInteration() {

		System.out.println("//listInteration");
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("-");
		
		//ラムダ
		list.forEach(v->System.out.println(v));
		
		System.out.println("-----");
		
	}
	
}






