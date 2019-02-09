package com.cp_shivam.program1.bean;

import java.util.Scanner;

public class Ques6a {
	private String fname;
	private String lname;
	
	public Ques6a(String fname, String lname) {
		this.fname= fname;
		this.lname= lname;
	}
	
	public void method()throws nameException
	{
		if(fname.equals("")&& lname.equals(""))
	{
		throw new nameException("name is not correct","lname is not correct");
	}
	else
		System.out.println("full name is correct");
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter name");
		String str= sc.nextLine();
		String str2 = sc.nextLine();
		Ques6a obj= new Ques6a(str,str2);
		
		
		try{
		obj.method();
		}
		catch ( nameException e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
	}

	}
