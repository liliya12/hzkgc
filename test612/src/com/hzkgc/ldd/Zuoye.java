package com.hzkgc.ldd;

public class Zuoye {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int sum=0;
		//1
	/*	for(int i=1;i<=1000;i++) {
			if(i%3==0&&i%5==0) {
				sum+=i;
				System.out.println(i);
			}
		}
		System.out.println("数字之和是"+sum);
	*/	
		//2
	/*	int i=1;
		while(i<=1000) {
			if(i%3==0&&i%5==0) {
				sum+=i;
				System.out.println(i);
			}
			i++;
		}
		System.out.println("数字之和是"+sum);
	*/	
		//3
		int i=1;
		do {
			if(i%3==0&&i%5==0) {
				sum+=i;
				System.out.println(i);
			}
			i++;
		}while(i<=1000);
		System.out.println("数字之和是"+sum);
		
	}

}
