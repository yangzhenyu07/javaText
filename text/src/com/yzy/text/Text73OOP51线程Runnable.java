package com.yzy.text;
import java.awt.Graphics;
import java.util.Date;
/*
 * 小程序没有主方法
 * -------------------------------------------------------------------------------------让
 * 线程操作的方法
 * 1、public void static() 使线程进入等待队列
 * 2、public void run()  使线程进入运行状态
 * 3、public boolean isAlive() 判断线程是否处于运行状态
 * 4、public static void sleep(long mill)使正在运行的线程休眠
 * 5、public static Thread currentThread() 返回当前运行的线程对象
 * 6、public void interrupt() 唤醒正在休眠的线程
 * */
public class Text73OOP51线程Runnable extends java.applet.Applet  implements Runnable {   //java.applet.Applet小程序接口

      Thread  clockThead;
      public void start(){
    	  if (clockThead == null) {
			clockThead = new Thread(this,"Clock");                  //创建一个线程类的对象
			clockThead.start();
		}
      }
      public void run(){
    	  while (clockThead!=null) {
			repaint();              //清除网页中所有的方法
			try {
				clockThead.sleep(1000);               //休眠一秒
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
    	  
      }
	
		public void paint(Graphics g){
			Date now = new Date();
			g.drawString(now.toString(), 5, 10);   //5,10代表坐标值
		}
		public void stop(){
			clockThead.stop();
			clockThead = null;
		}
	

}
