package com.chapter3;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.chapter3.ThirdTermThreeController;



@Controller
@EnableAutoConfiguration
public class ThirdTermThreeController {

    //spring
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ThirdTermThreeController.class, args);
    }

  

	@RequestMapping("/")
    @ResponseBody
    String home() {
		
		return "ThirdTermTwoController";

    }
    
	public static String superFunc() {
		
		String string = "superだよん。";
		
		return string;
	}
	
	

    
}






