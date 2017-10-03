package com.algoritmos.threads.returningvalues;

import com.algoritmos.threads.common.ValueReturnTaskA;

public class _01_ReturningValuesFirstWay {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("[ " + currentThreadName + " ] - Main Thread starts here..");
		
		ValueReturnTaskA task1 = new ValueReturnTaskA(2, 3, 100);
		Thread t1 = new Thread(task1, "Thread-1");
		
		ValueReturnTaskA task2 = new ValueReturnTaskA(3, 4, 1000);
		Thread t2 = new Thread(task2, "Thread-2");
		
		ValueReturnTaskA task3 = new ValueReturnTaskA(4, 5, 500);
		Thread t3 = new Thread(task3, "Thread-3");
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
		System.out.println("[ " + currentThreadName + " ] - Main Thread ends here..");	

	}

}
