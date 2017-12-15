package com.chapter4;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import com.chapter4.Student;


@Controller
@EnableAutoConfiguration
public class FourthTermOneController {

    //spring
    public static void main(String... args) throws Exception {
        SpringApplication.run(FourthTermOneController.class, args);
    }


	@RequestMapping("/")
    @ResponseBody
    String home() {
		
		//まずは
		ramuda();
		
		//4-1-1
		//配列
		basicArray();
		
		//フィボナッチ数列
		FibonacciSequence();
		
		//4-1-2
		arrayInitialize();
		
		//4-1-3
		//配列の代入と取り出し　割愛
		
		//4-1-4
		//配列のサイズ変更
		arrayLengthChange();
		
		//4-1-5
		//配列のソート
		arraySort();
		arrayComparator();
		arrayComparatorStudent();
		arrayBinarySearch();
		arrayRandomValue();
		
		//4-2-6
		//可変長引数
		arrayArgument();
		
		
		
		return "FourthTermOneController";

    }
	
	







	public void ramuda() {

		ArrayList<String> list = new ArrayList<>();

		list.add("要素1");
		list.add("要素2");
		list.add("要素3");
		list.add("要素4");
		System.out.println(list);
		
		//楽ちん！
		list.forEach(e -> System.out.println(e));

		System.out.println("------");
	}
	
	
	public void basicArray() {

		int[] array = new int[10];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		array[5] = 6;
		array[6] = 7;
		array[7] = 8;
		array[8] = 9;
		//従来
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("--");
		//for拡張
		for(int v : array) {
			System.out.println(v);
		}
		System.out.println("--ラムダ");
		//ラムダ式 
		//配列はstreamに変換する必要がある
		Arrays.stream(array).forEach( e -> System.out.println(e));
		System.out.println("------");
	}
	
	
	public void FibonacciSequence() {
		
		//フィボナッチ数列
		//１番目は「0」、２番目は「1」、3番目は「２つ前」と「１つ前」を足した数字、以降その規則で計算した数値の数列
		
		int limit = 10;
		long[] array = new long[limit];
		
		for(int i=0; i<limit; i++) {
			
			if(i==0) {
				array[i]=0;
			}
			else if(i==1) {
				array[i]=1;
			}
			else {
				array[i] = array[i-1] + array[i-2];
			}
		}

		//従来
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("--");
		//for拡張
		for(long v : array) {
			System.out.println(v);
		}
		System.out.println("--ラムダ");
		//ラムダ式 
		//配列はstreamに変換する必要がある
		Arrays.stream(array).forEach( ｖ -> System.out.println(ｖ));
		System.out.println("------");
		
	}
	



	
	public void arrayInitialize() {
		
		int[] array1 = new int[10]; //サイズだけ用意
		int[] array2 = {1,2,3,4,5,6,7,8,9}; //初期値を指定
		int[] array3 = new int[] {1,2,3,4,5}; //初期値と型指定
		
		System.out.println(array1.length);
		System.out.println(array2.length);
		System.out.println(array3.length);
		System.out.println("------");
	}
	
	

	public void arrayLengthChange() {

		int[] array = new int[] {1,2,3};
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		
		int[] arrayChange = Arrays.copyOf(array,array.length+3);
		System.out.println(Arrays.toString(arrayChange));
		
		System.out.println("------");
	}
	
	
	public void arraySort() {

		int[] array = new int[] {9,36,2,1,4,98,7,3,6,8,5};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		System.out.println("------");
	}

	
	
	public void arrayComparator() {

		Integer[] array = {9,36,2,1,4,98,7,3,6,8,5};
		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				//降順
				return o2.compareTo(o1);
				//昇順
				//return o1.compareTo(o2);
			}
		};
		Arrays.sort(array,c);
		System.out.println(Arrays.toString(array));
		System.out.println("--");
		
		
		System.out.println("------");
	}
	
	public void arrayComparatorStudent() {
		
		Student[] students = {
				new Student("ken",100),
				new Student("sugi",80),
				new Student("taku",50)
		};
		//ソート
		Comparator<Student> comparator = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				//降順
				return Integer.compare(o2.getScore(), o1.getScore());
				//昇順
				//return Integer.compare(o1.getScore(), o1.getScore());
			}
		};
		
		Arrays.sort(students,comparator);
		for(Student student : students) {
			System.out.println(String.format("name = %s score = %d",student.name,student.score));
		}
		System.out.println("------");
	}

	
	

	public void arrayBinarySearch() {

		//バイナリサーチは正しくソートされていないとエラーになる
		//Integer[] array = {9,36,2,1,4,98,7,3,6,8,5};
		Integer[] array= new Integer[10];
		for(int i=0; i<array.length; i++) {
			//0-9
			array[i]=i;
		}
		//ソート
		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				//昇順
				return o1.compareTo(o2);
				//降順
				//return o2.compareTo(o1);
			}
		};
		Arrays.sort(array,c);
		System.out.println(Arrays.toString(array));
		
		int searchNum = 5;
		int found = Arrays.binarySearch(array, searchNum);
		System.out.println(String.format("お探しの数字「%s」のインデックスは、array[%d]です。", searchNum, found));
		System.out.println("------");
		
	}
	
	public void arrayRandomValue() {

		int step = 20;
		int limit = 10;
		int[] array = new int[step];
		int[] probabilityArray = new int[limit];
		
		String mode = "round";
		
		for(int i=0; i<step; i++) {
			switch(mode){
			case "ceil":
				//0.0以上-10.0未満のランダム ：　切り上げで１－１０になるが０の確率が限りなく低くなる　
				array[i]=(int) Math.ceil( (Math.random()*limit) );
				break;
			case "floor":
				//切り捨て　0-9になり１０の可能性が限りなく低くなる
				array[i]=(int) Math.floor( (Math.random()*limit) );
				break;
			case "round":
				//四捨五入　0-10になり　０と１０の可能性が他より半分
				array[i]=(int) Math.round( (Math.random()*limit) );
				break;
			default:
				array[i]=i;
				break;
			}
			System.out.println(String.format("i=%d",i));
			probabilityArray[array[i]]++;
		}
		System.out.println(Arrays.toString(array));
		System.out.println("回数");
		System.out.println(Arrays.toString(probabilityArray));
		
		System.out.println("------");
		
	}
	
	

	private void arrayArgument() {
		log("ユーザーを登録しました。","username","ken","ken","ken","ken","ken");
		log("エラーが発生しました。","Cannot load file.");
		log("処理を終了しました。");
		
	}
	public void log(String message, String... args) {
		/*
		//「String... args」部分は、可変長の配列になるため、配列をnewする必要なく引数を得渡せる
		*/
		System.out.println(message);
		System.out.println("--");
		System.out.println("パラメータ");
		System.out.println("--");
		for(String arg : args) {
			System.out.println(arg);
		}
		System.out.println("------");
	}
	
	
	
	
	
}






