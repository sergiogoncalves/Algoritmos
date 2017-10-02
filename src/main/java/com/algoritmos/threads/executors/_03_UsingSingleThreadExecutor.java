package com.algoritmos.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.algoritmos.threads.common.LoopTaskA;

/*
 * A single threaded executor with the pool size of one essentially serialize is the task execution at one time only one task is executed no matter how many
 * tasks there are in the queue
 * 
 * Executes one by one in sequence, neste modo não é necessário sincronizar as threads pois só uma faz de uma vez
 * 
 */

public class _03_UsingSingleThreadExecutor {

	public static void main(String[] args) {
		System.out.println("Main Thread starts here..");
		
		int numberExecutors = 3;
		
		ExecutorService execService = Executors.newSingleThreadExecutor();
		
		for (int i = 0; i < numberExecutors; i++) {
			
			execService.execute(new LoopTaskA());
			
		}
	
		execService.shutdown();
		
		System.out.println("Main Thread ends here..");

	}

}
