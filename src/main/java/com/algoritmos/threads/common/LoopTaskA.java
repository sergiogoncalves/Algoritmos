package com.algoritmos.threads.common;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable {

	private static volatile int count = 0;
	private int id;
	
		
		@Override
		public void run() {
			
			System.out.println("##### <TASK - " + id + "> STARTING #####");
			
			for (int i = 10; i > 0; i--) {
				System.out.println("<TASK - "+ id +">" + "TICK TICK " + i);
				try {
					TimeUnit.MILLISECONDS.sleep((long)  1000); //Math.random() *
				} catch (InterruptedException e) {
					System.out.println("Erro");
				}
			}
			
			System.out.println("##### <TASK - " + id + "> DONE #####");
		}
		
	public LoopTaskA() {
		this.id = ++count;
		
	}

}
