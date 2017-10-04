package com.algoritmos.threads.daemon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.algoritmos.threads.common.DaemonThreadFactory;
import com.algoritmos.threads.common.LoopTaskD;

//Daemon são threads que não param de executar até que a aplicação pare.

public class _02_DaemonWithExecutors {
	
	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("[ " + currentThreadName + " ] - Main Thread starts here..");
		
		ExecutorService executorService = Executors.newCachedThreadPool(new DaemonThreadFactory());
		
		executorService.execute(new LoopTaskD(100));
		executorService.execute(new LoopTaskD(200));
		executorService.execute(new LoopTaskD(300));
		executorService.execute(new LoopTaskD(400));
		
		executorService.shutdown();
		
		System.out.println("[ " + currentThreadName + " ] - Main Thread ends here..");
	}

}
