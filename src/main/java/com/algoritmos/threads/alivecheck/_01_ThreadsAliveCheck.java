package com.algoritmos.threads.alivecheck;

import java.util.concurrent.TimeUnit;

import com.algoritmos.threads.common.LoopTaskC;

public class _01_ThreadsAliveCheck {
	
	public static void main(String[] args) throws InterruptedException {
		String currentThreadName = Thread.currentThread().getName();

		System.out.println("[ " + currentThreadName + " ] - Main Thread starts here..");

		Thread t1 = new Thread(new LoopTaskC(), "MyThread-1");
		Thread t2 = new Thread(new LoopTaskC(), "MyThread-2");
		
		boolean t1IsAlive = t1.isAlive();
		boolean t2IsAlive = t2.isAlive();
		
		System.out.println("[ " + currentThreadName + " ] - Before Starting: Is '" + t1.getName() + "' alive = " + t1IsAlive);
		System.out.println("[ " + currentThreadName + " ] - Before Starting: Is '" + t2.getName() + "' alive = " + t2IsAlive);
		
		t1.start();
		t2.start();
		
		while(true) {
			TimeUnit.MILLISECONDS.sleep(600);
			
			t1IsAlive = t1.isAlive();
			t2IsAlive = t2.isAlive();
			
			System.out.println("[ " + currentThreadName + " ] - Is '" + t1.getName() + "' alive = " + t2IsAlive);
			System.out.println("[ " + currentThreadName + " ] - Is '" + t1.getName() + "' alive = " + t2IsAlive);
			
			if (!t1IsAlive && !t1IsAlive) {
				break;
			}
			
		}

		System.out.println("[ " + currentThreadName + " ] - Main Thread ends here..");
	}

}
