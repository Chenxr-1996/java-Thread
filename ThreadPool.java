package com.cxr.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NumberThread implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i <= 80; i++) {
			if(i % 3 == 0){{
				System.out.println(Thread.currentThread().getName()+  ":" + i);
				}
			}
		}
	}
	
}

class NumberThread1 implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i <= 80; i++) {
			if(i % 2 == 0){{
				System.out.println(Thread.currentThread().getName()+ ":" +i);
				}
			}
		}
	}
	
}

public class ThreadPool {
	public static void main(String[] args) {
	ExecutorService service = Executors.newFixedThreadPool(10);
	service.execute(new NumberThread());
	service.execute(new NumberThread1());
//	service.submit();
	service.shutdown();
}
}
