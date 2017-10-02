package com.algoritmos.threads.executors;

/*
 * The number of threads is fixed, If the number of submitted tasks exceeds the number of threads in the fixed thread pool then the extra
 * tasks have to wait in a task to fill the time some thread finishes executing a previous task becomes available to execute another task from queue
 * 
 * Aqui usa o conceito de fila de execução
 * 
 * Este tipo newFixedThreadPool vc define a quantidade de threads e as dispara, se vc solicitar mais que o numero fixado ela vai fazer uma fila e esperar a
 * proxima thread que estiver livre.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.algoritmos.threads.common.LoopTaskA;

public class _01_UsingFixedThreadPool {

	public static void main(String[] args) {
		System.out.println("Main Thread starts here..");
		
		int numberExecutors = 2;
		
		ExecutorService execService = Executors.newFixedThreadPool(numberExecutors);
		
		for (int i = 0; i < 10; i++) { //10 chamadas porém só roda 2 de cada vez
			
			execService.execute(new LoopTaskA());
			
		}
	
		execService.shutdown();
		
		System.out.println("Main Thread ends here..");

	}

}


