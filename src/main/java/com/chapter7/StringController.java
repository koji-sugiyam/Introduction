package com.chapter7;


import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
@EnableAutoConfiguration
public class StringController{

	//spring
	public static void main(String... args)throws Exception {
		SpringApplication.run(StringController.class, args);
	}
	
    

	@RequestMapping("/")
	@ResponseBody
   String home() {
		
		//7-1-1
		firstAction();
		
		
		//7-1-2
		//文字列結合
		/*
		 * StringBuilder : 割愛　早い
		 * 「+」演算子 : 割愛　遅い
		 * concat　 : 割愛　まぁまぁ早い
		 * 
		 */
		
		//7-1-3
		//文字列分割
		/*
		 * .sptit(separator)
		 * 
		 */
		
		//7-1-4
		//複数文字の連結
		/*
		 * string.join(demiliter,list)
		 */
		fourthAction();
		
		//7-1-5
		//置換
		/*
		 * string.replace(target,string)
		 */
		fifthAction();
		
		//7-1-6
		//文字列検索
		/*
		 * int index = string.indexOf(string)
		 * 引数の文字の場所を　int で返す
		 * 
		 * int index = string.lastIndexOf(string)
		 * 引数の文字の場所を、後ろから　int で返す
		 * 
		 */
		
		return "";
		
		
    }
	



	public void firstAction() {
		
		String originalText = "THIS IS TEST!";
		String lowerText = originalText.toLowerCase();
		
		System.out.println("originalText = " + originalText);
		System.out.println("lowerText = " + lowerText);
		
		originalText = originalText + "2";
		System.out.println("originalText = " + originalText);
		
	}
	
	

	private void fourthAction() {

		List<String> stringList = new ArrayList<>();
		
		stringList.add("this");
		stringList.add("is");
		stringList.add("a");
		stringList.add("pen.");

		String message = String.join(" ", stringList);
		System.out.println("message = " + message);
	}
	
	

	private void fifthAction() {

		String string = "this is a pen.";

		String message = string.replace("is","at");
		System.out.println("message = " + message);
	}
	
	
}





