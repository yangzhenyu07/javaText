package com.yzy.text;

import java.util.StringTokenizer;

/*
 * �ַ���������
 * */
public class Text17StringTokenizer {
	public static void main(String[] args) {
		String str ="I. love china ,do you ?";                        // �пո�
		StringTokenizer   token = new StringTokenizer(str,"., ");     //�ַ���������  �пո�
		int count = token.countTokens();         //  ��һ���м�������
		while (token.hasMoreTokens()) {            //hasMoreTokens()   ��ɹһ�����˼
			String temp = token.nextToken();
			System.out.println(temp+" ");
			System.out.println("��ʣ"+token.countTokens()+"������");
		}
		System.out.println("һ�����ٵ��ʣ�"+count);
	}

}
