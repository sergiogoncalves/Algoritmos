package com.algoritmos.threads;

import java.util.concurrent.TimeUnit;

public class _05_QuintaManeira {
	
	public static void main(String[] args) {
		
		System.out.println("Main Thread starts here..");

		Thread t = new Thread(new Runnable() {
			
			private int id;
			
			
			@Override
			public void run() {
				
				for (int i = 10; i > 0; i--) {
					System.out.println("Tick Tick " + i);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						
					}
				}
				
			}
		});
		
		t.start();
		
		System.out.println("Main Thread ends here..");
		

	}

}
