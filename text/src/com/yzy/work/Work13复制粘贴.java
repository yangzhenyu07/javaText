package com.yzy.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制粘贴文件
 * */
public class Work13复制粘贴 {
public static void main(String[] args) throws IOException {
	
  int b1;
	byte b []= new byte[1024];   // 缓冲区 
	File f = new File("D:\\acb.txt");
	File f1 = new File("F:\\Test\\acb.txt");
	f.createNewFile();
	FileInputStream fis = new FileInputStream(f1);
	while ((b1=fis.read(b,0,500))!=-1) {
		String s = new String(b,0,b1);   
		System.out.println(s);
	}
	fis.close();
	FileOutputStream fos = new FileOutputStream(f);
	   fos.write(b,0,500);
	   	//	f.delete();
	 
	  
	   
}
}
