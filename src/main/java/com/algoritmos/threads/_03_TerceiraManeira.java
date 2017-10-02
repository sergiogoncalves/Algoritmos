package com.algoritmos.threads;

import java.util.concurrent.TimeUnit;

public class _03_TerceiraManeira {

	
	
	public static void main(String[] args) {
		
		System.out.println("Main Thread starts here..");
		
		new ThirdTask();
		new ThirdTask();
		
		System.out.println("Main Thread ends here..");
		

	}
}
	
	class ThirdTask implements  Runnable{
		
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
		
		public ThirdTask() {
			this.id = ++count;
			new Thread(this).start();
		}
		
	}
	


