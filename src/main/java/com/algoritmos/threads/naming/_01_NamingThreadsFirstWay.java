package com.algoritmos.threads.naming;

import com.algoritmos.threads.common.LoopTaskB;

public class _01_NamingThreadsFirstWay {

	public static void main(String[] args) {
		

		
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("[ " + currentThreadName + " ] - Main Thread starts here..");
		
		new Thread(new LoopTaskB()).start();
		
		Thread t2 = new Thread(new LoopTaskB());
		t2.start();
		
		
		System.out.println("[ " + currentThreadName + " ] - Main Thread ends here..");		

	}

}
