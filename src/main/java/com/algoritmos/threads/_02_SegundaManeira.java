package com.algoritmos.threads;

import java.util.concurrent.TimeUnit;

public class _02_SegundaManeira {

	
	
	public static void main(String[] args) {
		
		System.out.println("Main Thread starts here..");
		new SecondTask().start();
		
		Thread t = new SecondTask();
		t.start();
	
		System.out.println("Main Thread ends here..");
		

	}
}
	
	class SecondTask extends Thread{
		
		private static volatile int count = 0;
		private int id;
		
		@Override
		public void run() {
			for (int i = 10; i > 0; i--) {
				System.out.println("<"+ id +">" + "Tick Tick " + i);
				try {
					TimeUnit.MILLISECONDS.sleep(200);
				} catch (InterruptedException e) {
					
				}
			}
		}
		
		public SecondTask() {
			this.id = ++count;
		
		}
		
	}
	


