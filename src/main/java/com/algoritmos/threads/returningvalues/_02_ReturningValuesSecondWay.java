package com.algoritmos.threads.returningvalues;

import com.algoritmos.threads.common.SumObserver;
import com.algoritmos.threads.common.ValueReturnTaskB;

public class _02_ReturningValuesSecondWay {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("[ " + currentThreadName + " ] - Main Thread starts here..");
		
		ValueReturnTaskB task1 = new ValueReturnTaskB(2, 3, 100, new SumObserver("task-1"));
		Thread t1 = new Thread(task1, "Thread-1");
		
		ValueReturnTaskB task2 = new ValueReturnTaskB(3, 4, 1000, new SumObserver("task-2"));
		Thread t2 = new Thread(task2, "Thread-2");
		
		ValueReturnTaskB task3 = new ValueReturnTaskB(4, 5, 500, new SumObserver("task-3"));
		Thread t3 = new Thread(task3, "Thread-3");
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
		System.out.println("[ " + currentThreadName + " ] - Main Thread ends here..");	

	}

}
