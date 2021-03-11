package com.yzy.text;

import java.io.IOException;
import java.util.Date;

/*
 * System   final 类  没有构造方法
 * 1、public static long currentTimeMilis()  返回自1970年1月1日到现在的时间间隔
 * 2、public  static void exit(int status)  终止当前jvm  status为0，正常终止，status非0时异常终止
 * */
public class Text48OOP26System {
public static void main(String[] args) {
	int b = 0;
	byte buffe[] = new byte[50];
	System.out.println("请输入");

		try {
			b = System.in.read(buffe);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}            //字节转整型
	
	String s = new String(buffe,0,b-2);//将字节数组转换成字符串   b-2 不带回车，两个字节等于一个字符，所以b-2,回车占一个字节
	System.out.println(s);                 //输出的按照字符串的方式读
	System.out.println(new Date(System.currentTimeMillis())); //输出当前时间
}
}
