package com.app;

public class ThreadTest {

	public static void main(String[] args) {
MyThread my=new MyThread();
my.start();
MyThread my2=new MyThread();
my2.start();
	}

}
