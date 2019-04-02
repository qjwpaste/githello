package com.atguigu.maven;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo02 {
	public static void main(String[] args) {
//		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
//		set.add(null);
//		set.add("1");
//		set.add(null);
//		System.out.println(set);//[null, 1]
//		ArrayList<Object> arrayList = new ArrayList<>();
//		arrayList.add("1");
//		arrayList.add(null);
//		arrayList.add("1");
//		arrayList.add(null);
//		System.out.println(arrayList);//[1, null, 1, null]
		
/*		HashMap<Object,Object> map = new HashMap<>();
		map.put("1", 11);
		map.put("2", 22);
		map.put("3", 33);
		Set<Object> keySet = map.keySet();
		Collection<Object> values = map.values();*/
		
//		String s1=new String("test");//创建2个对象，一个Class和一个堆里面 
//		String s2="test";//创建1个对象，s2指向pool里面的"test"对象 
//		System.out.println(s1==s2);//false,指向的对象不一样,下面再说 
		main(args);// java.lang.StackOverflowError StackOverflowError（栈溢出）
	}
}
