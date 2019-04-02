package com.atguigu.maven;

public class ThreadDemo03 implements Runnable {
	
	private int num=50;
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			myrun01();
		}
	}

	synchronized public void myrun01(){
		
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
	
	public static void main(String[] args) {

	}
}
