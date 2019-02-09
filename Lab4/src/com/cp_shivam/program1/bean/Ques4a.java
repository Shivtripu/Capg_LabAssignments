package com.cp_shivam.program1.bean;

import java.util.Random;

public class Ques4a {

	public static void main(String[] args) {
		
		Random rand = new Random(); 
		Person p1,p2;
		p1=new Person("smith",18.0f);
		p2=new Person("kathy",20.0f);
		int x = rand.nextInt(10000)+1;
		int y = rand.nextInt(10000)+1;
	
	Account a1= new Account((long)x,(double)2000,p1);
	Account a2= new Account((long)y,(double)3000,p2);
		System.out.println(a1);
		System.out.println(a2);
		a1.deposit((double)2000);
		a2.withdraw((double)2000);
		System.out.println(a1);
		System.out.println(a2);

	}

}
