package com.yzy.work;

import java.rmi.server.Operation;

/*
 * ���� ���  Lily ����
 * Lily �������Ӳ��÷�  10000Ԫ
 * Lily ֻ�ܵ����׺������֮��
 * �����ڼ�������Ϣ��1����  ����һ������
 * 
 * */
class Company implements Runnable{ //����Runnable�ӿڣ������߳�
	int account = 200;               //��λΪ��
	public void run(){
		if (Thread.currentThread().getName().equals("���")) {
			System.out.println("������ں���");
			Operation(300);             //��λΪ��
		}else if(Thread.currentThread().getName().equals("����")){
			System.out.println("����������");
			Operation(1);               //��λΪ��
		}
	}

public synchronized void Operation(int amount){
	if (Thread.currentThread().getName().equals("���")) {
		account = account+ amount;
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println("���ں��㣬���Ե�");
				Thread.sleep(1000);
				
			}
			System.out.println("Ŀǰ��������"+account+"�򣬺ȱ�������Ϣһ��");
			Thread.sleep(1000*10);
			System.out.println("��������");
			Thread.sleep(1000);
			System.out.println("�µ׺������");
		} catch (Exception e) {
	  	System.out.println(e);
		}
	}else if(Thread.currentThread().getName().equals("����")){
		account = account - amount;
		System.out.println(Thread.currentThread().getName()+"����"+amount+"��Ԫ���˻�����"+account+"��Ԫ");
		
	}
}
}
public class Work20�߳���ϰ {
public static void main(String[]  args) {
	Company com = new Company();
	Thread  lilei,Lily;
	lilei = new  Thread(com);
	Lily = new Thread(com);
	lilei.setName("���");
	Lily.setName("����");
	lilei.start();
	Lily.start();
}
}
