package com.hzkgc.ldd;

import java.util.Scanner;

public class Dcxt {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		String[] name=new String[4];   //订餐人姓名
		String[] dishmenu=new String[4];  //订餐菜单
		int [] time= new int[4];		//订餐时间
		double[] zprice=new double[4];  //订餐总价
		String[] status=new String[4];	//订单状态
		String[] address=new String[4];  //送达地址
		
		String[] dishName= {"红烧带鱼","鱼香肉丝","时令蔬菜"};
		double[] prices= {12.0,8.0,10.0};
		int [] giveNum= {0,1,2};
		boolean isExit=false; //是否退出系统
		int n=-1; 			//输入0返回菜单，否则退出系统
		//添加信息
		name[0] = "小明";
		dishmenu[0] = "时令蔬菜 2份";
		time[0] = 13;
		address[0] = "课工场1号";
		status[0] = "已预定";
		prices[0] = 20.0;
		
		name[1] = "小红";
		dishmenu[1] = "时令蔬菜 2份";
		time[1] = 13;
		address[1] = "课工场21号";
		status[1] = "已完成";
		prices[1] = 20.0;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("###############################");
			System.out.println("1、我要订餐");
			System.out.println("2、查看餐车");
			System.out.println("3、签收订单");
			System.out.println("4、删除订单");
			System.out.println("5、我要点赞");
			System.out.println("6、退出系统");
			System.out.println("###############################");
			System.out.print("请选择:");
			int c=sc.nextInt();
			boolean isAdd=false;  //判断是否能继续添加
			boolean isDel=false; //判断是否能删除
			switch(c){
			case 1:
				System.out.println("####我要订餐####");
				System.out.println("序号\t菜品\t价格");
				for(int i=0;i<dishName.length;i++) {	
					System.out.println((i+1)+"\t"+dishName[i]+"\t"+prices[i]);
				}
				
				System.out.println("输入订餐人姓名:");
				String names=sc.next();
				System.out.println("输入订餐序号:");
				int xh=sc.nextInt();
				System.out.println("输入订餐份数:");
				int num=sc.nextInt();
				System.out.println("输入送达时间:");
				int tnum=sc.nextInt();
				System.out.println("输入送达地址:");
				String tress=sc.next();
				//定义运费，总价，单价，点餐信息
				double yfprice=6.0;
				double zprices=prices[xh-1]*num+yfprice;
				double dprice=prices[xh-1]*num;
				String dishmenuz=dishName[xh-1]+" "+num+"份";
				String statuses="已预定";
				//将数据添加进数组
				for(int i=0;i<time.length;i++) {
					if(time[i]==0) {
						isAdd=true;
						dishmenu[i]=dishName[xh-1]+num+"份";
						time[i]=tnum;
						name[i]=names;
						zprice[i]=prices[xh-1]*num+yfprice;
						address[i]=tress;
						status[i]=statuses;
						break;
					}
				}
				//判断餐车是否已满
				if(!isAdd) {
					System.out.println("餐车已满不能在预定!");
				}else {
					//订餐成功后打印的信息
					System.out.println("订餐成功!");
					System.out.println("您预定的是:"+dishmenuz);
					System.out.println("送达时间是:"+tnum);
					System.out.println("送达地址是:"+tress);
					System.out.println("餐费是:"+dprice+"元"+"运送费是:"+yfprice+"元"+"总费用是:"+zprices+"元");
					
				}
				
				
				break;
			case 2:
				//查看餐车
				System.out.println("####查看餐车####");
				System.out.println("序号\t订餐人\t菜品\t\t价格\t送达时间\t送达地址\t预定状态");
				//遍历订单信息
				for(int i=0;i<time.length;i++) {
					if(time[i]!=0) {
						String ress=address[i];
						String date=time[i]+"点";
						System.out.println((i+1)+"\t"+name[i]+"\t"+dishmenu[i]+"\t"+zprice[i]+"元"+"\t"+date+"\t"+ress+"\t"+status[i]);
					}
				}
				
				break;
			case 3:
				System.out.println("####我要签收####");
				for(int i=0;i<time.length;i++) {
					if(time[i]!=0) {
						System.out.println((i+1)+"\t"+name[i]+"\t"+dishmenu[i]+"\t"+zprice[i]+"元"+"\t"+time[i]+"\t"+address[i]+"\t"+status[i]);
					}
				}
				System.out.println("请输入签收的定单号:");
				int m=sc.nextInt();
				//判断是否能签收，已预定可以签收，已完成不能签收，订单号错误输出有误；
				if(time[m-1]!=0) {
						if(status[m-1].equals("已预定")) {
							status[m-1]="已完成";
							System.out.println("签收成功");
						}else {
							System.out.println("您已签收,请勿重复签收");
						}
					}else {
						System.out.println("输入有误");
					}
				break;
				
			case 4:
				System.out.println("***删除订单***");
				
				for(int i=0;i<time.length;i++) {
					if(time[i]!=0) {
						System.out.println((i+1)+"\t"+name[i]+"\t"+dishmenu[i]+"\t"+zprice[i]+"元"+"\t"+time[i]+"\t"+address[i]+"\t"+status[i]);
					}
				}
				System.out.print("请输入要删除的订单序号:");
				int de = sc.nextInt();
				
				for(int i=0;i<time.length;i++) {
					//已完成状态，有订单可以删除;
					if(status[de-1].equals("已完成")&&time[de-1]!=0) {
						//将第j位赋值为j+1位的值；将删除位置后的元素向前挪；
						isDel=true;
						for(int j=de-1;j<time.length-1;j++) {
							dishmenu[j]=dishmenu[j+1];
							time[j]=time[j+1];
							name[j]=name[j+1];
							zprice[j]=zprice[j+1];
							address[j]=address[j+1];
						}	
						//将最后一位清除；
						dishmenu[dishmenu.length-1]=null;
						time[time.length-1]=0;
						name[name.length-1]=null;
						zprice[zprice.length-1]=0.0;
						address[address.length-1]=null;
						
						System.out.println("删除成功");
						break;
						//判断订单状态，未签收不能删除
					}else if(time[de-1]!=0&&status[de-1].equals("已预定")){
						isDel=true;
						System.out.println("订单未签收，不能删除");
						break;
					}
					
				}
				if(!isDel) {
					System.out.println("输入有误");
				}
			
				break;
			case 5:
				System.out.println("***我要点赞***");
				// 显示菜品信息
				System.out.println("序号\t菜品\t价格\t点赞数");
				for(int i=0;i<dishName.length;i++) {
						System.out.println((i+1)+"\t"+dishName[i]+"\t"+prices[i]+"\t"+giveNum[i]);
				}
				
				System.out.print("请选择您要点赞的菜品序号：");
				int gNum = sc.nextInt();
				//输入序号，该序号菜品点赞次数增加；
				if(gNum<=dishName.length) {
					giveNum[gNum-1]++;
					System.out.println("点赞成功");
				}
				
				break;
			case 6:
				isExit=true;
				break;
			default:
				System.out.println("重新输入");
			}
			if(!isExit) {
				System.out.println("输入0返回");
				n=sc.nextInt();
			}else {
				break;
			}
		}while(n == 0);
		System.out.println("谢谢使用！");
	}

}
