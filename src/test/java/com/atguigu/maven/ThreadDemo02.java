package com.atguigu.maven;

public class ThreadDemo02 implements Runnable {
	
	private int num=10;
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
				synchronized(this){
					if(num>0){
						System.out.println(Thread.currentThread().getName()+"吃了"+num+"号苹果");
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						num--;
				}
			}
		}

	}



}
