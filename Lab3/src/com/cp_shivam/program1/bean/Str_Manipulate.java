package com.cp_shivam.program1.bean;

public class Str_Manipulate {
	public void Add_string(String str)
	{
		System.out.println(str+str);
	}
	public void Remove_position(String str)
	{
		int i;
		String temp="";
		for(i=0;i<str.length();i++)
		{
			if(i%2==1)
				temp=temp+"#";
			else
				temp=temp+str.charAt(i);
		}
		 System.out.println(temp);
	}
	public void Remove_dupliacte(String str) {
		int i, j, c=0;
		String temp="";
		for(i=0;i<str.length();i++)
		{
			for(j=0;j<temp.length();j++)
			{
				if(str.charAt(i)==temp.charAt(j))
					c=1;
			}
			if(c==0)
				temp =temp+str.charAt(i);
			c=0;
			}
		System.out.println(temp);
		}
	public void Change_odd(String str) {
		int i;
		String temp="";
		for(i=0;i<str.length();i++)
			if(i%2==1)
				temp=temp+Character.toUpperCase(str.charAt(i));
	System.out.println(temp);
	}
}
