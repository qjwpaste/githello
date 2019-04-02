package com.atguigu.maven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person p1 = new Person(1, "Tom");
/*		StringBuilder s1 = new StringBuilder("abc");
		Vector<Object> vector = new Vector<>();*/
		//vector.add(p1);
/*		vector.add(s1);
		System.out.println(vector);
		s1.append("123");
		System.out.println(vector);
		Object[] array = vector.toArray();
		
		List<Object> asList = Arrays.asList(array);*/
		
		List<Object> synchronizedList = Collections.synchronizedList(new ArrayList<Object>());
		synchronizedList.add("1");
		synchronizedList.add("2");
		synchronizedList.add("3");
		synchronizedList.add("1");
		synchronizedList.add("2");
		synchronizedList.add("4");
/*		for (int i = 0; i < synchronizedList.size(); i++) {
			
			System.out.println(synchronizedList.get(i));
		}*/
		Iterator<Object> iterator = synchronizedList.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		ArrayList<Object> arrayList = new ArrayList<Object>(new LinkedHashSet<>(synchronizedList));
		System.out.println(arrayList.toString());
	}

}
