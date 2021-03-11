package com.yzy.text;
/*�������Ƕ� ��������ջ��
 * �߳�
 * ��Դ����ռ������ִ�еĹ���  ���߳�
 * ÿ������һ�ζ�ִ̬��Ч��  ����Ϊ����(���̱��̴߳�)
 * C/S   �ͻ���/������   ���õĶ�
 * JVM���и��̵߳�����   �Զ������߳�
 *  main��java����������Ҫ�����߳�
 *  �̵߳���������
 *  1���½�   �̶߳�����֮������½�״̬
 *  2������   ���߳�ռ�ü������Դʱ��������״̬   ���е�����(�Ƚ��ȳ���)
 *  3���ж�    ԭ��(1)������   ����Scanner
 *                           (2)���̵߳���������
 *                           (3)��Sleep(long mill)����   �߳̽�������  ��λ����
 *                           (4)��wait ()���� �ȴ�  ��join()����  ����
 *  4������
 *  �����̵߳ķ���
 *  1��Thread  �߳��� ֱ�Ӽ̳оͿ���
 *       public void run() ������д
 *  2��  ʵ��Runnable�ӿڴ����߳�  
 * */
class SimpleThread extends Thread{
	

	public void run() {

		for (int i = 0; i <3; i++) {
			System.out.println(getName()+i);         //getName()��ȡ�̵߳�����
			try {
				sleep((int)Math.random()*1000);  //0-1000           sleep()˯�ߵ���˼ ʹ�߳��ж�
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		System.out.println("������"+getName());
	}
	
}
public class Text72OOP50�߳�Thread {
 public static void main(String[] args) {
	SimpleThread one = new SimpleThread();
	one.setName("��һ");                                       //�����߳�
	one.start();                                                       //�߳�����   ʹ�߳̽������
	SimpleThread two = new SimpleThread();
	two.setName("�ڶ�");
	two.start();
}
}
