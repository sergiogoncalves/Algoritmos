package com.algoritmos.threads.daemon;

import com.algoritmos.threads.common.LoopTaskD;

//Daemon são threads que não param de executar até que a aplicação pare.

public class _01_DaemonThreads {
	
	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("[ " + currentThreadName + " ] - Main Thread starts here..");
		
		Thread t1 = new Thread(new LoopTaskD(500), "Thread-1");
		t1.setDaemon(true);
		
		Thread t2 = new Thread(new LoopTaskD(1000), "Thread-2");
		t2.setDaemon(false);
		
		t1.start();
		t2.start();
		
		System.out.println("[ " + currentThreadName + " ] - Main Thread ends here..");
	}

}
