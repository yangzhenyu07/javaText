package com.yzy.text;

import java.io.File;
import java.io.IOException;

/*
 * IO流  计算机中运动的序列
 * 1、字节流 Byte Stream
 *2、字符流   Character Stream
 *IO流层次结构
 *Object:
 *1、java.io.File     文件类  抽象类  主要处理磁盘文件相关信息  
 *2、Java.io.InputStream  输入流    抽象类 处理字节
 *3、Java.io.OutputStream  输出流    抽象类 处理字节
 *4、java.io.Reader        读取流  抽象  处理字符
 *5、java.io.Write           写入流  抽象  处理字符
 *6、java.io.RandomAccessFile   随机访问文件流
 *-----------------------------------------------------------------
 *
 * */
public class Text62OOP40IO流 {
public static void main(String[] args) {
	File f = new File("d:\\abc.txt");
	File f1 = new File("f:\\yyyyyyyyyyyyyyyyyyyy\\text.text");
	System.out.println(f);
	System.out.println(f1);
	try {
		f.createNewFile();    
		//f1.createNewFile();      //因为找不到yyyyyyyyyyyyyyyyyyyy文件，所以无法创建
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}














