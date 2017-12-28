package com.chapter5_6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiService implements StreamApiInterface {
	
	
	
	//コンストラクタ
	public StreamApiService() {

		
	}
	
	public void firstAction() {
		
		List<Integer> integerList = IntStream.of(1,62,31,1,54,31)
				.boxed()
				.collect(Collectors.toList());
		System.out.println(String.format("integerList = %s", integerList));
		
		List<String> stringList = Stream.of("Sugi","Tanaka","Suzuki","Yamaguchi")
				/*.boxed()*/ //Stringの場合は不要
				.collect(Collectors.toList());
		System.out.println(String.format("stringList = %s", stringList));
		

	}
	
	
	
	public void secondAction() {

		List<Integer> integerRangeList = IntStream.rangeClosed(1,10)
				.boxed()
				.collect(Collectors.toList());
		System.out.println(String.format("integerRangeList = %s", integerRangeList));
		
	}

	public void thirdAction() {
		
		Integer[] integerArray = IntStream.of(1,62,31,1,54,31)
				.boxed()
				.toArray(n -> new Integer[n]);
		System.out.println(String.format("integerArray = %s", Arrays.toString(integerArray)));
				
		
		
	
	}
	
	
	
	
	

	
}