package com.yzy.text;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * 数据流
 * DateInputStream
 * DateInputStream(InputStream in)将创建的数据输入流指向一个由参数in指定的输入流
 * DateOutputStream
 * DateOutputStream(OutputStream in)将创建的数据输出流指向一个由参数in指定的输出流
 * close()
 * readBoolean()  读取一个boolean值    //不能读字符串
 * readInt()
 * readChar()
 * readFloat()
 * ..........
 * 	writeBoolean(Boolean n)  写入一个boolean值
 * writeBytes(String s)        写入一个字符串
 * writeChars(String s)
 * writeDouble(double n)
 * writeFloat(float n)
 * ..........
 * */
public class Text70OOP48数据流 {
public static void main(String[] args) {
	try {
		FileOutputStream  fos =new FileOutputStream("F:\\Test\\abc.txt") ;
		DataOutputStream outData= new DataOutputStream(fos);
		outData.writeInt(100);
		outData.writeLong(1234567890);  
		outData.writeFloat(3.121154545f);  //因为系统默认的是double，所以在float型数字后加f
		outData.writeBoolean(true);
		outData.writeDouble(456123.465477);
		outData.writeChars("hello World!!!");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("no");
	}
	try {
		FileInputStream  fis =new FileInputStream("F:\\Test\\abc.txt") ;
		DataInputStream inData= new DataInputStream(fis);
		System.out.println(inData.readInt());
		System.out.println(inData.readLong());
		System.out.println(inData.readFloat());
		System.out.println(inData.readBoolean());
		System.out.println(inData.readDouble());
		System.out.print(inData.readChar());

		char c;
		while ((c= inData.readChar()) != '\0') {
			System.out.print(c);
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("");
	}
}
}
