package com.yzy.work;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;

/*
 * 1、字节流和字符流的区别
 * 读写的时候，一个是按字节读写，一个是按字符读写
 * 2、简述FileInputStream流和FileReader流的read方法和write方法有何不同
 *   FileInputStream以字节方式读取   读出的是byte数组
 *   FileReader  把文件转换成字符流读入   读出的是char数组和 String 
 * 3、使用RandomAccessFile将一个文件的内容倒序输出
 * 4、如何使用ObjectInputStream和ObjectOutputStream实现对对象的读写操作
 * 必须使用继承 Serializable
 * 5、编写一个程序，实现对文本文件中的内容按行读出 并加以行号
 * 6、从键盘输入一个字符串，将其中的小写字母转换成大写字母  ，并保存到一个文件a.txt中
 * */
public class Work16RandomAccessFile倒序输出￥  {
public static void main(String[] args) throws IOException  {
	RandomAccessFile  raf = new RandomAccessFile("F:\\Test\\abc.txt","rw");
     long l= raf.length();   //小的进大的
     for (long j = l-1; j >=0; j--) {
    	 raf.seek(j);
    	 System.out.println(raf.readByte());
		
	}
     raf.close();
}
}
