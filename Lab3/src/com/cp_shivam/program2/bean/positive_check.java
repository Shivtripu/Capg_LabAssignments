package com.cp_shivam.program2.bean;

import java.util.Arrays;

public class positive_check {
	public String inputString(String str) {
		char arr[]=str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
}
