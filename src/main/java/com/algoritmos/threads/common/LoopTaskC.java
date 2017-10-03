package com.algoritmos.threads.common;

import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


public class LoopTaskC implements Runnable {

	private static volatile int count = 0;
	private int instanceNumber;
	private String TaskIDId;
	
	private final static Logger LOGGER = Logger.getLogger(StringTokenizer.class.getName());
		
		@Override
		public void run() {
			
			String currentThreadName = Thread.currentThread().getName();
			
			LOGGER.info("##### [ " + Thread.currentThread().getName() + " ] <TaskID - " + instanceNumber + "> STARTING #####");
			
			for (int i = 10; i > 0; i--) {
				
				LOGGER.info("[ " + Thread.currentThread().getName() + " ]<TaskID - "+ instanceNumber +">" + "TICK TICK " + i);
				
				try {
					TimeUnit.MILLISECONDS.sleep((long)  1000); //Math.random() *
				} catch (InterruptedException e) {
				}
			}
			
			LOGGER.info("##### [ " + Thread.currentThread().getName() + " ] <TaskID - " + instanceNumber + "> DONE #####");
		}
		
	public LoopTaskC() {
		this.instanceNumber = ++count;
		this.TaskIDId = "LoopTaskC " + instanceNumber;
	}

}
