package com.atguigu.maven;

import java.util.Arrays;

public class TestDemo01 extends Thread{
	
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.err.println("a:"+i);
		}
		
	}

	public static void main(String[] args) throws Exception {
/*		String string = new String("\u5931\u8d25null".getBytes(),"utf-8");
		System.out.println(string);*/
//		Runtime runtime = Runtime.getRuntime();
//		runtime.exec("notepad");
//		ProcessBuilder processBuilder = new ProcessBuilder("notepad");
//		processBuilder.start();
//		for (int i = 0; i < 10; i++) {
//			System.out.println("b:"+i);
//			if(i==5){
//				new TestDemo01().start();
//			}
//		}
		int temp;
		int[] arr=new int[]{4,1,5,2,6,9,3,8,7,10};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	
}
