package com.algoritmos.threads.common;

import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


public class LoopTaskB implements Runnable {

	private static volatile int count = 0;
	private int instanceNumber;
	private String TaskIDId;
	
	private final static Logger LOGGER = Logger.getLogger(StringTokenizer.class.getName());
		
		@Override
		public void run() {
			Thread.currentThread().setName("Amazing-Thread-" + instanceNumber );

			String currentThreadName = Thread.currentThread().getName();
			
			LOGGER.info("##### [ " + currentThreadName + " ] <TaskID - " + instanceNumber + "> STARTING #####");
			
			for (int i = 10; i > 0; i--) {
				
				LOGGER.info("[ " + currentThreadName + " ]<TaskID - "+ instanceNumber +">" + "TICK TICK " + i);
				
				try {
					TimeUnit.MILLISECONDS.sleep((long)  1000); //Math.random() *
				} catch (InterruptedException e) {
				}
			}
			
			LOGGER.info("##### [ " + currentThreadName + " ] <TaskID - " + instanceNumber + "> DONE #####");
		}
		
	public LoopTaskB() {
		this.instanceNumber = ++count;
		this.TaskIDId = "LoopTaskB " + instanceNumber;
	}

}
