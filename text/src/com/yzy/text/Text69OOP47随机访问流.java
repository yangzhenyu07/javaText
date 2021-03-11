package com.yzy.text;

import java.io.RandomAccessFile;

/*
 * 随机访问流  RandomAccessFile  既不是输入流也不是输出流的子类  但是
 * 即可创建输入流又可以创建输出流
 * 1、RandomAccessFile  (String name,String mode)    rw代表读写
 * 2、RandomAccessFile(File file,String mode)
 * long getFilePointer() 获取文件当前指针
 * void seek (long pos)移动指针到指定位置
 * */
public class Text69OOP47随机访问流 {
public static void main(String[] args) {
	RandomAccessFile in_and_out = null;
	int[] data = {1,2,3,4,5,6,7,8,9,10};
	try {
		in_and_out = new RandomAccessFile("F:\\Test\\abc.txt", "rw");  // rw代表读写
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("no");
	}
	try {
		for (int i = 0; i < data.length; i++) {
			in_and_out.writeInt(data[i]);
		}
		for (long i = data.length-1; i>=0;i--) {
			in_and_out.seek(i*4);   //一个整型占4个字节
			System.out.println(","+in_and_out.readInt());
		
		}
		in_and_out.close();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("no");
	}
}
}
