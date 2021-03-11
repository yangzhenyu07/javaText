package com.yzy.text;
/*
 * 线程联合 join (long mill,int namos) 
 *  mill  毫秒
 * namos  纳秒
 * tourist.setName 设置线程名字
 * */
class ThreadjoinTest implements Runnable{
	Thread tourist,policeoffice;               // tour 游客,  policeoffice 警察局

	public ThreadjoinTest() {
		tourist = new Thread(this);
		tourist.setName("陶雨恬");
		
	}
	@Override
	public void run() {
		if (Thread.currentThread() == tourist) {
			System.out.println("陶雨恬计划去国外旅游！！！，需要去警察局办理护照。");
			try {
				Thread.sleep(1000);
				policeoffice = new Thread(this);
				policeoffice.start();
				policeoffice.join();                               //***线程联合     陶雨恬线程停掉，它进行
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			System.out.println("陶雨恬拿到护照，可以去签证了，准备出国"); 
		}else if(Thread.currentThread() == policeoffice){
			try {
				System.out.println("陶雨恬到了警察局填写申请表");
				Thread.sleep(1000);
				System.out.println("照相.......");
				Thread.sleep(1000);
				System.out.println("将申请表交给警察审核");
				Thread.sleep(1000);
				System.out.println("审核通过，交款，15天后取照");
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}	
	}
}
public class Text77OOP55线程联合 {
	public static void main(String[] args) {
		ThreadjoinTest  tjt = new ThreadjoinTest();
		tjt.tourist.start();
	}

}
