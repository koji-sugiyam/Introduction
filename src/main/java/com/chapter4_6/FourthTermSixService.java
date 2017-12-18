package com.chapter4_6;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class FourthTermSixService  implements FourthTermSixInterface {

	//コンストラクタ
	public FourthTermSixService() {
		
	}
	
	public void queueUse() {
		
		//Queueは文字通り「Queue」されるので、入れた順番にデータを出すことができる。
		/*
		 * offer() : データを追加
		 * poll（） : データ取り出し（出したら削除）
		 * peek() : データ取り出し（出しても値を保持）
		 */
		
		Queue<Integer> queue = new ArrayBlockingQueue<>(10);
		
		//キューに追加
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		
		System.out.println(queue.poll()); //1
		System.out.println(queue.poll()); //2
		System.out.println(queue.poll()); //3
		System.out.println(queue.poll()); //4
		System.out.println("--");
		
		queue.offer(5);
		queue.offer(6);
		queue.offer(7);

		System.out.println(queue.poll()); //5
		System.out.println(queue.poll()); //6
		System.out.println("--");
		

		queue.offer(8);
		queue.offer(9);
		System.out.println(queue.poll()); //7
		System.out.println(queue.peek()); //8 //出しても値は保持する
		System.out.println(queue.peek()); //8 //出しても値は保持する
		System.out.println(queue.peek()); //8 //出しても値は保持する
		System.out.println(queue.poll()); //8
		System.out.println(queue.poll()); //9
		System.out.println("--");
		
	}

	public void decueueUse() {

		//Queueは文字通り「Queue」されるので、入れた順番にデータを出すことができる。
		/*
		 * offerFirst() / offerLast() : データを追加
		 * pollFirst（） / pollLast(): データ取り出し（出したら削除）
		 * peekFirst() / peekLast() : データ取り出し（出しても値を保持）
		 */

		Deque<Integer> deque = new LinkedBlockingDeque<>(10);

		//キューに追加
		deque.offer(1); //
		deque.offerFirst(2); //1,2
		deque.offerLast(3); //3,1,2

		System.out.println(deque.poll()); //2
		System.out.println(deque.poll()); //1
		System.out.println(deque.poll()); //3
		System.out.println("--");

		deque.offer(4); //4
		deque.offerLast(5); //5,4
		deque.offerFirst(6); //5,4,6
		deque.offer(7); //7,5,4,6

		System.out.println(deque.peek()); //6
		System.out.println(deque.poll()); //6
		System.out.println(deque.pollLast()); //7
		System.out.println(deque.peekFirst()); //4
		System.out.println(deque.peekLast()); //5
		System.out.println(deque.poll()); //4
		System.out.println(deque.poll()); //5
		System.out.println(deque.poll()); //null
	
		System.out.println("--");
		
		
	}
	
	
	
	
}