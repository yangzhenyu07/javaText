package com.yzy.text;
/*
 * ���߳��еĹ��������
 * 
 * */
class SavingBox implements  Runnable{
	double  balance; // ���        �����
	public void run(){
		int count = 0;
		while (true) {
			balance = balance +1000;
			count ++;   // ��Ǯ�Ĵ���
			try {
				System.out.println(Thread.currentThread().getName()+"��"+count+"�δ�Ǯ���������Ϊ"+balance+"Ԫ");
			      if (count == 3) {
					System.out.println(Thread.currentThread().getName()+"����"+count+"�Σ����´�Ǯ����");
					return;
				}
			       Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class Text75OOP53�̹߳��� {
	public static void main(String[] args) {
		SavingBox  sx = new SavingBox();
		Thread yzy = new Thread(sx);
		yzy.setName("������");
		Thread cmh= new Thread(sx);
		cmh.setName("������");
		yzy.start();
		cmh.start();
	}

}
