package com.cp.program1.bean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorted 
{
	int[] getSorted(int a[])
	{
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i< a.length;i++)
		{
			String s= Integer.toString(a[i]);
			StringBuffer sb= new StringBuffer(s);
			sb=sb.reverse();
			s = new String(sb);
			list.add(Integer.parseInt(s));
	
		}
		Collections.sort(list);
		for(int i=0;i<a.length;i++)
		{
			a[i]=list.get(i);
		
		}
		return (a);
	}

}
