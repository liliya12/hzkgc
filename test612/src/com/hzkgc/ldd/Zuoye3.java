package com.hzkgc.ldd;

import java.util.Arrays;
import java.util.Scanner;

public class Zuoye3 {

	public static void main(String[] args) {
		//1、手动输入学生的平时成绩和期末成绩,总分均为100;
		//打印学生成绩的总分:平时成绩*40%+期末成绩*60%
//		@SuppressWarnings("resource")
//		Scanner sc=new Scanner(System.in);
//		for(;;) {
//			System.out.print("请输入学生平时成绩：");
//			int score1=sc.nextInt();
//			System.out.print("请输入学生期末成绩：");
//			int score2=sc.nextInt();
//			if(score1>100&&score2>100) {
//				System.out.println("您输入的成绩不符合要求,请重新输入！");
//			}else {
//				double sum=(score1*0.4)+(score2*0.6);
//				System.out.println(sum);
//			}
//		}
	
	/*	//2、商场消费返利活动，手动输入顾客消费金额，满300打八折,如果金额打8折后仍然满1000元，用户就获得200元代金券一张,输出用户需要支付的金额
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入消费金额：");
		int a=sc.nextInt();
		double sum=0;
		if(a>=300) {
			sum=a*0.8;
			if(sum>1000) {
				sum=sum-200;
			}
		}else {
			System.out.println("您需要支付"+a+"元");
		}
		System.out.println("您需要支付："+sum+"元");
	*/
		//3、用户输入一个年份，如果是闰年输出是闰年
	/*	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入年份：");
		int nian=sc.nextInt();
		if(nian%4==0&&nian%100!=0||nian%400==0) {
			System.out.println(nian+"年是闰年");
		}else {
			System.out.println(nian+"年不是闰年");
		}
	*/
		//4、选择一个形状（1长方形、2正方形、3三角形、4圆形）
	/*	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		for(;;) {
			System.out.print("请输入1~4的数字选择形状，1长方形、2正方形、3三角形、4圆形：");
			int c=sc.nextInt();
			if(c==1) {
				System.out.print("请输入长：");
				int height=sc.nextInt();
				System.out.print("请输入宽：");
				int width=sc.nextInt();
				int area=height*width;
				System.out.println("长方形的面积是："+area);
			}else if(c==2) {
				System.out.print("请输入边长：");
				int height=sc.nextInt();
				int area=height*height;
				System.out.println("正方形的面积是："+area);
			}else if(c==3) {
				System.out.print("请输入高：");
				int height=sc.nextInt();
				System.out.print("请输入底：");
				int di=sc.nextInt();
				double area=(height*di)/2;
				System.out.println("三角形的面积是："+area);
			}else if(c==4) {
				System.out.print("请输入半径：");
				int r=sc.nextInt();
				double area=3.14*r*r;
				System.out.println("三角形的面积是："+area);
			}
		}
	*/
		//5、随机生成一个1-100之间的数字num，循环让用户输入猜这个数，
		int num=(int)(Math.random()*100)+1;
		System.out.println(num);
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=0;i>=0;i++) {
			System.out.print("请输入数字：");
			int s=sc.nextInt();
			if(s>num) {
				System.out.println("您输入的数字过大");
			}else if(s<num) {
				System.out.println("您输入的数字过小");
			}else {
				sum+=i;
				System.out.println("恭喜您猜中了！你一共猜了"+sum+"次");
				break;
			}
		}
	
		//6、打印出1-100之间所有不是7的倍数和不包含7的数字，并求和
	/*	int sum=0;
		for(int i=1;i<=100;i++) {
			int a=i%10;
			int b=(i/10)%10;
			int c=i/100;
			if(i%7!=0&&a!=7&&b!=7&&c!=7) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("所有数字之和是："+sum);
	*/
		//7、计算跑完10000米需要多少秒
	/*	 int x=10000;
		 int y=400;
		 int z=50;
		 int sum=50;
		 for(int i=2;i<=x/y;i++) {
			 z=z+1;
			 sum=sum+z;
		 }
		 System.out.println("跑完10000米需要："+sum+"秒");
	*/ 
		 //8、输出数组中的最大值和最大值所在的下标(不能使用arrays.sort)
//		 int [] nums= {8,7,3,9,5,4,1};
//		 int max=0;
//		 int maxi=0;
//		 for(int i=0;i<nums.length;i++) {
//			if(nums[1]<nums[i]) {
//				max=nums[i];
//				maxi=i;
//			}
//		 }
//		 System.out.println("最大值是"+max+"最大值下标是"+maxi);

		 //9、将这个数组元素按照降序打印(可以使用arrays.sort)
//		 int[] nums={8,7,3,9,5,4,1};
//		 Arrays.sort(nums);
//		 for(int i=nums.length-1;i>=0;i--) {
//				 System.out.println(nums[i]); 
//		 }
	
		//10、要求生成的数字中没有重复数
//		 int [] a=new int[5];
//		 for(int i=0;i<a.length;i++) {
//			 a[i]=(int)(Math.random()*10)+1;
//			for(int j=0;j<i;j++) {
//				if(a[i]==a[j]) {
//					i--;
//					break;
//				}
//			} 
//		 }
//		 for(int k=0;k<a.length;k++) {
//			 System.out.println(a[k]);
//		 }
	}

}
