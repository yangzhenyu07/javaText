package com.yzy.text;

import java.util.Scanner;

/*
 * �ػ��߳�  �����߳�  �����ڳ����������û��߳̽���ʱ�����̽��������ִ��
 * ����һЩ��Ӱ��ҵ���߼��Ĳ���
 * void setDaemon(boolean b)
 * */

public class Text78OOP56�ػ��߳�  extends Thread{
      
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
		Text78OOP56�ػ��߳� t = new Text78OOP56�ػ��߳�();
		t.setDaemon(true);   //�ػ��߳�
		t.start();
		System.out.println("���ػ��߳�"+t.isDaemon());  //isDaemon() �ж��Ƿ�Ϊ�ػ��߳�
		Scanner  sc = new Scanner(System.in);
		String ss = sc.next();
		System.out.println(ss);
		System.out.println("������������߳̽������ػ��߳̽���");
	}
}
