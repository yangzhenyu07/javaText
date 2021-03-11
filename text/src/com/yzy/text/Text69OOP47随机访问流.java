package com.yzy.text;

import java.io.RandomAccessFile;

/*
 * ���������  RandomAccessFile  �Ȳ���������Ҳ���������������  ����
 * ���ɴ����������ֿ��Դ��������
 * 1��RandomAccessFile  (String name,String mode)    rw�����д
 * 2��RandomAccessFile(File file,String mode)
 * long getFilePointer() ��ȡ�ļ���ǰָ��
 * void seek (long pos)�ƶ�ָ�뵽ָ��λ��
 * */
public class Text69OOP47��������� {
public static void main(String[] args) {
	RandomAccessFile in_and_out = null;
	int[] data = {1,2,3,4,5,6,7,8,9,10};
	try {
		in_and_out = new RandomAccessFile("F:\\Test\\abc.txt", "rw");  // rw�����д
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("no");
	}
	try {
		for (int i = 0; i < data.length; i++) {
			in_and_out.writeInt(data[i]);
		}
		for (long i = data.length-1; i>=0;i--) {
			in_and_out.seek(i*4);   //һ������ռ4���ֽ�
			System.out.println(","+in_and_out.readInt());
		
		}
		in_and_out.close();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("no");
	}
}
}
