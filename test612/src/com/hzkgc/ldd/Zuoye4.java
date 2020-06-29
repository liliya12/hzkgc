package com.hzkgc.ldd;

import java.util.Scanner;

public class Zuoye4 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		String[] name=new String[4];  //订餐人姓名
		String[] menu=new String[4];  //预定菜品
		int[]  hour=new int[4];			//送达时间
		String[] address=new String[4];  //送达地址
		int[] state=new int[4];			 //预定状态
		double[] prices=new double[4];	//总价格

		//添加菜单；
		String[] menuname= {"鱼香肉丝","青椒肉丝","水煮肉片","青菜豆皮"};
		double[] menuprice=new double[]{20.0,10.0,11.0,8.0};

		//添加餐车信息
		name[0] = "武晓妍";
		menu[0] = "青菜豆皮 2份";
		hour[0] = 13;
		address[0] = "课工场1号";
		state[0] = 1;
		prices[0] = 76.0;



		Scanner sc=new Scanner(System.in);
		int num=7;
		boolean isExit=false;
		System.out.print("####欢迎使用吃货联盟系统####");

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
			boolean isAdd=false;  //订单添加
			boolean isSign=false;  //订单签收
			boolean isDelete=false;  //订单删除
			switch(c) {
			case 1:
				//订餐
				System.out.println("####我要订餐####");
				for(int i=0;i<name.length;i++) {
					if(name[i]==null) {
						isAdd=true;
						System.out.println("请输入订餐人姓名:");
						String names=sc.next();
						//显示菜单
						System.out.println("序号"+"\t"+"菜品名称"+"\t"+"价格");
						for(int j=0;j<menuname.length;j++) {
							double price=menuprice[j];
							String cp=menuname[j];
							System.out.println((j+1)+"\t"+cp+"\t"+price+"元");
						}

						System.out.println("请输入菜品序号:");
						int menuNum=sc.nextInt();
						System.out.println("请输入订餐份数:");
						int menuNum2=sc.nextInt();
						String menuz=menuname[menuNum-1]+" "+menuNum2+"份";
						double menuPrice2=menuprice[menuNum-1]*menuNum2;
						double yfprice=6.0;

						System.out.println("请输入送餐时间(时间是在10~20点之间的整数):");
						int times=sc.nextInt();
						if(times<10||times>20) {
							System.out.println("您输入的送餐时间无效,请重新输入!");
							times=sc.nextInt();
						}
						System.out.println("请输入订餐地址:");
						String menuar=sc.next();

						System.out.println("订餐成功!");
						System.out.println("您预定的是:"+menuz);
						System.out.println("送达时间是:"+times);
						System.out.println("送达地址是:"+menuar);
						System.out.println("餐费是:"+menuPrice2+"元"+"运送费是:"+yfprice+"元"+"总费用是:"+(menuPrice2+yfprice)+"元");

						//添加数据
						name[i]=names;
						menu[i]=menuz;
						hour[i]=times;
						address[i]=menuar;
						prices[i]=menuPrice2+yfprice;

						break;
					}
				}
				if(!isAdd) {
					System.out.println("餐车已满不能在预定!");
				}
				break;
			case 2:
				System.out.println("####查看餐车####");
				System.out.println("序号\t订餐人\t菜品\t\t价格\t送达时间\t送达地址\t预定状态");
				for(int i=0;i<name.length;i++) {
					if(name[i]!=null) {
						String st=(state[i]==0)? "已预定":"已完成";
						String ress=address[i];
						String date=hour[i]+"点";
						System.out.println((i+1)+"\t"+name[i]+"\t"+menu[i]+"\t"+prices[i]+"元"+"\t"+date+"\t"+ress+"\t"+st);
					}
				}
				break;
			case 3:
				System.out.println("####我要签收####");
				System.out.println("请输入签收的定单号:");
				int Num=sc.nextInt();
				for(int i=0;i<name.length;i++) {
					//已预定可签收,已完成不可签收,找不到订单不可签收
					if(state[i]==0&&name[i]!=null&&Num==i+1) {
						state[i]=1;
						isSign=true;
						System.out.println("您已成功签收!");
					}else if(state[i]==1&&name[i]!=null&&Num==i+1) {
						isSign=true;
						System.out.println("您已经签收过了");
					}
				}
				if(!isSign) {
					System.out.println("找不到订单!");
				}

				break;
			case 6:
				isExit=true;
				break;
			default:
				System.out.println("重新输入：");
			}
			if(!isExit) {
				System.out.println("输入0返回:");
				num=sc.nextInt();
			}else {
				break;
			}
			
			
		}while(num==0);
		System.out.println("谢谢使用");
	}

}
