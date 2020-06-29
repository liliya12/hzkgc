package com.kgc.lx;

import java.util.Scanner;

public class Calcu {

	int num1;
	int num2;
	double n1;
	double n2;
	double n3;

	public int count(int num1,int num2) {
		int sum=num1+num2;
		return sum;
	}
	public double count(double n1, double n2,double n3) {
		double sum=n1+n2+n3;
		return sum;
	}

	public static void main(String[] args) {
		Calcu c=new Calcu();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数字：");
		c.num1=sc.nextInt();
		c.num2=sc.nextInt();

		System.out.println(c.count(c.num1, c.num2));

		System.out.println("请输入数字：");
		c.n1=sc.nextDouble();
		c.n2=sc.nextDouble();
		c.n3=sc.nextDouble();

		System.out.println(c.count(c.n1, c.n2,c.n3));
	}


}
