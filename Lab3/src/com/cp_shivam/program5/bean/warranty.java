package com.cp_shivam.program5.bean;

import java.time.LocalDate;
import java.util.Scanner;

public class warranty {
	void m1() {
		LocalDate now = LocalDate.now();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of month");
		int month = sc.nextInt();
		System.out.println("enter number of years");
		int years= sc.nextInt();
		now=now.plusMonths(month).plusYears(years);
		//now=now.plusYears(years);
		System.out.println(now);
		
	}

}
