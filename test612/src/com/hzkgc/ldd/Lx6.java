package com.hzkgc.ldd;

import java.util.Arrays;
import java.util.Scanner;

public class Lx6 {

	public static void main(String[] args) {
	//输入成绩添加进数组，求所有成绩的和
	/*	int[] a=new int[5];
		int sum=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.print("请输入第"+(i+1)+"门成绩：");
			int score=sc.nextInt();
			a[i]=score;
		}
		System.out.println(Arrays.toString(a));
		for(int j=0;j<a.length;j++) {
			sum+=a[j];
		}
		System.out.println(sum);
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	*/
		//增加一个数据创建一个新的数组并按顺序排列
		int n[]=new int[]{26,49,95,55,76};
		Arrays.sort(n);
		int m=60;
		int p[]=new int[n.length+1];
		int i=0;
		for(;i<n.length;i++) {
			if(n[i]>m) {
				break;
			}
		}
		//小于m的数据添加进p[]
		for(int j=0;j<i;j++) {
			p[j]=n[j];
		}
		//大于m的数据添加进p[]
		for(int k=i;k<n.length;k++) {
			p[k+1]=n[k];
		}
		p[i]=m;
		System.out.println(Arrays.toString(p));
	//输出数组并求和，判断所输入数字是否属于数组
	/*	int a[]=new int[]{8,4,2,1,23,344,12};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			System.out.println(a[i]);
		}
		System.out.println(sum);
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("请任意输入一个数:");
		int b=sc.nextInt();
		for(int k=0;k<a.length;k++) {
			
			if(a[k]==b) {
				System.out.println("你输入的数在范围内");
			}
		}
		*/
	}

}
