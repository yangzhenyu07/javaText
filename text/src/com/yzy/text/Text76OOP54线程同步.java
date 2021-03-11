package com.yzy.text;
/*
 * �߳�ͬ��  synchronized     (ͬ��ʱ �� sleep��������ʹ)
 *   ֻ��ʹ  wait()���� notifyAll()���� ʹ���е�writ������  ���ж������
 *   notify()����  �����߳�
 *   �������߳�ͬ��������ķ���  ��Щ�߳�ͬ�������в�����Ҫ��Щ����
 * */
class Account{                                         //ͬ���õķ���
	double balance;        //����
	public synchronized void setmoney(double money){
		balance = balance +money;
		System.out.println("���������"+money+"Ԫ���˻���"+balance+"Ԫ");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		notifyAll();
	}
	public synchronized void getmoney(double money){   //ͬ�����
		while (balance < money) {
			System.out.println("�˻�����");
			try {
				wait();                        //��Ϊͬ��  ��   ���Բ�����sleep()��ֻ����wait()
			} catch (Exception e) {	
				System.out.println(e);
			}
		}
		balance = balance - money;
		System.out.println("������ȡ��"+money+"Ԫ���˻����"+balance +"Ԫ");
	}
}
class SynchroTest implements Runnable{
	Thread  yzy,cmh;
	Account account;  //�˻��� ����һ���˻�
	public SynchroTest() {
	yzy = new Thread(this);
	cmh = new Thread(this);
	 account = new Account();
	}
	public void run() {
		if (Thread.currentThread() == yzy) {
			for (int i = 0; i < 3; i++) {
				System.out.println("��������Ǯ�����������ʴ����ͥ����");
				account.setmoney(1000);
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}else if(Thread.currentThread() == cmh){
			for (int i = 0; i < 3; i++) {
				System.out.println("���������ּ������������ȡǮ����������");
				account.getmoney(800);
			}
		}	
	}
}
public class Text76OOP54�߳�ͬ�� {
public static void main(String[] args) {
	 SynchroTest  st = new SynchroTest();
	 st.yzy.start();
	 st.cmh.start();
}
}
