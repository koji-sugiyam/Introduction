package com.chapter9;



import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@Controller
@RestController
@EnableAutoConfiguration
public class DateController{

	//spring
	public static void main(String... args)throws Exception {
		SpringApplication.run(DateController.class, args);
	}
	
    

	@RequestMapping("/")
	@ResponseBody
   String home() {
		
		//日付処理
		
		//9
		firstAction();
		
		
		return "";
		
		
    }
	



	public void firstAction() {

		System.out.println("-------------");
		
		//現在の時刻　//ログ出力などで使う
		Date now = new Date();
		System.out.println(now);

		Date date = new Date(5000);
		System.out.println(date);
		

	}
	
}





