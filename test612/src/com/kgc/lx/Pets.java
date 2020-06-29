package com.kgc.lx;


public class Pets {

	String name;
	String sex;
	private int health;
	private int qm;
	
	public void setHealth(int health) {
		if(health>=1&&health<=100) {
			this.health=health;
		}else {
			System.out.println("输入不合法！默认为60");
			this.health=60;
		}
	}
	public int getHealth() {
		return this.health;
	}
	public void setQm(int health) {
		if(qm>=1&&qm<=100) {
			this.qm=health;
		}else {
			System.out.println("输入不合法！默认为60");
			this.qm=60;
		}
	}
	public int getQM() {
		return this.qm;
	}
	public void Print() {
		System.out.println(name+"\t"+sex+"\t"+health);
	}
	
}
