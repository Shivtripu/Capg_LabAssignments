package com.cp_shivam.program3.bean;

public class Ques2d {
	private String fname;
	private String lname;
	private String gen;
	private int age;
	private float weight;
	private long pno;
	
	public Ques2d() {
	
		// TODO Auto-generated constructor stub
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public long getPno() {
		return pno;
	}

	public void setPno(long pno) {
		this.pno = pno;
	}
	
public static void main(String[] args) {
	Ques2d obj= new Ques2d();
	obj.setFname(args[0]);
	obj.setLname(args[1]);
	String s1= args[2];
	s1= s1.toUpperCase();
	char arr[]= s1.toCharArray();
	obj.setGen(Character.toString(arr[0]));
	
	obj.setAge(Integer.parseInt(args[3]));
	obj.setWeight(Float.parseFloat(args[4]));
	obj.setPno(Long.parseLong(args[5]));
	
	System.out.println("First Name:"+ obj.getFname());
	System.out.println("Last Name:"+ obj.getLname());
	System.out.println("Gender:"+ obj.getGen());
	System.out.println("Age:"+ obj.getAge());
	System.out.println("Weight:"+ obj.getWeight());
	System.out.println("Phone no :"+ obj.getPno());


}


}