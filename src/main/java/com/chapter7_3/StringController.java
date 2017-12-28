package com.chapter7_3;



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
		
		//文字列のフォーマット
		
		//7-3
		//割愛
		
		return "";
		
		
    }
	
}





