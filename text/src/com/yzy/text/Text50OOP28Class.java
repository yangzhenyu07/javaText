package com.yzy.text;

import java.lang.reflect.Field;

/*
 * Class
 * 1��public Field[] getDeclaredFields() �������ȫ������
 * 2��public Method[] getMethods() �������ȫ������
 * 3��public String getName() �����������
 * 4��public Package  getPackage() ���ذ���
 * 5�� final Class getClass()   ����һ��Class����
 * */

class Student13{
	int stu_code;
	String stu_name;
	int getstucode(){
		return stu_code;
	}
}
public class Text50OOP28Class {
public static void main(String[] args) {
	Student13 stu = new Student13();
	Class cs = stu.getClass();
	String classname = cs.getName();
	Field[] field = cs.getDeclaredFields();
	for (int i = 0; i < field.length; i++) {
		System.out.println(classname+"��ĵ�"+(i+1)+"������"+field[i].toString());
	}
}
}
