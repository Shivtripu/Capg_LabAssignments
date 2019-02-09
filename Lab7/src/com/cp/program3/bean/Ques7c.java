package com.cp.program3.bean;

import java.util.ArrayList;
import java.util.List;

public class Ques7c {

	public static void main(String[] args)
	{
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		list1.add("one");
		list1.add("two");
		list1.add("three");
		list1.add("four");
		list1.add("five");
		list1.add("six");
		list2.add("six");
		list2.add("seven");
		list2.add("two");
		RemoveList obj = new RemoveList(list1,list2);
		obj.methodRemoveList();
	}

}
