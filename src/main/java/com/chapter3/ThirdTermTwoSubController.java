package com.chapter3;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.chapter3.ThirdTermTwoSubController;



@Controller
@EnableAutoConfiguration
public class ThirdTermTwoSubController extends ThirdTermTwoController {

    //spring
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ThirdTermTwoSubController.class, args);
    }

    

	@RequestMapping("/")
    @ResponseBody
    String home() {
		
		return superFunc();
		//return "ThirdTermTwoSubController";

    }
    

    
}





