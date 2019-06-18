package com.demo.csv.file;

public class Student {
	private String fName;
	private int age;
	private String lName;
	
    public Student(String fn,int age,String ln)
    {
    	this.fName=fn;
    	this.age=age;
    	this.lName=ln;
    }
	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}
	

}
