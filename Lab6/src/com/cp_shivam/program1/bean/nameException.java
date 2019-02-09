package com.cp_shivam.program1.bean;

public class nameException extends Exception {

	String fname;
	String lname;
	public nameException(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "nameException [fname=" + fname + ", lname=" + lname + "]";
	}
}
