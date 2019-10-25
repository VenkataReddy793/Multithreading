package com.appp;
class A
{
	public synchronized void foo(B b)
	{
		System.out.println("Thread1 stsrt execution from foo() method");
		try
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		} 
		System.out.println("calling A class last method");
b.lastt();
	}
	
	public synchronized void last() 
	{
		System.out.println("inside A this is last method");
	}
}
class B
{
	public synchronized void bar(A a) 
	{
		System.out.println("Thread2 execution start from bar method");
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		a.last();
	}
	public synchronized void lastt() 
	{
		System.out.println("this is last method in B class");
	}
}
public class DeadLockConcept implements Runnable
{
	A a=new A();
	B b=new B();
	public DeadLockConcept() 
	{
		Thread t=new Thread();
		t.start();
		a.foo(b);
	}
public static void main(String[] args)
{
	new DeadLockConcept();
	}
@Override
public void run()
{
	b.bar(a);
}
}
