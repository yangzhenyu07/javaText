package com.yzy.text;
/*
 * 于文涛   今天很累 抽着烟睡着了
 * 于文涛的烟头点燃了裤子 ，但是于文涛还在睡觉
 * 裤子着火了 于文涛还没醒
 * 火势越来越大
 * 报警器响了
 * 于文涛被报警器叫醒了
 * 裤子上的火被扑灭了 包宿太多真危险啊
 * 四个线程：主线程  于文涛  火 报警器
 * 利用try（）{}catch（）{}
 * */
class Text000 implements Runnable {
    Thread  yuwentao,fire,alarm; //yuwentao 于文涛  fire 火 alarm 报警器
    long time = 0;
    Text000(){
    	yuwentao = new Thread(this);
    }
	public void run() {	
		while (true) {
			if (Thread.currentThread() == yuwentao) {
				System.out.println("于文涛   今天很累 抽着烟睡着了");
				try {
					fire = new Thread(this);
					fire.start();                          //火线程排队
					Thread.sleep(1000*60*60);                 //睡眠
				} catch (InterruptedException e) {
					System.out.println("于文涛被警报器叫醒了");
					fire.interrupt();             //唤醒				
				}
				return;
			}else if(Thread.currentThread() == fire){
				if (time == 0) {
					time = 2000;
					try {
						Thread.sleep(time);
						
					} catch (Exception e) {
						System.out.println(e);
					}
				}else if(time>0&&time<3000){
					System.out.println("裤子着火了 于文涛还没醒");
					time = 4000;
					try {
						Thread.sleep(time);          //休眠4秒
					} catch (Exception e) {
						System.out.println(e);
					}
				}else if(time>3000){
					System.out.println("火势越来越大");
					alarm = new Thread(this);
					alarm.start();                    //报警器线程开始排队
					try {
						Thread.sleep(time);              //休眠4秒
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("裤子上的火被扑灭了 包宿太多真危险啊");
						return;
					}
				}
			}else if(Thread.currentThread() == alarm){          //currentThread()  返回当前运行的线程对象
				System.out.println("报警器响了");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
				yuwentao.interrupt();                //唤醒
				return;
			}
			
		} 
	}
    
}
public class Text74OOP52线程练习{
	public static void main(String[] args) {
		Text000 t = new Text000();
		t.yuwentao.start();
	}
}