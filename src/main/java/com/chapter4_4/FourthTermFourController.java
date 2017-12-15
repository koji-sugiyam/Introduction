package com.chapter4_4;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.chapter4_3.BaseController;
import com.chapter4_4.FourthTermFourService;

@Controller
@EnableAutoConfiguration
public class FourthTermFourController extends BaseController {

    //spring
    public static void main(String... args) throws Exception {
        SpringApplication.run(FourthTermFourController.class, args);
    }


	@RequestMapping("/")
    @ResponseBody
    String home() {

		FourthTermFourService service = new FourthTermFourService();
		
		
		return service.CONTROLLER_NAME;

    }


	


	
}






