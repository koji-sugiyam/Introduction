package com.chapter5_2;

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
		
		//5-2-1
		//ListやSetからStreamを作成する
		service.makeStreamFromList();
		service.makeStreamFromSet();
		//5-2-2
		//配列からStreamを作成する
		service.makeStreamFromArray();
		//5-2-3
		//MapからStreamを作成する
		service.makeStreamFromMap();
		//5-2-4
		//RangeからStreamを作成する
		service.makeStreamFromRange();
		
		return service.CONTROLLER_NAME;
		
		
		
    }
	
}





