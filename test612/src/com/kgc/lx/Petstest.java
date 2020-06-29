package com.kgc.lx;

import java.util.Scanner;

public class Petstest {

	public static void main(String[] args) {
		Pets p=new Pets();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入名字：");
		p.name=sc.next();
		System.out.println("请输入性别：");
		int s=sc.nextInt();
		if(s==1) {
			p.sex="Q妹";
		}else if(s==2){
			p.sex="Q仔";
		}
		System.out.println("请输入健康值：");
		int h=sc.nextInt();
		p.setHealth(h);
		p.Print();
	}

}
