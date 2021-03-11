package com.yzy.text;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 
 *   continue：跳出本次循环继续下一次循环

     break：   跳出当前循环体，继续执行循环外的函数体

    return:   跳出整个函数体，函数体后面的部分不再执行
 *  return:

 * */

public class Text08continue {
	
    private static ReentrantLock lock     = new ReentrantLock();
    private static Condition   take     = lock.newCondition();

    private static BlockingQueue queue    = new ArrayBlockingQueue<String>(10);

	//continue
	public static void continueTest() throws InterruptedException {
		boolean flag = true;
		while(flag) {
			try {
				lock.lock();
				if(queue.size() == 0) {
					take.signal();
					queue.put(Thread.currentThread().getName());
				}else {
					//阻塞
					take.await();
				}		
				int j =10;
				while(j>0) {
					System.out.printf(Thread.currentThread().getName()+":continue%s-%s以内的奇数\n",(10-j)*10+1,(10-j)*10+11);
					for (int i = (10-j)*10+1; i < (10-j)*10+11; i++) {
						if (i%2==0)      
							continue;  // 弹出后只剩下奇数
							System.out.printf(Thread.currentThread().getName()+"continue练习输出奇数:%s\n",i);					
					}
					j--;
				}
			}finally {
				queue.take();
				flag = false;
				take.signal();
				lock.unlock();
			}
		}
		
	}
	//break
	public static void  breakTest() throws InterruptedException {
		boolean flag = true;
		while(flag) {
			try {
				lock.lock();
				if(queue.size() == 0) {
					take.signal();
					queue.put(Thread.currentThread().getName());
				}else {
					//阻塞
					take.await();
				}	
				int j =10;
				while(j>0) {
					System.out.printf(Thread.currentThread().getName()+":break%s-%s以内的奇数\n",(10-j)*10+1,(10-j)*10+11);
					for (int i = (10-j)*10+1; i < (10-j)*10+11; i++) {
						if (i%2==0)      
							break;  // 弹出后只剩下奇数
							System.out.printf(Thread.currentThread().getName()+"break练习输出第一个奇数:%s\n",i);					
					}
					j--;
				}
			}finally {
				queue.take();
				flag = false;
				take.signal();
				lock.unlock();
			}
		}		
	}
	//return
	public static void  returnTest() throws InterruptedException {
		boolean flag = true;
		while(flag) {
			try {
				lock.lock();
				if(queue.size() == 0) {
					take.signal();
					queue.put(Thread.currentThread().getName());
				}else {
					//阻塞
					take.await();
				}	
	        	int j =10;
	    		while(j>0) {
	    			System.out.printf(Thread.currentThread().getName()+":return%s-%s以内的奇数\n",(10-j)*10+1,(10-j)*10+11);
	    			for (int i = (10-j)*10+1; i < (10-j)*10+11; i++) {
	    				if (i%2==0)      
	    					return;  // 弹出后只剩下奇数
	    					System.out.printf(Thread.currentThread().getName()+"return练习输出奇数:%s\n",i);					
	    			}
	    			j--;
	    		}
			}finally {
				flag = false;
				queue.take();
				take.signal();
				lock.unlock();
			}
		}      
		
	}
   public static void main(String[] args) {
	   //continue
	   Thread tcontinue = new Thread(new Runnable() {
		public void run() {			
				try {
					continueTest();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}			
		}
	   });
	   //break
	   Thread tbreak = new Thread(new Runnable() {
			public void run() {
				try {
					breakTest();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	   });
	   //return
	   Thread treturn = new Thread(new Runnable() {
			public void run() {
				try {
					returnTest();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	   });
	   tcontinue.start();
	   tbreak.start();
	   treturn.start();
   }
}
