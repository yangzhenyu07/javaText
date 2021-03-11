package com.yzy.text;

import java.util.Scanner;

/*
 * 守护线程  服务线程  可以在程序中所有用户线程结束时，立刻结束自身的执行
 * 用于一些不影响业务逻辑的操作
 * void setDaemon(boolean b)
 * */

public class Text78OOP56守护线程  extends Thread{
      
    public void run() {
    	for (int i = 1; i <=20; i++) {
			try {
				Thread.sleep(1000);
			
			} catch (Exception e) {
		 System.out.println(e);   
		
			}
			System.out.println(i);
		}
    
    }
    public static void main(String[] args) {
		Text78OOP56守护线程 t = new Text78OOP56守护线程();
		t.setDaemon(true);   //守护线程
		t.start();
		System.out.println("是守护线程"+t.isDaemon());  //isDaemon() 判断是否为守护线程
		Scanner  sc = new Scanner(System.in);
		String ss = sc.next();
		System.out.println(ss);
		System.out.println("输入结束，主线程结束，守护线程结束");
	}
}
