package com.hzkgc.ldd;

import java.util.Scanner;

public class Lx51 {

	public static void main(String[] args) {
		//矩形
	/*
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	*/
		//侧三角形
	/*
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	*/	
		//平行四边形
	/*
		for(int i=1;i<=5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<5;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	*/	
		//三角形
		for(int i=1;i<=5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("输入：");
		int m=sc.nextInt();
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=m-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	
		for(int i=0;i<=35;i++) {
			for(int j=0;j<=35;j++) {
				if(2*i+4*j==94&&i+j==35) {
					System.out.println("鸡有"+i+"只,兔有"+j+"只。");
				}
			}
		}
		
	}

}
