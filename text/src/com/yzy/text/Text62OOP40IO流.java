package com.yzy.text;

import java.io.File;
import java.io.IOException;

/*
 * IO��  ��������˶�������
 * 1���ֽ��� Byte Stream
 *2���ַ���   Character Stream
 *IO����νṹ
 *Object:
 *1��java.io.File     �ļ���  ������  ��Ҫ��������ļ������Ϣ  
 *2��Java.io.InputStream  ������    ������ �����ֽ�
 *3��Java.io.OutputStream  �����    ������ �����ֽ�
 *4��java.io.Reader        ��ȡ��  ����  �����ַ�
 *5��java.io.Write           д����  ����  �����ַ�
 *6��java.io.RandomAccessFile   ��������ļ���
 *-----------------------------------------------------------------
 *
 * */
public class Text62OOP40IO�� {
public static void main(String[] args) {
	File f = new File("d:\\abc.txt");
	File f1 = new File("f:\\yyyyyyyyyyyyyyyyyyyy\\text.text");
	System.out.println(f);
	System.out.println(f1);
	try {
		f.createNewFile();    
		//f1.createNewFile();      //��Ϊ�Ҳ���yyyyyyyyyyyyyyyyyyyy�ļ��������޷�����
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}














