package com.chapter5;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.chapter5.StreamApiService;

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





