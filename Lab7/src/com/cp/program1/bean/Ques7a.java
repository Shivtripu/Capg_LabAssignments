package com.cp.program1.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques7a {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		scanner = new Scanner(System.in);
			System.out.println("---------------------------");
			System.out.println("no. of elements you want to insert");
		int n= scanner.nextInt();
		Integer p;
			System.out.println("---------------------------");
			System.out.println("enter numbers");
		for(int i=0;i<n;i++)
			{
				p=scanner.nextInt();
				list.add(p);
			}
		System.out.println("---------------------------");
		int arr2[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr2[i]=list.get(i);
		}
		
		
		Sorted obj2 = new Sorted();
		
		int arr[]=obj2.getSorted(arr2);
		for(int i=0;i<arr.length;i++)
		{
			list.set(i, arr[i]);
		}
		
		for(Integer i : list)
		{
			System.out.println(i);
		}
	}

}
