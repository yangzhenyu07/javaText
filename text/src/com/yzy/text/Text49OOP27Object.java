package com.yzy.text;
/*
 * java�Ļ������
 * Object
 *1�� final Class getClass()   ����һ��Class����
 * 2��String  toString �÷������ض�����ַ�����ʾ
 * 
 * 
 * */

class Student20{
	double height,sex;  //��ߺ��Ա�
	public void sperk(){
		System.out.println("hello!!!");
	}
}
public class Text49OOP27Object {
public static void main(String[] args) {
	Student20 s =new Student20();
	System.out.println(s.toString());                     //Object���toSting   ������Ƿ���ĵ�ַ
}
}
