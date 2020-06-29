package com.kgc.lx;

public class Teacher {

	String name;
	String direction;
	String tcourse;
	int tage;
	
	public static void main(String[] args) {
		
		Teacher t=new Teacher();
		t.name="王老师";
		t.direction="计算机";
		t.tcourse="使用Java语言理解程序逻辑";
		t.tage=5;
		System.out.println(t.name+"\n"+"专业方向:"+t.direction+"\n"+"教授课程:"+t.tcourse+"\n"+"教龄:"+t.tage);
		
	}
	
}
