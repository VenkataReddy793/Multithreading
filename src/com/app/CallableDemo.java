package com.app;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo implements Callable<String> 
{

	public static final int Thread_Poll_Size=3;

	@Override
	public String call() throws Exception 
	{

		new Thread();
		return Thread.currentThread().getName();
	}
public static void main(String[] args) throws InterruptedException, ExecutionException 
{
//creating pool of two threads
	ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Thread_Poll_Size);
	Future<String> submit = newFixedThreadPool.submit(new CallableDemo());
	Future<String> submit2 = newFixedThreadPool.submit(new CallableDemo());
	System.out.println(Thread.currentThread().getName());
	System.out.println(submit.get());
	System.out.println(submit2.get());
}
}





