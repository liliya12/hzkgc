package com.hzkgc.ldd;

import java.util.Scanner;

public class Lx5 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				sum=i*j;
				System.out.print(i+"*"+j+"="+sum+"\t");
				
			}
			System.out.println();
		}
		
	//练习2 1
/*		for(int i=100;i>=1;i-=5) {
			
			System.out.println(i);
			
		}
	*/
		
	//练习2 2
/*		int i=100;
		while(i>0) {	
			System.out.println(i);
			i-=5;
		}
	*/
	/*	
		int i=100;
		do {
			System.out.println(i);
			i-=5;
		}while(i>0);
	*/
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n=1;
		for(;n!=0;) {
			System.out.print("请输入一个1~7之间的数字，输入0退出程序：");
			 n=sc.nextInt();
			switch(n) {
			case 0:
				System.out.println("程序结束");
				break;
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			default:
				System.out.println("您输入的数字不合格,只能输入1~7范围的数字!");
				}
			}
		}
		
		
	}


