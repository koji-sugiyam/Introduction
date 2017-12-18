package com.chapter4_3_review;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.chapter4_3.BaseController;
import com.chapter4_3_review.FourthTermThreeReviewService;

@Controller
@EnableAutoConfiguration
public class FourthTermThreeReviewController extends BaseController {

    //spring
    public static void main(String... args) throws Exception {
        SpringApplication.run(FourthTermThreeReviewController.class, args);
    }


	@RequestMapping("/")
    @ResponseBody
    String home() {

		FourthTermThreeReviewService service = new FourthTermThreeReviewService();
		
		//復習

		//----お題-----
		//ArrayListの復習
		//配列に銀行名一覧を作成
		//自分が好きな銀行名だけを抽出して表示
		//それ以外の銀行は削除対象としてリスト作成
		//ループして削除該当銀行を削除する。ただし、イオン銀行は残してあげようじゃないか。
		//最終結果はブラウザに表示
		
		return service.reviewRun();
		
		
		
    }


	


	
}






