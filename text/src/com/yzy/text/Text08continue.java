package com.yzy.text;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 
 *   continue����������ѭ��������һ��ѭ��

     break��   ������ǰѭ���壬����ִ��ѭ����ĺ�����

    return:   �������������壬���������Ĳ��ֲ���ִ��
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
					//����
					take.await();
				}		
				int j =10;
				while(j>0) {
					System.out.printf(Thread.currentThread().getName()+":continue%s-%s���ڵ�����\n",(10-j)*10+1,(10-j)*10+11);
					for (int i = (10-j)*10+1; i < (10-j)*10+11; i++) {
						if (i%2==0)      
							continue;  // ������ֻʣ������
							System.out.printf(Thread.currentThread().getName()+"continue��ϰ�������:%s\n",i);					
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
					//����
					take.await();
				}	
				int j =10;
				while(j>0) {
					System.out.printf(Thread.currentThread().getName()+":break%s-%s���ڵ�����\n",(10-j)*10+1,(10-j)*10+11);
					for (int i = (10-j)*10+1; i < (10-j)*10+11; i++) {
						if (i%2==0)      
							break;  // ������ֻʣ������
							System.out.printf(Thread.currentThread().getName()+"break��ϰ�����һ������:%s\n",i);					
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
					//����
					take.await();
				}	
	        	int j =10;
	    		while(j>0) {
	    			System.out.printf(Thread.currentThread().getName()+":return%s-%s���ڵ�����\n",(10-j)*10+1,(10-j)*10+11);
	    			for (int i = (10-j)*10+1; i < (10-j)*10+11; i++) {
	    				if (i%2==0)      
	    					return;  // ������ֻʣ������
	    					System.out.printf(Thread.currentThread().getName()+"return��ϰ�������:%s\n",i);					
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
