package com.algoritmos.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.algoritmos.threads.common.LoopTaskA;

/*
 * Create as many thread as required for executing the submitted task. If a task is submitted to it and a thread is available the that thread is used to run the task.
 * If the threads are busy to execute another task so another thread is created.
 * 
 * There no wait queue concept here, every thread called is immediately executed. When a thread has finished executing it tasks it becomes available and is reused for the next task
 * that is submitted to this executer
 * 
 * There is no limit on the number of threads that can be created by the pool, as many number of threads are created as required in order to run all the submitted tasks
 * 
 * Aqui não tem o conceito de fila de execução, cada thread é iniciada na ordem de chamada, sem uma sequencia.
 */

public class _02_UsingCachedThreadPool {

	public static void main(String[] args) {
		System.out.println("Main Thread starts here..");
		
		int numberExecutors = 5;
		
		ExecutorService execService = Executors.newCachedThreadPool();
		
		for (int i = 0; i < numberExecutors; i++) {
			
			execService.execute(new LoopTaskA());
			
		}
	
		execService.shutdown();
		
		System.out.println("Main Thread ends here..");

	}

}
