package com.cxr.java;

public class ThreadTest1 {
	public static void main(String[] args) {
		Window w = new Window();
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);
		
		t1.setName("售票口1");
		t2.setName("售票口2");
		t3.setName("售票口3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
