package com.yzy.text;

import java.io.File;
import java.io.FileInputStream;

/*
 * �ֽ���
 * java.io.InputStream    ����  ����
 * java.io.OutputStream ����  ���
 * InputStream  ��ɴ����������ж�ȡ���ݹ���
 * int read() �������������ж�ȡһ���ֽ�
 * void close() �ر�������
 * int read(byte [] b)  �������������ж�ȡ���ݣ������ֽ�����b����
 * int read(byte[] b  ,int off  ,int len)�����������������볤��Ϊlen���ֽڷ�������b��offλ����
 * FileInputStream        �ļ�������
 * (1)�����ļ�������
 *  FileInputStream   (String name)
 *   FileInputStream   (File file)           ������
 * (2)IOException
 * (3)���������ж�ȡ�ֽ�
 *   FileOutputStream   (String name)
 *   FileOutvputStream   (File file)           ������
 * OutputStream  ��ɴ��������д�����ݹ���
 *void  write(byte [] b)  д���������ֽڷ�������b����
 *void  read(byte[] b  ,int off  ,int len)����������д�볤��Ϊlen���ֽڷ�������b��offλ����
 *void write() д��һ���ֽڵ�������
 *void flush()  ǿ�������������ָ���ⲿ�豸
 *FileOutputStream       �ļ������
 *
 * */
public class Text66OOP44�ֽ���FileInputStream {
	public static void main(String[] args) {
		int b;
		byte tom[] = new byte[25];
		try {
			File f= new File("F:\\abc.txt");
			//f.createNewFile();
			FileInputStream readfile = new FileInputStream(f);
			while ((b=readfile.read(tom,0,25))!=-1) {//ͨ��ѭ����ȡ�ֽڴ�ȡ�ֽ�����
				String s = new String(tom,0,b);   //ת���ַ���
				System.out.println(s);
				
			}
			readfile.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("no");
		}
	}
}
