package com.yzy.text;

import java.lang.reflect.Field;

/*
 * Class
 * 1、public Field[] getDeclaredFields() 返回类的全部属性
 * 2、public Method[] getMethods() 返回类的全部方法
 * 3、public String getName() 返回类的名字
 * 4、public Package  getPackage() 返回包名
 * 5、 final Class getClass()   返回一个Class对象
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
		System.out.println(classname+"类的第"+(i+1)+"个变量"+field[i].toString());
	}
}
}
