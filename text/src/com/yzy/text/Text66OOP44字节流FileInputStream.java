package com.yzy.text;

import java.io.File;
import java.io.FileInputStream;

/*
 * 字节流
 * java.io.InputStream    抽象  输入
 * java.io.OutputStream 抽象  输出
 * InputStream  完成从输入流当中读取数据功能
 * int read() 从输入数据流中读取一个字节
 * void close() 关闭输入流
 * int read(byte [] b)  从输入数据流中读取数据，放入字节数组b当中
 * int read(byte[] b  ,int off  ,int len)从输入数据流中输入长度为len的字节放入数组b的off位置上
 * FileInputStream        文件输入流
 * (1)创建文件输入流
 *  FileInputStream   (String name)
 *   FileInputStream   (File file)           下造型
 * (2)IOException
 * (3)从输入流中读取字节
 *   FileOutputStream   (String name)
 *   FileOutvputStream   (File file)           下造型
 * OutputStream  完成从输出流中写入数据功能
 *void  write(byte [] b)  写入数据流字节放入数组b当中
 *void  read(byte[] b  ,int off  ,int len)从数据流中写入长度为len的字节放入数组b的off位置上
 *void write() 写入一个字节到数据流
 *void flush()  强制输出数据流到指定外部设备
 *FileOutputStream       文件输出流
 *
 * */
public class Text66OOP44字节流FileInputStream {
	public static void main(String[] args) {
		int b;
		byte tom[] = new byte[25];
		try {
			File f= new File("F:\\abc.txt");
			//f.createNewFile();
			FileInputStream readfile = new FileInputStream(f);
			while ((b=readfile.read(tom,0,25))!=-1) {//通过循环读取字节存取字节数组
				String s = new String(tom,0,b);   //转出字符串
				System.out.println(s);
				
			}
			readfile.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("no");
		}
	}
}
