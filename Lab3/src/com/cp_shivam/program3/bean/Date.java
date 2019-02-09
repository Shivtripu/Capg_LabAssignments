package com.cp_shivam.program3.bean;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class Date {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s1=sc.next();
		int year=sc.nextInt();
		LocalDate d=LocalDate.of(year, Month.valueOf(s1.toUpperCase()),1);
		System.out.println("Enter Expiry Date");
		int expm=sc.nextInt();
		int expy=sc.nextInt();
		LocalDate p;
		p=d.plusYears(expy);
		p=p.plusMonths(expm);
		System.out.println(p);
		sc.close();
	}
}
