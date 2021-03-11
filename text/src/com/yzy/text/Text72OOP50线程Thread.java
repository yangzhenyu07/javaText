package com.yzy.text;
/*（对象是堆 ，变量是栈）
 * 线程
 * 资源交替占用任务执行的过程  多线程
 * 每个任务一次动态执行效果  被称为进程(进程比线程大)
 * C/S   客户端/服务器   里用的多
 * JVM里有个线程调度器   自动控制线程
 *  main是java程序当中最主要的主线程
 *  线程的生命周期
 *  1、新建   线程对象定义之后进入新建状态
 *  2、运行   当线程占用计算机资源时进入运行状态   进行调度器(先进先出性)
 *  3、中断    原因：(1)、阻塞   比如Scanner
 *                           (2)、线程调度器控制
 *                           (3)、Sleep(long mill)方法   线程进行休眠  单位毫秒
 *                           (4)、wait ()方法 等待  、join()方法  加入
 *  4、死亡
 *  创建线程的方法
 *  1、Thread  线程类 直接继承就可以
 *       public void run() 必须重写
 *  2、  实现Runnable接口创建线程  
 * */
class SimpleThread extends Thread{
	

	public void run() {

		for (int i = 0; i <3; i++) {
			System.out.println(getName()+i);         //getName()获取线程的名称
			try {
				sleep((int)Math.random()*1000);  //0-1000           sleep()睡眠的意思 使线程中断
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		System.out.println("杨镇宇"+getName());
	}
	
}
public class Text72OOP50线程Thread {
 public static void main(String[] args) {
	SimpleThread one = new SimpleThread();
	one.setName("第一");                                       //创建线程
	one.start();                                                       //线程启动   使线程进入队列
	SimpleThread two = new SimpleThread();
	two.setName("第二");
	two.start();
}
}
