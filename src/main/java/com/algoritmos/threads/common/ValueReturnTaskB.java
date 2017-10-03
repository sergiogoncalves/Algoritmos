package com.algoritmos.threads.common;

import java.util.concurrent.TimeUnit;

public class ValueReturnTaskB implements Runnable {
	
	private int a;
	private int b;
	private long sleepTime;
	private int sum;
	
	private static int count = 0;
	private int instanceNumber;
	private String taskID;
	ResultListener<Integer> listener;
	
	public ValueReturnTaskB(int a, int b, long sleepTime, ResultListener<Integer> listener)  { //Listener padrão observer
		this.a = a;
		this.b = b;
		this.sleepTime = sleepTime;
		this.listener = listener;
		
		this.instanceNumber = ++count;
		this.taskID = "ValReturnTaskB" + instanceNumber;
		
	}

	@Override
	public void run() {
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("##### [" + currentThreadName + " ]" + taskID + "> STARTING #####" );
		System.out.println("[" + currentThreadName + " ] <" + taskID + "> Sleeping for " + sleepTime + " millis" );
		
		try {
			TimeUnit.MICROSECONDS.sleep(sleepTime);
			
		} catch (Exception e) {
			
		}
		
		sum = a + b;
		
		System.out.println("******** [" + currentThreadName + "] <" + taskID + "> DONE ***********");
		
		listener.notifyResult(sum);
	}
	

}
