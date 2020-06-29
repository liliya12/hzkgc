package com.hzkgc.ldd;

import java.util.*;

public class Ldd {
	
	

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
	/*	
	 	Scanner k=new Scanner(System.in);
	 	System.out.println("请输入分数");
		int score=k.nextInt();
		if(score>=90){
			System.out.println("A");
		}else if(score>=80){
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
	*/
		
	/*
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		if(a%5==0&&a%7==0) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	*/
		
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入三个数字");
		
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if(a>b&&a>c) {
			System.out.println("a是最大的,最大值是"+a);
		}else if(b>a&&b>c){
			System.out.println("b是最大的,最大值是"+b);
		}else if(c>a&&c>b){
			System.out.println("c是最大的，最大值是"+c);
		}
	
	}

}
