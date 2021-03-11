package com.yzy.text;

import java.io.FileOutputStream;

public class Text67OOP45FileOutputStream {
public static void main(String[] args) {
	int b;
	byte buffer[] = new byte[100];
	try {
		System.out.println("输入一行文本并存入磁盘");
		b = System.in.read(buffer);   //System.in.read()  可以键盘输入读出
		FileOutputStream f = new FileOutputStream("d:\\abc.txt");
		f.write(buffer, 0, b);                //写入
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("no");
	}
}
}
