package com.yzy.text;
/*
 * final �ȿ��������࣬�ֿ������η����ͱ��������յ���˼��
 * final����֮��
 * ��----û������
 * ����----������д
 * ����---����
 * ------------------------------------------*
 * String��û���������final��
 * ------------------------------------------*
 * ��̬��
 * �������صķ���ֵ���ͺ����η����Բ�ͬ
 
 * */
public class Text39OOP17this01 {
	String s ="123";
public void bb(String s){
		System.out.println(s);
		System.out.println(this.s);
		
	}
public static void main(String[] args) {
	//int [] a=new int[10];
	//int [] b=new int[8];
	//byte b =(byte)128;                 ע��byte��ȡֵ��Χ
	//byte b1 =(byte)(-129);
   //b =a;
	//a[0] = 100;
	//int a =100,x,y;
	//x = ++a;
	//y =a--;
	 Text39OOP17this01  t = new Text39OOP17this01();
	 t.bb("abc");
	
	
}
}
