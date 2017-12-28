package com.chapter8;


import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@Controller
@RestController
@EnableAutoConfiguration
public class FileController{

	//spring
	public static void main(String... args)throws Exception {
		SpringApplication.run(FileController.class, args);
	}
	
    

	@RequestMapping("/")
	@ResponseBody
   String home() {
		
		//ファイル操作　後日
		
		//8
		firstAction();
		
		
		return "";
		
		
    }
	



	public void firstAction() {

		System.out.println("-------------");
		

	}
	
	
}





