package com.app.deamon;

class MyThread extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i <5; i++) 
		{
			System.out.println("lazy thread");
			try 
			{
				Thread.sleep(4000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
public class DeamonDemo 
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().isDaemon());
		MyThread mt=new MyThread();
		mt.start();
		mt.setDaemon(true);
		System.out.println(mt.isDaemon());
		System.out.println("end of main thread");
	}
}
