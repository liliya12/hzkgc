package com.hzkgc.ldd;

//import java.util.Arrays;
//import java.util.Scanner;

public class Zuoye5 {

//	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
	/*
		Scanner sc=new Scanner(System.in);
		System.out.println("输入机票原价");
		double yprice=sc.nextDouble();
		System.out.println("输入月份");
		int month=sc.nextInt();
		System.out.println("输入头等舱或经济舱");
		String t=sc.next();
		if(month>=5) {
			
			if(t.equals("头等舱")) {
				yprice=yprice*0.9;
				System.out.println("票价是："+yprice);
			}else if(t.equals("经济舱")) {
				yprice=yprice*0.85;
				System.out.println("票价是："+yprice);
			}
			
		}else if(month>=11&&month<=12&&month<=4) {
			if(t.equals("头等舱")) {
				yprice=yprice*0.7;
				System.out.println("票价是："+yprice);
			}else if(t.equals("经济舱")) {
				yprice=yprice*0.65;
				System.out.println("票价是："+yprice);
			}
		}
	*/
		//2、
	/*	Scanner sc=new Scanner(System.in);
		int num=(int)(Math.random()*100)+1;
		System.out.println(num);
		int sum=0;
		for(;;){
			System.out.println("请输入数字：");
			int n=sc.nextInt();
			if(n>num) {
				sum=sum+1;
				System.out.println("您输入的数字较大");
				continue;
			}else if(n<num) {
				sum=sum+1;
				System.out.println("您输入的数字较小");
				continue;
			}
			sum=sum+1;
			System.out.println("您一共猜了"+sum+"次");
			break;
		}
	*/
		//3、
		int[] a=new int[10];
		@SuppressWarnings("unused")
		int[] b=new int[10];
		@SuppressWarnings("unused")
		int sum=0;
		for(int i=0;i<a.length;i++) {
			int num=(int)(Math.random()*10);
			a[i]=num;
			for(int j=0;j<i;j++) {
				
			}
			
//			System.out.println(a[i]);
		}
		
		//4、
	/*
		double a=100;
		double sum=100;
		for(int i=0;i<=9;i++) {
			sum=sum+a;
			a=(a/2);
		}	
		System.out.println("共经过"+(sum-2*a)+"米，"+"第十次反弹"+a+"米");
	*/
		//5、
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("请输入数字：");
		int num=sc.nextInt();
		int a=num/10000;
		int b=(num/1000)%10;
		int c=(num/100)%10;
		int d=(num/10)%10;
		int e=num%10;
		if(a==e&&b==d) {
			System.out.println(num+"是回文数");
		}else {
			System.out.println(num+"不是回文数");
		}
		*/
		//6、
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("请输入四位数字：");
		int num=sc.nextInt();
		int a=num/1000;
		int b=(num/100)%10;
		int c=(num/10)%10;
		int d=num%10;
		int[] m={a,b,c,d};
		int[] x=new int[4];
		for(int i=0;i<m.length;i++) {
			m[i]=(m[i]+5)%10;
			x[i]=m[i];
		}
		for(int j=0;j<x.length;j++) {
			x[0]=m[3];
			x[1]=m[2];
			x[2]=m[1];
			x[3]=m[0];
			System.out.print(x[j]);
		}
	*/	
	
		//7、
//		Scanner sc=new Scanner(System.in);
//		double avg=0;
//		int sum=0;
//		a:for(int i=0;i<=3;i++) {
//			System.out.println("第"+(i+1)+"个班级");
//			
//			for(int j=0;j<4;j++) {
//				System.out.println("请输入成绩：");
//				int num=sc.nextInt();
//				
//				if(num<60||num>100) {
//					break;
//				}
//				sum=sum+num;
//			}
//			avg=sum/4;
//			sum=0;
//			System.out.println("平均分是："+avg);
//		}
		
	}

}
