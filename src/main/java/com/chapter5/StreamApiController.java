package com.chapter5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class StreamApiController extends StreamApiService {

    //spring
    public static void main(String... args) throws Exception {
    	SpringApplication.run(StreamApiController.class, args);
    }

	@RequestMapping("/")
    @ResponseBody
    String home() {
		
		StreamApiService service = new StreamApiService();
		
		//5-1-1
		//StreamApiの基本
		//5-1-2
		//ラムダ式の書き方
		//5-1-3
		//メソッド参照
		return service.streamApiRun();
		
		
		
    }
	
}





