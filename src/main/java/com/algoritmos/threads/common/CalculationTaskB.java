package com.algoritmos.threads.common;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class CalculationTaskB implements Callable<TaskResult<String, Integer>> {
	
	private int a;
	private int b;
	private long sleepTime;

	
	private static int count = 0;
	private int instanceNumber;
	private String taskID;
	
	public CalculationTaskB(int a, int b, long sleepTime)  { //Listener padrão observer
		this.a = a;
		this.b = b;
		this.sleepTime = sleepTime;
		
		this.instanceNumber = ++count;
		this.taskID = "CalcTaskB" + instanceNumber;
		
	}

	@Override
	public TaskResult<String, Integer> call() throws Exception {
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("##### [" + currentThreadName + " ]" + taskID + "> STARTING #####" );
		System.out.println("[" + currentThreadName + " ] <" + taskID + "> Sleeping for " + sleepTime + " millis" );
		
		TimeUnit.MICROSECONDS.sleep(sleepTime);
		
		System.out.println("******** [" + currentThreadName + "] <" + taskID + "> DONE ***********");
		
		return new TaskResult<String, Integer>(taskID, a + b);

	}
	

}
