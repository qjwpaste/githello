package com.atguigu.maven;	
import org.junit.Test;
import static junit.framework.Assert.*;
public class HelloTest {
	@Test
	public void testHello(){
		Hello hello = new Hello();
		String results = hello.sayHello("litingwei");
		assertEquals("Hello litingwei!",results);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread thread = new Thread(new ThreadDemo02());
//		thread.start();
/*		new Thread(){

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("d:"+i);
				}
			}
			
		}.start();*/
//		ThreadDemo02 demo02 = new ThreadDemo02();
//		new Thread(demo02, "小敏").start();
//		new Thread(demo02, "小红").start();
/*		ThreadDemo03 threadDemo03 = new ThreadDemo03();
		new Thread(threadDemo03,"小白").start();
		new Thread(threadDemo03,"小黑").start(); */
		ThreadDemo04 threadDemo04 = new ThreadDemo04();
		new Thread(threadDemo04,"小白").start();
		new Thread(threadDemo04,"小黑").start(); 
	}
}