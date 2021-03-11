package com.yzy.text;
/*
 * java的基本类库
 * Object
 *1、 final Class getClass()   返回一个Class对象
 * 2、String  toString 该方法返回对象的字符串表示
 * 
 * 
 * */

class Student20{
	double height,sex;  //身高和性别
	public void sperk(){
		System.out.println("hello!!!");
	}
}
public class Text49OOP27Object {
public static void main(String[] args) {
	Student20 s =new Student20();
	System.out.println(s.toString());                     //Object里的toSting   输出的是分配的地址
}
}
