package com.algoritmos.threads.naming;

import java.util.concurrent.TimeUnit;

import com.algoritmos.threads.common.LoopTaskC;

public class _02_NamingThreadsSecondWay {

	public static void main(String[] args) throws InterruptedException {
		

		
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("[ " + currentThreadName + " ] - Main Thread starts here..");
		
		new Thread(new LoopTaskC(), "MyThread-1").start();
		
		Thread t2 = new Thread(new LoopTaskC());
		//t2.setName("MyThread-2");
		t2.start();
		
		TimeUnit.MILLISECONDS.sleep(800);
		
		t2.setName("MyThread-2");
		
		System.out.println("[ " + currentThreadName + " ] - Main Thread ends here..");		

	}

}
