package com.yzy.text;
/*
 * 方法：
 * 返回值类型  方法名 （参数列表） {
 * 方法体
 * }
 * 看程序先从主方法看
 * 构造方法 类的构造器
 * 1、名与类名相同
 * 2、构造方法无返回值
 * 3、构造方法主要作用，完成类的实列化（对象的创建）初始化操作
 * 4、构造方法只能通过new运算符来调用  不能通过类或对象调用
 * 5、一个类可以定义多个构造方法，根据传递给构造方法的参数数目和类型 系统自动的选择
 * 6、作用：为每个新建的对象赋初始值
 * 创建对象
 * 1、声明对象    2、创建对象并初始化
 * 类名 对象名 = new 类的构造方法（）；
 * */
public class Text23OOP01 {
int stu_code;
String stu_name;                                               //成员变量初始化一般没值，一般靠方法来赋值
String deptName;


int getStudentcode(){                                          //定义一个空叁
	
	return  stu_code;
			
}
boolean  setStudentcode(int studentcode){           //int studentcode  定义的局部变量
	if (studentcode >0) {
		stu_code = studentcode;
		return true;
		
	}else{
		return false;
		
	}
}
}
