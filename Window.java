package com.cxr.java;
/*
 * way1
 * synchronized(同步监视器/锁){需要被同步的代码}
 * notify();wait();都需要使用在同步监视器中
 * 
 */
class Window implements Runnable{
	private int ticket = 100;
//	private static Object ob1 = new Object();//锁
	@Override
	public void run() {
		while(true) {
//			synchronized(ob1) {
			synchronized(this) {
			notifyAll();
			if(ticket > 0) {
				
				try {
					Thread.sleep(68);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + ":" +ticket);
				ticket--;
			}else {
				break;
			}
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		
		}
			
		
	}
	
}
