package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
public class IntroductionApplication {

    
    //springで実行する場合
    public static void main(String[] args) throws Exception {
        SpringApplication.run(IntroductionApplication.class, args);
    }


	@RequestMapping("/")
    @ResponseBody
    String home() {
		
		//2-1
		System.out.println("Hello World");
		
		//2-1-3
    	int numA = 100;
    	System.out.println(numA);
    	
    	//2-1-4
    	int numB = 200;
    	boolean resultA =  numA > numB;
    	System.out.println("resultA = " + resultA);
    	
    	//2-1-5
    	String resultC = "";
    	if(numA > numB) {
    		resultC = "大きいよ";
    		}
    	else{
    		resultC = "小さいよ";
    	}
    	System.out.println("resultC = " + resultC);
    	
    	int i = 0;
    	i++;
    	System.out.println(i);
    	i += 100;
    	System.out.println(i);
    	i++;
    	System.out.println(i);
    	i -= 50;
    	System.out.println(i);
    	
    	
    	String strA = "Hello"+ " ";
    	String strB = " " + "World"+ " ";
    	String message = "JAVA"+ " ";
    	int messageNum = 2;
    	System.out.println(strA + message + messageNum + strB);
    	
    	//date
    	Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("date formtted = " + formatter.format(date));
        
        //time
        System.out.println("time = " + date.getTime());
        
        
        //for
        String str;
        for(i=0;i<3;i++) {
        	
        	switch(i) {
        		case 0:
        			str = "i = " + i + " ダヨン！";
        			System.out.println(str);//出力が面倒あのでユーザー関数にしてる
        		break;
        		case 1:
        			str = "i = " + i + " ダヨン！";
        			System.out.println(str);//出力が面倒あのでユーザー関数にしてる
        		break;
        		case 2:
        			str = "i = " + i + " ダヨン！";
        			System.out.println(str);//出力が面倒あのでユーザー関数にしてる
        		break;
        		default:
        			System.out.println("defaultです");
        			break;
        	}
        }
        
        //collection
        int[] nums = {1,2,3,4,5,6,7,8,9};
        for(int v : nums) {
        	System.out.println(v);
        }
        
        
        //while / do-whileは割愛
        
        
        
		
        return "";
    }
	
}