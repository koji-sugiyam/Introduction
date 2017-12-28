package com.chapter.MapStruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
@EnableAutoConfiguration
public class MapStructController{

	//spring
	public static void main(String... args)throws Exception {
		SpringApplication.run(MapStructController.class, args);
	}
	
    

	@RequestMapping("/")
	@ResponseBody
   String home() {
		
		//MapAStructの勉強
		mapperAction();
		
		
		return "MapStructController";
		
		
    }
	



	public void mapperAction() {

		System.out.println("-------------");
		
		ProfileFrom form = new ProfileFrom("マイケル・スコフィールド", 30, "アメリカ合衆国");
		Profile profile = ProfileMapper.INSTANCE.profileFromToProfile(form);

		
		System.out.println(profile.getName()); // マイケル・スコフィールド
		System.out.println(profile.getAge());  // 30
		System.out.println(profile.getLocation()); // アメリカ合衆国
		

		
	}
	
	
	
	
}





