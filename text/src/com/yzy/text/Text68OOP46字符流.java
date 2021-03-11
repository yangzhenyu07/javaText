package com.yzy.text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 字符流：
 * Reader  ：  从输入数据流中读取一个字符
 * long skip(long n) 跳过数据流中n个字符
 * void mark()    在流中标记一个位置
 * void  reset()   返回流中标记的位置
 * boolean ready 测试流中是否可读取
 * boolean markSupport () 描述流是否支持标记和复位
 * void close()  关闭流
 * int read(char [] ch) 读取一个字符数组
 * int read(char[] b  ,int off  ,int len)从输入数据流中输入长度为len的字节放入数组b的off位置上
 * FileReader(String filepath)
 * FileReader(File obj)
 * BufferedReader           
 *  BufferedReader in = BufferedReader(new FileReader("abc.txt"));
 *  String s =in.readLine();
 * ----------------------------------------------------------------------------------------------------------------------------------------
 * Writer   ：  从输出数据流中读取一个字符
 * void close () 关闭输出流
 * void  write(char [] b)  写入数据流字符放入数组b当中
 *void  write(char[] b  ,int off  ,int len)从数据流中写入长度为len的字符放入数组b的off位置上
 * void  write(int b)  写入一个字符到数据流中
 *void flush()  强制输出数据流到指定外部设备
 *void  write(String s)将字符串输出到流
 *void write(String str,int off, int len)  将字符串从off起的len长度字符串输出到流
 *FileWriter(String filepath)
 * FileWriter(String filepath,boolean append)           append写入位置
 * FileWriter(File obj)
 * BufferedWriter
 * */
public class Text68OOP46字符流 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("d:t\\acb.txt");
			BufferedReader in = new BufferedReader(fr);
			char[] ch = new char[4];
			String str,s;
			int k = 0 ;
			while ((str =in.readLine())!=null) {
				if (str.startsWith("#")) {        //#开头
					ch[k] = str.charAt(1);
					k++;
					System.out.println(str.subSequence(1, str.length()));//输出
				}else{
					System.out.println(str);
				}
				
				System.out.println("答案");
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
