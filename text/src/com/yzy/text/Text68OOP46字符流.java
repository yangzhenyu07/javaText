package com.yzy.text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * �ַ�����
 * Reader  ��  �������������ж�ȡһ���ַ�
 * long skip(long n) ������������n���ַ�
 * void mark()    �����б��һ��λ��
 * void  reset()   �������б�ǵ�λ��
 * boolean ready ���������Ƿ�ɶ�ȡ
 * boolean markSupport () �������Ƿ�֧�ֱ�Ǻ͸�λ
 * void close()  �ر���
 * int read(char [] ch) ��ȡһ���ַ�����
 * int read(char[] b  ,int off  ,int len)�����������������볤��Ϊlen���ֽڷ�������b��offλ����
 * FileReader(String filepath)
 * FileReader(File obj)
 * BufferedReader           
 *  BufferedReader in = BufferedReader(new FileReader("abc.txt"));
 *  String s =in.readLine();
 * ----------------------------------------------------------------------------------------------------------------------------------------
 * Writer   ��  ������������ж�ȡһ���ַ�
 * void close () �ر������
 * void  write(char [] b)  д���������ַ���������b����
 *void  write(char[] b  ,int off  ,int len)����������д�볤��Ϊlen���ַ���������b��offλ����
 * void  write(int b)  д��һ���ַ�����������
 *void flush()  ǿ�������������ָ���ⲿ�豸
 *void  write(String s)���ַ����������
 *void write(String str,int off, int len)  ���ַ�����off���len�����ַ����������
 *FileWriter(String filepath)
 * FileWriter(String filepath,boolean append)           appendд��λ��
 * FileWriter(File obj)
 * BufferedWriter
 * */
public class Text68OOP46�ַ��� {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("d:t\\acb.txt");
			BufferedReader in = new BufferedReader(fr);
			char[] ch = new char[4];
			String str,s;
			int k = 0 ;
			while ((str =in.readLine())!=null) {
				if (str.startsWith("#")) {        //#��ͷ
					ch[k] = str.charAt(1);
					k++;
					System.out.println(str.subSequence(1, str.length()));//���
				}else{
					System.out.println(str);
				}
				
				System.out.println("��");
				for (int i = 0; i < k; i++) {
					System.out.println(ch[i]);
				}				
			}
			in.close();
		} catch (IOException e) {
			System.out.println("no");
		}
	}

}
