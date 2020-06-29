package com.hzkgc.ldd;

import java.util.*;
public class Lx1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	/*	
		//练习1
		String name1="小明";
		int age=25;
		int nian=3;
		int xm=5;
		String kc="java";
		String hobby="篮球";
		System.out.println("这个同学的名字是:"+name1);
		System.out .println("年龄是:"+age);
		System.out .println("工作了"+nian+"了");
		System.out .println("做过"+xm+"个项目");
		System.out .println("技术方向是"+kc);
		System.out .println("兴趣爱好是:"+hobby);
	*/	
		
		//练习2、3、4
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入4位会员卡号:");
		
		int now = input.nextInt();
		int a=now/1000;
		int b=(now/100)%10;
		int c=(now%100)/10;
		int d=now%10;
		int sum=a+c+b+d;
		                        
		String x=(sum>20)? "您中奖了":"您未中奖";
		
		System.out.println("会员号是:"+now);
		System.out.println("千位数是:"+a+"百位数是:"+b+"十位数是:"+c+"个位数是:"+d);
		System.out.println("会员卡号"+now+"的各位之和是:"+sum);
		System.out.println("会员卡号是"+now+"的会员"+x);
		
	}

}
