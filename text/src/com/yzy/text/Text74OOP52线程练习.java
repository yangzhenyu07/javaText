package com.yzy.text;
/*
 * ������   ������� ������˯����
 * �����ε���ͷ��ȼ�˿��� �����������λ���˯��
 * �����Ż��� �����λ�û��
 * ����Խ��Խ��
 * ����������
 * �����α�������������
 * �����ϵĻ������� ����̫����Σ�հ�
 * �ĸ��̣߳����߳�  ������  �� ������
 * ����try����{}catch����{}
 * */
class Text000 implements Runnable {
    Thread  yuwentao,fire,alarm; //yuwentao ������  fire �� alarm ������
    long time = 0;
    Text000(){
    	yuwentao = new Thread(this);
    }
	public void run() {	
		while (true) {
			if (Thread.currentThread() == yuwentao) {
				System.out.println("������   ������� ������˯����");
				try {
					fire = new Thread(this);
					fire.start();                          //���߳��Ŷ�
					Thread.sleep(1000*60*60);                 //˯��
				} catch (InterruptedException e) {
					System.out.println("�����α�������������");
					fire.interrupt();             //����				
				}
				return;
			}else if(Thread.currentThread() == fire){
				if (time == 0) {
					time = 2000;
					try {
						Thread.sleep(time);
						
					} catch (Exception e) {
						System.out.println(e);
					}
				}else if(time>0&&time<3000){
					System.out.println("�����Ż��� �����λ�û��");
					time = 4000;
					try {
						Thread.sleep(time);          //����4��
					} catch (Exception e) {
						System.out.println(e);
					}
				}else if(time>3000){
					System.out.println("����Խ��Խ��");
					alarm = new Thread(this);
					alarm.start();                    //�������߳̿�ʼ�Ŷ�
					try {
						Thread.sleep(time);              //����4��
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("�����ϵĻ������� ����̫����Σ�հ�");
						return;
					}
				}
			}else if(Thread.currentThread() == alarm){          //currentThread()  ���ص�ǰ���е��̶߳���
				System.out.println("����������");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
				yuwentao.interrupt();                //����
				return;
			}
			
		} 
	}
    
}
public class Text74OOP52�߳���ϰ{
	public static void main(String[] args) {
		Text000 t = new Text000();
		t.yuwentao.start();
	}
}