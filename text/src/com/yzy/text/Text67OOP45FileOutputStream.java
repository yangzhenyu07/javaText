package com.yzy.text;

import java.io.FileOutputStream;

public class Text67OOP45FileOutputStream {
public static void main(String[] args) {
	int b;
	byte buffer[] = new byte[100];
	try {
		System.out.println("����һ���ı����������");
		b = System.in.read(buffer);   //System.in.read()  ���Լ����������
		FileOutputStream f = new FileOutputStream("d:\\abc.txt");
		f.write(buffer, 0, b);                //д��
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("no");
	}
}
}
