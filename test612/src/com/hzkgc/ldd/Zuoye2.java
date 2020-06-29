package com.hzkgc.ldd;

import java.util.Scanner;

public class Zuoye2 {
	public static void main(String [] args) {
		//1、打印出满足第一个第三位之和为10,第二位第四位之积为12的所有的四位数
		
		for(int num1=1000;num1<=9999;num1++) {
			int a1=num1/1000;
			int a2=(num1/100)%10;
			int a3=(num1%100)/10;
			int a4=num1%10;
			if(a1+a3==10&&a2*a4==12) {
				System.out.println(num1);
			}
		}
	
		
		//2、算出他摘了多少个桃子
		int num2=1;
		for(int x=1;x<=5;x++) {
			num2=(num2+1)*2;
		}	
		System.out.println("桃子总数是:"+num2);
	
		//3、编写程序实现输入整数n,输出图形
	
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入整数：");
		int num3=sc.nextInt();
		for(int i=1;i<=num3;i++) {
			for(int j=1;j<=i;j++) {
					System.out.print(j);
			}
			
			for(int k=i-1;k>=1;k--) {
				System.out.print(k);
			}
			
			System.out.println();
		}
		for(int i=num3-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
					System.out.print(j);
			}
			
			for(int k=i-1;k>=1;k--) {
				System.out.print(k);
			}
			
			System.out.println();
		}
	
		//4、当s大于5000时,n的取值
		int s=0;
		int i=1;
		for(i=1;i>=0;i++) {
			s=s+i;
			if(s>5000) {
				System.out.println(s);
				break;
			}
		}
		System.out.println("最后一个数的取值是:"+i);
	}
}
