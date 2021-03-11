package com.yzy.text;
/*
 * 类调类
 * 什么情况下使用类变量和类方法
 * 1、如果方法的参数可以直接给定，不需要访问实例变量时；不希望创建对象时，该方法被声明为类方法
 * 2、如果方法仅仅访问类变量时可将其定义为类方法
 * （最好类调类，实例调实例）         
 * 
 * */
class Student3{
	int stucode;
	static String stuname = "陈美宏";             //加static后，变类变量
	Student3(int stucode) {
	   this.stucode = stucode;
	}
	
	
}
public class Text27OOP05 {
	public static void main(String[] args) {
		Student3 stu =new Student3(1001);              //因为你声明了有叁的构造函数，所以创建对象只能用有叁
		System.out.println(stu.stuname);
		Student3.stuname = "杨镇宇";                       //   类调类
		System.out.println(Student3.stuname);         //类调类
		System.out.println(stu.stuname);
		System.out.println(stu.stucode);
		
	}

}
