package com.chapter4_6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class FourthTermSixController {

    
    //spring
    public static void main(String... args) throws Exception {
    	SpringApplication.run(FourthTermSixController.class, args);
    }


	@RequestMapping("/")
    @ResponseBody
    String home() {
		
		FourthTermSixService service = new FourthTermSixService();

		//4-6-1
		//キュー
		service.queueUse();
		
		//4-6-2
		//両端キュー
		service.decueueUse();
		
		return service.CONTROLLER_NAME;

    }
	
}





