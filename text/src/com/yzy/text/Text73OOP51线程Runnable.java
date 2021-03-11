package com.yzy.text;
import java.awt.Graphics;
import java.util.Date;
/*
 * С����û��������
 * -------------------------------------------------------------------------------------��
 * �̲߳����ķ���
 * 1��public void static() ʹ�߳̽���ȴ�����
 * 2��public void run()  ʹ�߳̽�������״̬
 * 3��public boolean isAlive() �ж��߳��Ƿ�������״̬
 * 4��public static void sleep(long mill)ʹ�������е��߳�����
 * 5��public static Thread currentThread() ���ص�ǰ���е��̶߳���
 * 6��public void interrupt() �����������ߵ��߳�
 * */
public class Text73OOP51�߳�Runnable extends java.applet.Applet  implements Runnable {   //java.applet.AppletС����ӿ�

      Thread  clockThead;
      public void start(){
    	  if (clockThead == null) {
			clockThead = new Thread(this,"Clock");                  //����һ���߳���Ķ���
			clockThead.start();
		}
      }
      public void run(){
    	  while (clockThead!=null) {
			repaint();              //�����ҳ�����еķ���
			try {
				clockThead.sleep(1000);               //����һ��
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
    	  
      }
	
		public void paint(Graphics g){
			Date now = new Date();
			g.drawString(now.toString(), 5, 10);   //5,10��������ֵ
		}
		public void stop(){
			clockThead.stop();
			clockThead = null;
		}
	

}
