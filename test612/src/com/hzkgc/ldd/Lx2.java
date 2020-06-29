package com.hzkgc.ldd;

import java.util.Scanner;

public class Lx2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		Scanner a=new Scanner(System.in);
		System.out.println("请输入会员号");
		
		int b=a.nextInt();
		int c=(b/100)%10;
		
		System.out.println(c);
		
		int random=(int)(Math.random()*10);
		System.out.println(random);
		
		if(random==c) {
			System.out.println("恭喜你成为幸运会员");
		}else {
			System.out.println("很遗憾，您未中奖");
		}
	}

}
