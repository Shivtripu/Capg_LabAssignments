package com.cp_shivam.program2.bean;

public class positive_main {

	public static void main(String[] args) {
		positive_check obj= new positive_check();
		String str="abcd";
		String temp=obj.inputString(str);
		if(temp.equals(str))
		{
			System.out.println("Positive");
		}
		else 
			System.out.println("Negative");
	}

}
