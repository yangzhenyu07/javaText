package com.yzy.text;

import java.io.IOException;
import java.util.Date;

/*
 * System   final ��  û�й��췽��
 * 1��public static long currentTimeMilis()  ������1970��1��1�յ����ڵ�ʱ����
 * 2��public  static void exit(int status)  ��ֹ��ǰjvm  statusΪ0��������ֹ��status��0ʱ�쳣��ֹ
 * */
public class Text48OOP26System {
public static void main(String[] args) {
	int b = 0;
	byte buffe[] = new byte[50];
	System.out.println("������");

		try {
			b = System.in.read(buffe);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}            //�ֽ�ת����
	
	String s = new String(buffe,0,b-2);//���ֽ�����ת�����ַ���   b-2 �����س��������ֽڵ���һ���ַ�������b-2,�س�ռһ���ֽ�
	System.out.println(s);                 //����İ����ַ����ķ�ʽ��
	System.out.println(new Date(System.currentTimeMillis())); //�����ǰʱ��
}
}
