package com.algoritmos.threads.returningvalues;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.algoritmos.threads.common.CalculationTaskA;
import com.algoritmos.threads.common.CalculationTaskB;
import com.algoritmos.threads.common.LoopTaskA;
import com.algoritmos.threads.common.NamedThreadFactory;
import com.algoritmos.threads.common.TaskResult;

public class _03_ReturningValuesUsingExecutorsFirstWay {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("[ " + currentThreadName + " ] - Main Thread starts here..");
		
		ExecutorService execService = Executors.newCachedThreadPool(new NamedThreadFactory());
		
		CompletionService<TaskResult<String, Integer>> tasks = new ExecutorCompletionService<TaskResult<String, Integer>>(execService);
		
		tasks.submit(new CalculationTaskB(2,3,2000));
		tasks.submit(new CalculationTaskB(3,4,1000));
		tasks.submit(new CalculationTaskB(4,5,500));
		
		tasks.submit(new LoopTaskA(), new TaskResult<String, Integer>("LoopTaskA-1", 999)) ;
		
		execService.shutdown();
		
		for (int i = 0; i < 4; i++) {
			System.out.println(tasks.take().get());
			
		}
		System.out.println("[ " + currentThreadName + " ] - Main Thread ends here..");	

	}

}
