package com.yzy.text;

import org.omg.CORBA.Request;

/*
 * String ----  ���ֶԱ�
 * &��&&������
 * ��ͬ�㣺�����ߵĽ����Ϊtrue��ʱ��������������Ϊtrue
 * ��ͬ�㣺&&���ж�·�Ĺ��ܣ�����һ�����ʽΪflaseʱ������ı��ʽ�Ͳ�ִ��
 * 
 * */
public final class Text13equals {
	public static void main(String[] args) {
		String s1,s2,s3,s4,s5,s6,s7,s8,s9;   //����9������
		s1 = new String("aaaaaa");         //new �����ڴ�
		s2 = new String("bbbbbbb");    
		s3 = new String("ccccc  cccc����");
		s4 = new String("c");
		s5 = new String("aaaaaab");
		s6 = new String("��");
		s7 = "li";
		s8 = "li";                 
		s9 = " li";           // �ַ����пո�Ҳ���ַ�
		
		System.out.println(s1.equals(s5));      //true
		System.out.println(s1 == s5);           //false
		System.out.println(s3.startsWith(s4));   //startsWith()����    true
		System.out.println(s3.endsWith(s6));     //endsWith()��β    true
		System.out.println(s7 == s8);              //   true
		// == �ȿ�����Ҳ���ڴ��ַ�Ƿ���ͬ
		System.out.println(s8 == s9);             //false
		System.out.println(s3.length());
		
	
	}

}
