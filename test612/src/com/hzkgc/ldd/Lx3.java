package com.hzkgc.ldd;
import java.util.*;
public class Lx3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//练习1
		Scanner sc=new Scanner(System.in);
		System.out.println("输入分数和性别");
		double score=sc.nextDouble();
		String s=sc.next();
		
		if(score<=10) {
			System.out.println("您已进入决赛");
			
			if(s.equals("男")) {
				System.out.println("男子组");
			}else {
				System.out.println("女子组");
			}
		}else {
			System.out.println("很遗憾您未进入决赛");
		}
	
		/*
		//练习2
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入奖励等级");
		int j=sc.nextInt();
		switch(j) {
		case 1:
			System.out.println("一等奖:大众汽车一辆");
			break;
		case 2:
			System.out.println("二等奖:iPhonex手机一部");
			break;
		case 3:
			System.out.println("三等奖:自行车一辆");
			break;
		default:
			System.out.println("参与奖:新华字典一本");
			break;	
		}
	*/
	/*	//练习3
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入学生姓名:");
		String name=sc.next();
		int sum=0;
		int p=0;
		for(int i=1;i<=5;i++) {
			System.out.print("请输入5门功课中第"+i+"门课的成绩:");
			int score=sc.nextInt();
			sum=sum+score;
			p=sum/5;
		}
		
		System.out.print(name+"的平均成绩是"+p);
		
		//练习4
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个值:");
		int a=sc.nextInt();
		for(int i=0;i<=a;i++) {
			int j=a-i;
			System.out.println(i+"+"+j+"="+a);
		}
	*/
		//练习5 1
		int sum=0;
	/*	for(int i=0;i<=100;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	*/
		//练习5 2
	/*	int i=0;
		while(i<=100) {
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
	*/
		//练习5 3
		int i=0;
		do{
			sum+=i;
			i=i+2;
		}while(i<=100);
		System.out.println(sum);
	}

}
