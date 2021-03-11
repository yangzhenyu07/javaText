package com.yzy.work;
/*
 * 1、线程的生命周期，生命周期状态如何转换
 * 新建  可运行 运行  中断  死亡 
 * 2、创建线程的方法有几种
 * 两种
 * 继承 Thread类
 * 实现Runnable接口
 * 3、什么是线程同步
 * 在线程之间通过线程同步建立起执行顺序，并在同步时共有某个资源
 * 4、如何中断和恢复线程同步
 *   wait和Scnaner  中断线程同步   notify() 唤醒
 * 5、林老师  给三班上数据结构，发现李雷和王刚上课睡觉，林老师喊了三声，李雷醒了
 * 王刚还在睡觉，让李雷叫醒王刚
 * 6、李雷  韩梅梅 王刚 排队先后买票  5元一张    20元（李雷买一张）,5（韩梅梅）,10（王刚买了2张）
 *    售票员手里只有5元钱
 * */
class Tercher implements Runnable{
	Thread Ltercher,lilei ,wanggang;	
	public Tercher() {
		Ltercher = new Thread(this);
	}
	public void run() {
		while(true){
		if (Thread.currentThread()== Ltercher) {
			System.out.println(Thread.currentThread().getName()+"今天给三班上数据结构课！！！");
			try {
				
				Ltercher.start();
				Thread.sleep(1000);
				System.out.println("进屋后");
				Thread.sleep(2000);
				System.out.println("发现李雷和王刚正在睡觉");
				Thread.sleep(1000);
				System.out.println("林老师：");
				Thread.sleep(1000);
				System.out.println("上课了");
				Thread.sleep(1000);
				System.out.println("上课了");
				Thread.sleep(1000);
				System.out.println("上课了");
				Thread.sleep(1000);
				lilei = new Thread(this);
				lilei.start();
				lilei.join();
				System.out.println("林老师：你把王刚叫起来");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			return;
		} else if(Thread.currentThread() == lilei){
                        
                        try {
                        	System.out.println("李雷醒了但王刚还在睡觉");
							Thread.sleep(1000);
							Ltercher.notify();
							wanggang = new Thread(this);
							wanggang.start();
						} catch (Exception e) {
							System.out.println(e);
						}
                        return;
		}else if(Thread.currentThread() == wanggang){
			try {
				System.out.println("王刚看看了李雷");
				Thread.sleep(1000);
				System.out.println("于是把李雷打了");
			} catch (Exception e) {
				// TODO: handle exception
			}
			return;
		}
		}
	}
	
}
	public class Work21￥ {
	public static void main(String[] args) {
		Tercher t = new Tercher();
		t.Ltercher.start();
	}
	


	}

