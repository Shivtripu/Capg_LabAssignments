package com.cp_shivam.program1.bean;

import java.util.Scanner;

public class str_operationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		String str="ababSHivam";
		System.out.println("Enter your choice:");
		System.out.println("1.Add the String to itself\n "
				+ "2.Replace odd positions with #\n "
				+ "3.Remove duplicate characters in the String\n "
				+ "4.Change odd characters to upper case ");
		Str_Manipulate obj= new Str_Manipulate();
		Scanner sc= new Scanner(System.in);
		ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			obj.Add_string(str);
			break;
		case 2:
			obj.Remove_position(str);
			break;
		case 3:
			obj.Remove_dupliacte(str);
			break;
		case 4:
			obj.Change_odd(str);
			break;
		default:
			System.out.println("Wrong input");
		} 
	}

}
