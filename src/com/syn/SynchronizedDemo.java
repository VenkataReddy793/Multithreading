package com.syn;
class Display
{
	public  synchronized void wish(String name) 
	{
		for(int i=0;i<2;i++)
		{
			System.out.println("-------Good Morning-------");
			try 
			{
				Thread.sleep(1000);
			} 
			catch (Exception e) 
			{e.printStackTrace();
			}

		}
		System.out.println(name);
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	public MyThread(Display d, String name) 
	{
		
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run()
	{
		d.wish(name);
	}
	}
public class SynchronizedDemo 
{

	public static void main(String[] args)
	{
		Display d=new Display();
		Display d2=new Display();
		MyThread m=new MyThread(d, "venkat");
		MyThread m1=new MyThread(d2, "madan");
		m.start();
		m1.start();
	}

}
