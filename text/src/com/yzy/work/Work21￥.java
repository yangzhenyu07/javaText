package com.yzy.work;
/*
 * 1���̵߳��������ڣ���������״̬���ת��
 * �½�  ������ ����  �ж�  ���� 
 * 2�������̵߳ķ����м���
 * ����
 * �̳� Thread��
 * ʵ��Runnable�ӿ�
 * 3��ʲô���߳�ͬ��
 * ���߳�֮��ͨ���߳�ͬ��������ִ��˳�򣬲���ͬ��ʱ����ĳ����Դ
 * 4������жϺͻָ��߳�ͬ��
 *   wait��Scnaner  �ж��߳�ͬ��   notify() ����
 * 5������ʦ  �����������ݽṹ���������׺������Ͽ�˯��������ʦ������������������
 * ���ջ���˯���������׽�������
 * 6������  ��÷÷ ���� �Ŷ��Ⱥ���Ʊ  5Ԫһ��    20Ԫ��������һ�ţ�,5����÷÷��,10����������2�ţ�
 *    ��ƱԱ����ֻ��5ԪǮ
 * */
class Tercher implements Runnable{
	Thread Ltercher,lilei ,wanggang;	
	public Tercher() {
		Ltercher = new Thread(this);
	}
	public void run() {
		while(true){
		if (Thread.currentThread()== Ltercher) {
			System.out.println(Thread.currentThread().getName()+"��������������ݽṹ�Σ�����");
			try {
				
				Ltercher.start();
				Thread.sleep(1000);
				System.out.println("���ݺ�");
				Thread.sleep(2000);
				System.out.println("�������׺���������˯��");
				Thread.sleep(1000);
				System.out.println("����ʦ��");
				Thread.sleep(1000);
				System.out.println("�Ͽ���");
				Thread.sleep(1000);
				System.out.println("�Ͽ���");
				Thread.sleep(1000);
				System.out.println("�Ͽ���");
				Thread.sleep(1000);
				lilei = new Thread(this);
				lilei.start();
				lilei.join();
				System.out.println("����ʦ��������ս�����");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			return;
		} else if(Thread.currentThread() == lilei){
                        
                        try {
                        	System.out.println("�������˵����ջ���˯��");
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
				System.out.println("���տ���������");
				Thread.sleep(1000);
				System.out.println("���ǰ����״���");
			} catch (Exception e) {
				// TODO: handle exception
			}
			return;
		}
		}
	}
	
}
	public class Work21�� {
	public static void main(String[] args) {
		Tercher t = new Tercher();
		t.Ltercher.start();
	}
	


	}

