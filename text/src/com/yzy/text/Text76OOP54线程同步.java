package com.yzy.text;
/*
 * 线程同步  synchronized     (同步时 ， sleep方法不好使)
 *   只能使  wait()方法 notifyAll()方法 使所有的writ都启动  先中断先入队
 *   notify()方法  唤醒线程
 *   并不是线程同步所必须的方法  有些线程同步方法中并不需要这些方法
 * */
class Account{                                         //同步用的方法
	double balance;        //共享
	public synchronized void setmoney(double money){
		balance = balance +money;
		System.out.println("杨镇宇存入"+money+"元，账户余额："+balance+"元");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		notifyAll();
	}
	public synchronized void getmoney(double money){   //同步语句
		while (balance < money) {
			System.out.println("账户余额不足");
			try {
				wait();                        //因为同步  ，   所以不能用sleep()，只能用wait()
			} catch (Exception e) {	
				System.out.println(e);
			}
		}
		balance = balance - money;
		System.out.println("陈美宏取出"+money+"元，账户余额"+balance +"元");
	}
}
class SynchroTest implements Runnable{
	Thread  yzy,cmh;
	Account account;  //账户类 创建一个账户
	public SynchroTest() {
	yzy = new Thread(this);
	cmh = new Thread(this);
	 account = new Account();
	}
	public void run() {
		if (Thread.currentThread() == yzy) {
			for (int i = 0; i < 3; i++) {
				System.out.println("杨镇宇挣钱，如数将工资存入家庭银行");
				account.setmoney(1000);
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}else if(Thread.currentThread() == cmh){
			for (int i = 0; i < 3; i++) {
				System.out.println("陈美宏主持家务从银行里面取钱。。。。。");
				account.getmoney(800);
			}
		}	
	}
}
public class Text76OOP54线程同步 {
public static void main(String[] args) {
	 SynchroTest  st = new SynchroTest();
	 st.yzy.start();
	 st.cmh.start();
}
}
