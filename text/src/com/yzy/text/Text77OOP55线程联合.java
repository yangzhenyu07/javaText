package com.yzy.text;
/*
 * �߳����� join (long mill,int namos) 
 *  mill  ����
 * namos  ����
 * tourist.setName �����߳�����
 * */
class ThreadjoinTest implements Runnable{
	Thread tourist,policeoffice;               // tour �ο�,  policeoffice �����

	public ThreadjoinTest() {
		tourist = new Thread(this);
		tourist.setName("������");
		
	}
	@Override
	public void run() {
		if (Thread.currentThread() == tourist) {
			System.out.println("������ƻ�ȥ�������Σ���������Ҫȥ����ְ����ա�");
			try {
				Thread.sleep(1000);
				policeoffice = new Thread(this);
				policeoffice.start();
				policeoffice.join();                               //***�߳�����     �������߳�ͣ����������
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			System.out.println("�������õ����գ�����ȥǩ֤�ˣ�׼������"); 
		}else if(Thread.currentThread() == policeoffice){
			try {
				System.out.println("�������˾������д�����");
				Thread.sleep(1000);
				System.out.println("����.......");
				Thread.sleep(1000);
				System.out.println("����������������");
				Thread.sleep(1000);
				System.out.println("���ͨ�������15���ȡ��");
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}	
	}
}
public class Text77OOP55�߳����� {
	public static void main(String[] args) {
		ThreadjoinTest  tjt = new ThreadjoinTest();
		tjt.tourist.start();
	}

}
