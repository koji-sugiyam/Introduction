package com.chapter2;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chapter3.ThirdTermOneController;


@Controller
@EnableAutoConfiguration
public class SecondTermTwoController {

	//spring
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ThirdTermOneController.class, args);
    }
    
	@RequestMapping("/")
    @ResponseBody
    String home() {

    	//2-1
    	classAndMethod();
    	
        return "SecondTermTwoController";
    }

    
    public static void classAndMethod() {

    	//date
    	Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日");
        String nowDate = formatter.format(date);

        
        //初期化
        String name;
        int score;
        String resultString;
        String stFormat;
        
        //データ 杉山
    	Student KSInstance = new Student();
    	KSInstance.setName("杉山");
    	KSInstance.setScore(10);
    	
    	name = KSInstance.getName();
    	score = KSInstance.getScore();
    	//String resultString = nowDate + "の" +  name + "さんの点数は、" + score + "点です。";
    	//resultString = String.format("%sの%sさんの点数は%d点です。", nowDate, name, score);
        stFormat = "%sの%sさんの点数は%d点です。";
    	resultString = String.format(stFormat, nowDate, name, score);
    	System.out.println(resultString);
    
    	
        //データ 友達
    	Student FRInstance = new Student();
    	FRInstance.setName("友達");
    	FRInstance.setScore(60);
    	
    	name = FRInstance.getName();
    	score = FRInstance.getScore();
        stFormat = "%sの%sさんの点数は%d点です。";
    	resultString = String.format(stFormat, nowDate, name, score);
    	System.out.println(resultString);
    	
    	
    	//別の構文

        //データ 杉山
    	Student KojiSugiyama = new Student();
    	KojiSugiyama.name = "杉山";
    	KojiSugiyama.score =30;
        stFormat = "%sの%sさんの点数は%d点です。";
    	resultString = String.format(stFormat, nowDate, KojiSugiyama.name, KojiSugiyama.score);
    	System.out.println(resultString);
    	
    	//コンストラクトしてみる
        //データ 杉山
    	Student CONSTInstance = new Student("杉山",35);
        stFormat = "%sの%sさんの点数は%d点です。";
    	resultString = String.format(stFormat, nowDate, CONSTInstance.name, CONSTInstance.score);
    	System.out.println(resultString);
    	
    }
}







 