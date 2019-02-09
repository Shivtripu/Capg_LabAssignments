 package com.cp_shivam.program4.bean;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class Current_Date {
		public static void main(String[] args) 
		{
			Scanner sc= new Scanner(System.in);
			int day= sc.nextInt();
			String month=sc.next();
			int year = sc.nextInt();
			LocalDate d=LocalDate.of(year, Month.valueOf(month.toUpperCase()), day);
			Period p;
			p = d.until(LocalDate.now());
			System.out.println(Math.abs(p.getDays()));
			System.out.println(Math.abs(p.getMonths()));
			System.out.println(Math.abs(p.getYears()));
		}
}