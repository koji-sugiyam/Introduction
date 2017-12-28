package com.chapter5_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamApiService implements StreamApiInterface {
	
	
	private List<String> memberList;
	private List<String> response;
	
	private String csv;
	
	//コンストラクタ
	public StreamApiService() {

		memberList = new ArrayList<>();
		memberList.add("杉山弘二");
		memberList.add("佐藤");
		memberList.add("田中洋一郎");
		memberList.add("米沢守");
		memberList.add("中村鋼機");
		
		
	}
	
	

	public void firstAction() {
		
		//王道は map、filter、 collect。
		System.out.println("---");
		List<String> newList = memberList.stream()
				.filter(v -> v.length() > 2)
				.map(v -> "[" + v + "]")
				.collect(Collectors.toList()
				);
		newList.forEach(System.out::println);
		
	}
	
	
	
	public void secondAction() {
		
		//n回繰り返しするIntStream
		System.out.println("//n回繰り返しするIntStream ---");
		int count = 5;
		IntStream intStream = IntStream.rangeClosed(1,5);
		intStream.forEach(v -> System.out.println(String.format("%s回目", v)));
		

		//n回繰り返しする for
		//ナンバーを4桁で付記して、メンバー名を４こ表示
		System.out.println("//n回繰り返しする for ---");
		count = 4;
		for(int i=0; i < count; i++) {
			int no = i+1;
			System.out.println(String.format("No.%04d：%sさん", no, memberList.get(i)));
		}
		
		//メンバーリストに登録されているメンバーをすべて出力 「さん」をつけて
		System.out.println("//メンバをすべて出力 ---");
		memberList.forEach(v -> {
			System.out.println(String.format("%sさん", v));
		});
		
		//全メンバーのCSVを変数に格納して出力
		System.out.println("//全メンバーのCSVを変数に格納して出力 ---");
		csv = "";
		memberList.forEach(v -> {
			csv += v + ",";
		});
		csv = csv.substring(0, csv.length()-1);
		System.out.println(String.format("メンバーのｃｓｖ　：　%s", csv));
		
		
		
	}
	
	
	
	
	public void thirdAction() {
		
		//ListやMapに対する効率的な処理
		System.out.println("//ListやMapに対する効率的な処理 ---");
		
		
		
	}
	
	
	
	
	
	
	
	public List<String> getNameList() {
		
		//メンバーリストのメンバーを、「さん」をつけてリストで返してJSON出力
		System.out.println("///メンバーリストのメンバーを、「さん」をつけてリストで返してブラウザにJSON出力 ---");
		response = new ArrayList<>();
		memberList.forEach(v -> {
			String name = String.format("%sさん", v);
			response.add(name);
		});
		
		return response;
		
	}
	
	
}