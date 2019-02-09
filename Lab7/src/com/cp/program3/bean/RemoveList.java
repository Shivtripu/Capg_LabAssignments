package com.cp.program3.bean;

import java.util.List;

public class RemoveList {

	List<String> list1;
	List<String> list2;
	RemoveList(List<String> list1, List<String> list2)
	{
		this.list1=list1;
		this.list2=list2;
	}
	public void methodRemoveList() {
		System.out.println(list1);
		System.out.println(list2);
		list1.removeAll(list2);
		System.out.println(list1);
		list1.removeAll(list1);
		System.out.println(list1);
	}
}
