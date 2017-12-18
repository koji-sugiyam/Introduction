package com.chapter4_6;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.chapter4_6.FourthTermSixService;

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





