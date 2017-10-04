package com.algoritmos.threads.naming;

/*
 * Por padrão os nomes das threads no pools serão "pool-N-thread-M"
 * os pools as threads são numeradas a partir do 1
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.algoritmos.threads.common.LoopTaskC;
import com.algoritmos.threads.common.NamedThreadFactory;

public class _03_NamingExecutorsThreads {

	public static void main(String[] args) {
		
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("[ " + currentThreadName + " ] - Main Thread starts here..");
		
		ExecutorService executorService = Executors.newCachedThreadPool(new NamedThreadFactory());
		
		executorService.execute(new LoopTaskC());
		executorService.execute(new LoopTaskC());
		executorService.execute(new LoopTaskC());

		executorService.shutdown();
		
		System.out.println("[ " + currentThreadName + " ] - Main Thread ends here..");	
	}

}
