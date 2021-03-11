package com.yzy.work;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;

/*
 * 1���ֽ������ַ���������
 * ��д��ʱ��һ���ǰ��ֽڶ�д��һ���ǰ��ַ���д
 * 2������FileInputStream����FileReader����read������write�����кβ�ͬ
 *   FileInputStream���ֽڷ�ʽ��ȡ   ��������byte����
 *   FileReader  ���ļ�ת�����ַ�������   ��������char����� String 
 * 3��ʹ��RandomAccessFile��һ���ļ������ݵ������
 * 4�����ʹ��ObjectInputStream��ObjectOutputStreamʵ�ֶԶ���Ķ�д����
 * ����ʹ�ü̳� Serializable
 * 5����дһ������ʵ�ֶ��ı��ļ��е����ݰ��ж��� �������к�
 * 6���Ӽ�������һ���ַ����������е�Сд��ĸת���ɴ�д��ĸ  �������浽һ���ļ�a.txt��
 * */
public class Work16RandomAccessFile���������  {
public static void main(String[] args) throws IOException  {
	RandomAccessFile  raf = new RandomAccessFile("F:\\Test\\abc.txt","rw");
     long l= raf.length();   //С�Ľ����
     for (long j = l-1; j >=0; j--) {
    	 raf.seek(j);
    	 System.out.println(raf.readByte());
		
	}
     raf.close();
}
}
