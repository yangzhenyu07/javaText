package com.yzy.text;
/*
 *  System.gc();     垃圾回收机制         清内存用
 *  static                          类调类，实例调全部                       （实例变量就是普普通通的成员变量）
 *  static int a                 1、静态成员变量 2、类变量               （+static 后，实例变量变类变量）
 * */
class Student2{
	
	String stuName;
	String getName(){                                 //输出
		
		return stuName;
	}
	void setName(String str){                       //输入
		stuName = str;
	}
}
public class Text26OOP04gc {
public static void main(String[] args) {
	Student2 stu1, stu2;
	stu1 = new Student2();
	 stu1.stuName = "陈美宏";
	 stu2 = stu1;                                       // stu1和stu2公用一个内存空间
	 System.out.println("学生："+stu1.getName());
	 System.out.println("学生："+stu2.getName());
	 stu2.setName("范晶");
	 System.out.println("学生："+stu1.getName());
	 System.out.println("学生："+stu2.getName());
	 System.out.println(new Student2().getName());        //匿名对象  开辟新内存空间，因此输出为null
	 System.gc();          //垃圾回收机制         清内存用
}
}
