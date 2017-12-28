package com.chapter7_2;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		
		//正規表現
		
		//7-2-1
		firstAction();
		
		//7-2-2
		secondAction();
		
		//7-2-3
		thirdAction();
		
		
		//7-2-4
		fourthAction();
		
		return "";
		
		
    }
	



	public void firstAction() {

		System.out.println("-------------");
		//ワイルドカードパターン
		//「.*」任意の０文字以上の文字列
		//「\\.」ピリオド
		Pattern pattern = Pattern.compile("This is a .*\\.");
		String sentence =  "This is a pen.";
		Matcher matcher = pattern.matcher(sentence);
		
		if(matcher.matches()) {
			System.out.println("適合する");
		}
		else {
			System.out.println("適合しない");
		}
	}
	
	public void secondAction() {

		System.out.println("-------------");
		//空白パターン
		//「\\s」空白
		//「\\s+」１つ以上の空白文字
		Pattern pattern = Pattern.compile("\\s+");
		String sentence =  "This             is            a pen.";
		
		//空白で文字を分割
		String[] words = pattern.split(sentence);
		
		for(String word : words) {
			System.out.println(word);
		}
	}
	
	public void thirdAction() {

		System.out.println("-------------");
		//置換
		Pattern pattern = Pattern.compile("\\s+");
		String sentence = "This               is a pen.";
		Matcher matcher = pattern.matcher(sentence);

		//１文字以上の空白を半角スペースに置き換え
		System.out.println(matcher.replaceAll(" "));
		
		
	}
	
	
	public void fourthAction() {

		System.out.println("-------------");
		//Stringクラスでの正規表現
		
		//パターンマッチ
		String sentence;
		sentence = "This    is a pen.";
		System.out.println(sentence.matches("Th.* is a .*\\."));
		sentence = "That    is a pen.";
		System.out.println(sentence.matches("Th.* is a .*\\."));
		
		//分割
		String[] words = sentence.split("\\s+");
		for(String word : words) {
			System.out.println(word);
		}
		
		//置換
		System.out.println(sentence.replaceAll("\\s+", " "));
	}
	
	
}





