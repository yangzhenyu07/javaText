package com.yzy.text;
/*
 * 多线程中的共享与独享
 * 
 * */
class SavingBox implements  Runnable{
	double  balance; // 余额        共享的
	public void run(){
		int count = 0;
		while (true) {
			balance = balance +1000;
			count ++;   // 存钱的次数
			try {
				System.out.println(Thread.currentThread().getName()+"第"+count+"次存钱，存折余额为"+balance+"元");
			      if (count == 3) {
					System.out.println(Thread.currentThread().getName()+"存了"+count+"次，本月存钱结束");
					return;
				}
			       Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class Text75OOP53线程共享 {
	public static void main(String[] args) {
		SavingBox  sx = new SavingBox();
		Thread yzy = new Thread(sx);
		yzy.setName("杨镇宇");
		Thread cmh= new Thread(sx);
		cmh.setName("陈美宏");
		yzy.start();
		cmh.start();
	}

}
