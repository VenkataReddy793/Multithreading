package com.app.runnable;

class Runna implements Runnable
{

	@Override
	public void run() 
	{
		for(int i=0;i<3;i++)	
		{
			System.out.println("iam from Runna class method");
		}	
	}
}
public class MyRun  
{	
	public static void main(String[] args) 
	{
		for(int i=0;i<3;i++) 
		{
			System.out.println("iam from main method");
		}
		Runna r=new Runna();
		Thread t=new Thread(r);
		t.start();
			}
}
