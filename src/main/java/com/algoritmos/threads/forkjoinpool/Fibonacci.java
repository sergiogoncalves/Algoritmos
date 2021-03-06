package com.algoritmos.threads.forkjoinpool;

import java.util.concurrent.RecursiveTask;

public class Fibonacci extends RecursiveTask<Long> {


	private static final long serialVersionUID = 1L;
	long n;

    public Fibonacci(long n) {
        this.n = n;
    }

    @Override
    protected Long compute() {
        if (n <= 1) {
            return n;
        }
        Fibonacci f1 = new Fibonacci(n - 1);
        f1.fork();
        Fibonacci f2 = new Fibonacci(n - 2);
        return f2.compute() + f1.join();
    }

}
