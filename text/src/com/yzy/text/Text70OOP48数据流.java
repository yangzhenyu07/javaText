package com.yzy.text;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * ������
 * DateInputStream
 * DateInputStream(InputStream in)������������������ָ��һ���ɲ���inָ����������
 * DateOutputStream
 * DateOutputStream(OutputStream in)�����������������ָ��һ���ɲ���inָ���������
 * close()
 * readBoolean()  ��ȡһ��booleanֵ    //���ܶ��ַ���
 * readInt()
 * readChar()
 * readFloat()
 * ..........
 * 	writeBoolean(Boolean n)  д��һ��booleanֵ
 * writeBytes(String s)        д��һ���ַ���
 * writeChars(String s)
 * writeDouble(double n)
 * writeFloat(float n)
 * ..........
 * */
public class Text70OOP48������ {
public static void main(String[] args) {
	try {
		FileOutputStream  fos =new FileOutputStream("F:\\Test\\abc.txt") ;
		DataOutputStream outData= new DataOutputStream(fos);
		outData.writeInt(100);
		outData.writeLong(1234567890);  
		outData.writeFloat(3.121154545f);  //��ΪϵͳĬ�ϵ���double��������float�����ֺ��f
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
