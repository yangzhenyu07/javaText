package com.yzy.work;

import java.rmi.server.Operation;

/*
 * 李雷 会计  Lily 出纳
 * Lily 报销单子差旅费  10000元
 * Lily 只能等李雷核算完毕之后
 * 结算期间李雷休息了1分钟  喝了一杯咖啡
 * 
 * */
class Company implements Runnable{ //利用Runnable接口，声明线程
	int account = 200;               //单位为万
	public void run(){
		if (Thread.currentThread().getName().equals("会计")) {
			System.out.println("会计正在核算");
			Operation(300);             //单位为万
		}else if(Thread.currentThread().getName().equals("出纳")){
			System.out.println("出纳来报销");
			Operation(1);               //单位为万
		}
	}

public synchronized void Operation(int amount){
	if (Thread.currentThread().getName().equals("会计")) {
		account = account+ amount;
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println("正在核算，请稍等");
				Thread.sleep(1000);
				
			}
			System.out.println("目前账面上有"+account+"万，喝杯咖啡休息一下");
			Thread.sleep(1000*10);
			System.out.println("继续核算");
			Thread.sleep(1000);
			System.out.println("月底核算结束");
		} catch (Exception e) {
	  	System.out.println(e);
		}
	}else if(Thread.currentThread().getName().equals("出纳")){
		account = account - amount;
		System.out.println(Thread.currentThread().getName()+"报销"+amount+"万元，账户还有"+account+"万元");
		
	}
}
}
public class Work20线程练习 {
public static void main(String[]  args) {
	Company com = new Company();
	Thread  lilei,Lily;
	lilei = new  Thread(com);
	Lily = new Thread(com);
	lilei.setName("会计");
	Lily.setName("出纳");
	lilei.start();
	Lily.start();
}
}
