package com.algoritmos.threads.common;

import java.util.concurrent.TimeUnit;

public class ValueReturnTaskA implements Runnable {
	
	private int a;
	private int b;
	private long sleepTime;
	private int sum;
	
	private static int count = 0;
	private int instanceNumber;
	private String taskID;
	
	private volatile boolean done = false;
	
	public ValueReturnTaskA(int a, int b, long sleepTime) {
		this.a = a;
		this.b = b;
		this.sleepTime = sleepTime;
		
		this.instanceNumber = ++count;
		this.taskID = "ValReturnTaskA" + instanceNumber;
		
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
		
		done = true;
		
		synchronized (this) {
			System.out.println("[" + currentThreadName + "] <"+ taskID + "> NOTIFYING .....");
			this.notifyAll();
		}
	}
	
	
	public int getSum() {
		if (!done) {
			synchronized (this) {
				try {
					System.out.println("[" + Thread.currentThread().getName() + "] ==== WAITING FOR RESULT FROM " + taskID + "...====");
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println("[" + Thread.currentThread().getName() + "] ==== WOKEN-UP FOR " + taskID + "...====");
		}
		
		return sum;
	}

}
