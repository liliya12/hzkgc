package com.kgc.lx;

public class Student {
	
	String name;
	int age;
	String classr;
	String hobby;
	public void show() { //无参方法
		for(int i=0;i<=4;i++) {
			System.out.println(name+"\n"+"年龄:"+age+"\n"+"班级:"+classr+"\n"+"爱好:"+hobby);
			
		}
	}
	public int add(int a,int b) {  //有参方法
		
		return a+b;
	}
	
	public String getName() {
		
		return name;
	}
	public void setName(String s) {
		
		name=s;
	}
	public static void main(String[] args) {
		
		Student s=new Student();
		s.name="张浩";
		s.age=18;
		s.classr="s1班";
		s.hobby="篮球";
//		System.out.println(s.name+"\n"+"年龄:"+s.age+"\n"+"班级:"+s.classr+"\n"+"爱好:"+s.hobby);
		String a="张三";
//		s.show();
		 //传参
		System.out.println(a);
	}

}
