package com.atguigu.maven;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class SetDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		LinkedHashSet<Object> set = new LinkedHashSet<>();
		set.add("x");
		set.add("2");
		set.add("5");
		set.add("1");
		set.add("0");
		System.out.println(set);*/
		
		String []arr={"1","2","3","4","5"};
		List<String> list = Arrays.asList(arr);
		//list.remove("1");
		//list.add("6");不能增加或删除
		System.out.println(list);
		list.set(0, "10");
		System.out.println(list);//但是可以修改
	}

}
