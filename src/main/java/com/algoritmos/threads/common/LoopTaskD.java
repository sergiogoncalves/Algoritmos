package com.algoritmos.threads.common;

import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


public class LoopTaskD implements Runnable {

	private static volatile int count = 0;
	private int instanceNumber;
	private String TaskIDId;
	
	private long sleepTime;
	
		
		@Override
		public void run() {
			
			boolean isRunningInDaemonThread = Thread.currentThread().isDaemon();
			
			String threadType = isRunningInDaemonThread ? "DAEMON" : "USER";
			
			String currentThreadName = Thread.currentThread().getName();
			
		
			System.out.println("##### [ " + currentThreadName + ", " + threadType +" ] <TaskID - " + instanceNumber + "> STARTING #####");
			
			for (int i = 10; i > 0; i--) {
				
				System.out.println("[ " + currentThreadName + ", " + threadType + " ]<TaskID - "+ instanceNumber +">" + "TICK TICK " + i);
				
				try {
					TimeUnit.MILLISECONDS.sleep(sleepTime); //Math.random() *
				} catch (InterruptedException e) {
				}
			}
			
			System.out.println("##### [ " + currentThreadName + ", " + threadType + " ] <TaskID - " + instanceNumber + "> DONE #####");
		}
		
	public LoopTaskD(long sleepTime) {
		this.sleepTime = sleepTime;
		this.instanceNumber = ++count;
		this.TaskIDId = "LoopTaskD " + instanceNumber;
	}

}
