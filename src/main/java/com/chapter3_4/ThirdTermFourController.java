package com.chapter3_4;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@EnableAutoConfiguration
public class ThirdTermFourController {

    //spring
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ThirdTermFourController.class, args);
    }


	@RequestMapping("/")
    @ResponseBody
    String home() {
		
		//3-4-1
		//enum 列挙型
		enumTest();
		
		
		//3-4-2
		//ジェネリクス（総称型）
		arrayList();
		
		//スタックリスト
		stackList();
		
		//おまけ
		ramuda();
		
		return "ThirdTermFourController";

    }
	




	public enum HttpStatus{
		//ここが列挙する値
		OK(200), 
		NOT_FOUND(404), 
		INTERNAL_SERVER_ERROR(500);
	
		private final int value;
		private HttpStatus(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
	}
	
	public void enumTest() {
		
		HttpStatus hs;
		hs = HttpStatus.OK;
		//hs = HttpStatus.NOT_FOUND;
		//hs = HttpStatus.INTERNAL_SERVER_ERROR;
		System.out.println("HttpStatus = " + hs + "["+hs.getValue()+"]");
	}

	
	
	


	public void arrayList() {
		
		//ジェネリクス
		//java5から使える　java7以降なら「<>」ダイヤモンドオペレーターが使える
		ArrayList<String> list = new ArrayList<>();
		
		list.add("要素1");
		list.add("要素2");
		list.add("要素3");
		list.add("要素4");
		
		for(int i =0; i<list.size();i++) {
			//String element = (String)list.get(i);//index 0 番を取得
			String element = list.get(i);//ジェネリクスを設定するとキャスト不要「(String)」とか
			
			System.out.println(element);
		}
		System.out.println("--------\r\n");
		
	}
	
	public void stackList() {
		
		//Stringスタックリスト
		ArrayList<String> stringStackList = new ArrayList<>();

		stringStackList = arrayPushString(stringStackList,"要素1");
		stringStackList = arrayPushString(stringStackList,"要素2");
		stringStackList = arrayPushString(stringStackList,"要素3");
		stringStackList = arrayPushString(stringStackList,"要素4");
		System.out.println("\r\n");

		for(int i = stringStackList.size()-1; i>=0;i--) {
			String element = stringStackList.get(i);
			System.out.println(String.format("element %s を取り出した。",element));
			stringStackList = arrayPopString(stringStackList);
			System.out.println(stringStackList + "\r\n");
		}
		System.out.println("--------\r\n");

		//Genericsスタックリスト
		ArrayList<Integer> genericStackList = new ArrayList<>();

		genericStackList = arrayPushGenerics(genericStackList,1);
		genericStackList = arrayPushGenerics(genericStackList,2);
		genericStackList = arrayPushGenerics(genericStackList,3);
		genericStackList = arrayPushGenerics(genericStackList,4);
		System.out.println("\r\n");

		for(int i = genericStackList.size()-1; i>=0;i--) {
			Integer element = genericStackList.get(i);
			System.out.println(String.format("element %s を取り出した。",element));
			genericStackList = arrayPopGenerics(genericStackList);
			System.out.println(genericStackList + "\r\n");
		}
		System.out.println("--------\r\n");
		
	}
	
	//ユーザー関数
	//arrayPushString
	private ArrayList<String> arrayPushString(ArrayList<String> list, String string) {
		list.add(string);
		return list;
	}
	//arrayPopString
	private ArrayList<String> arrayPopString(ArrayList<String> list) {
		list.remove(list.size()-1);
		return list;
	}

	//arrayPushGenerics
	private ArrayList<Integer> arrayPushGenerics(ArrayList<Integer> list, Integer integer) {
		list.add(integer);
		return list;
	}
	//arrayPopGenerics
	private ArrayList<Integer> arrayPopGenerics(ArrayList<Integer> list) {
		list.remove(list.size()-1);
		return list;
	}
	
	
	
	
	
	public void ramuda() {

		ArrayList<String> list = new ArrayList<>();

		list.add("要素1");
		list.add("要素2");
		list.add("要素3");
		list.add("要素4");
		
		list.forEach(e -> System.out.println(e));
	}
}






