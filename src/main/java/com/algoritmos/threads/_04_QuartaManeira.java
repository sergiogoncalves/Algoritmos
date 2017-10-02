package com.algoritmos.threads;

import java.util.concurrent.TimeUnit;

public class _04_QuartaManeira {

	
	
	public static void main(String[] args) {
		
		System.out.println("Main Thread starts here..");
		
		new Thread (new FourthTask()).start();
		 
		Thread t = new Thread(new FourthTask());
		t.start();
		
		System.out.println("Main Thread ends here..");
		

	}
}
	
	class FourthTask implements  Runnable{
		
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
		
		public FourthTask() {
			this.id = ++count;
			
		}
		
	}
	


