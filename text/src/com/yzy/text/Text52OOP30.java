package com.yzy.text;

import java.io.IOException;

/*
 * �ַ�������ֵ���͵��໥ת��
 * public static int parseInt(String str)          �ַ���ת����
 * public static byte parseByte(String str)      �ַ���ת�ֽ�
 * public static short parseShort(String str)     ת������
 * public static long parseLong(String str)      ת������
 * public static double parseDouble(String str)    ...
 * public static float parseFloat(String str)          ...
 * */
public class Text52OOP30 {
public static void main(String[] args) {
	double n,sum=0;
	for (int i = 0; i < args.length; i++) {

		int j =Integer.parseInt(args[i]);
		sum+=j;
	}
	n = sum/args.length;
	System.out.println(n);
}


}
