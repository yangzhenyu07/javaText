package com.yzy.text;
/*
 * �ַ���ת�ֽ�
 * */
public class Text18Stringbyte {
public static void main(String[] args) {
	char c[],b[];
	String s ="�й������";
	 c = new char[2];
	 b= s.toCharArray();                     //*****
	 s.getChars(2, 4, c, 0);                   //��ȡ�ַ���s���ӵ�2λ�ÿ�ʼ����4λ�ã��ŵ�����c���c��0λ�ÿ�ʼ
	 System.out.println(c);
	 System.out.println(b);
	 byte d[]="�����".getBytes();  //���ַ������������ת����һ���ֽ�����  
	 System.out.println("��ȡd�ĳ��ȣ�"+d.length);
	 String s2 = new String(d,0,2);            //һ�� ����ռ�����ֽ�    ����ʱ��     
	 System.out.println(s2);                       //�������һ����������
}
}
