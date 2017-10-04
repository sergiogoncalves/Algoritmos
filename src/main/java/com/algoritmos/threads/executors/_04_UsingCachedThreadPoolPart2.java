package com.algoritmos.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.algoritmos.threads.common.LoopTaskA;
import com.algoritmos.threads.common.LoopTaskC;
import com.algoritmos.threads.common.NamedThreadFactory;

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

public class _04_UsingCachedThreadPoolPart2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread starts here..");
		
		
		ExecutorService execService = Executors.newCachedThreadPool(new NamedThreadFactory());
		
		execService.execute(new LoopTaskC());
		execService.execute(new LoopTaskC());
		execService.execute(new LoopTaskC());
			
		TimeUnit.SECONDS.sleep(15);
		
//AQUI UTILIZA AS MESMAS 3 THREADS JÁ CRIADAS POIS JA FINALIZOU A EXECUÇÃO DAS DE CIMA..
		execService.execute(new LoopTaskC());
		execService.execute(new LoopTaskC());
		execService.execute(new LoopTaskC());
		execService.execute(new LoopTaskC());
		execService.execute(new LoopTaskC());
	
		execService.shutdown();
		
		System.out.println("Main Thread ends here..");

	}

}
