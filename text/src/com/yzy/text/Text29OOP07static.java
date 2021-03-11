package com.yzy.text;
/*
 * 静态代码块：
 * 静态代码块：是在类中独立于类成员的static语句块，可以有多个，位置可以顺便放，
 * 它不在任何的方法体重， jvm加载类时会执行这些静态代码块， 如果静态代码块有多个，
 * jvm将按照他们在类中出现的先后顺序执行，每个代码块只能执行一次
 * */
class Student5{
static{
		
		System.out.println("这是一个学生");
		stuName = "杨镇宇";
	}

static String stuName;
static String getName(){
	
	return stuName;
}
	
}
public class Text29OOP07static {
	public static void main(String[] args) {
		System.out.println(Student5.getName());      //类调类
	}
	
}
