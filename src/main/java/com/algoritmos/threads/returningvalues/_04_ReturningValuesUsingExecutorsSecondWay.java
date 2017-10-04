package com.algoritmos.threads.returningvalues;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.algoritmos.threads.common.CalculationTaskA;
import com.algoritmos.threads.common.LoopTaskA;
import com.algoritmos.threads.common.NamedThreadFactory;

public class _04_ReturningValuesUsingExecutorsSecondWay {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("[ " + currentThreadName + " ] - Main Thread starts here..");
		
		ExecutorService execService = Executors.newCachedThreadPool(new NamedThreadFactory());
		
		CompletionService<Integer> tasks = new ExecutorCompletionService<Integer>(execService);
		
		tasks.submit(new CalculationTaskA(2,3,2000));
		tasks.submit(new CalculationTaskA(3,4,1000));
		tasks.submit(new CalculationTaskA(4,5,500));
		
		tasks.submit(new LoopTaskA(), 999) ;
		
		execService.shutdown();
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Result = " + tasks.take().get());
			
		}
		System.out.println("[ " + currentThreadName + " ] - Main Thread ends here..");	

	}

}
