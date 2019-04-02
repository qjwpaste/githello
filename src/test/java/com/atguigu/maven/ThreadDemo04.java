package com.atguigu.maven;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemo04 implements Runnable {

	private int num = 50;
	private final Lock lock = new ReentrantLock();

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			myrun01();
		}
	}

	public void myrun01() {
		lock.lock();
		if (num > 0){
		try {
			System.out.println(Thread.currentThread().getName() + "吃了" + num + "号苹果");
			Thread.sleep(10);
			num--;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		}
	}

	public static void main(String[] args) {
		ThreadDemo04 threadDemo04 = new ThreadDemo04();
		
		new Thread(threadDemo04,"小白").start();
		new Thread(threadDemo04,"小黑").start(); 
		
	}
}
