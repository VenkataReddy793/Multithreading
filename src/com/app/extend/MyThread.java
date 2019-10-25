package com.app.extend;
class MyOwnThread extends Thread
{
	
	  @Override public void run()
	  { for(int i=0;i<2;i++) {
	  System.out.println("child thread()"); } }
	  @Override
	public synchronized void start() {
		System.out.println("from start()");
	}
	 
	  public void run(int i) 
	  {
		  System.out.println("it is integer argument method1");
	  }
	}
public class MyThread
{

	public static void main(String[] args) 
	{
		for(int i=0;i<3;i++) {
			System.out.println("iam from main thread()");
		}
		MyOwnThread mt=new MyOwnThread();
		mt.start();
		mt.run(5);
		System.out.println("when ever thread will be created then thread will be new or born"
				+ "state and we can call start() method then it is ready() or Runnable state"
				+ "if the ThreadSchedular allocate cpu then thread is running state ()"
				+ "once run() method complete then it is entered into dead state"
				
				);
		
		
		
		
	}

}
