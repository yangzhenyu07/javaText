package com.yzy.text;
/*
 * this() 表示当前类的构造方法
 * super() 表示当前父类的构造方法
 * 无论是this还是super如果出现在构造方法中 必须是第一条语句
 * super 不能多次使用，比如super.super 这是错的
 * super.method()  调用父类的方法-------------------父类的私有不能调用
 * super.var            调用父类的成员变量-------------------父类的私有不能调用
 * 
 * 
 * */
class Student10{
	public int stu_no;
	public String stu_name;
	public String zhuanye;
	Student10(){
		System.out.print("创建一个学生");
	}
	Student10(String name){
		this();                                                 //调用当前类的空叁构造方法
		System.out.println(":"+name);
	}
	
}

public class Text38OOP16super extends Student10 {
       public String tutor;
       public String spec_direction;
	public Text38OOP16super(String name) {
		super(name);                                     //调用父类有叁的构造方法
		System.out.println("，他是一个小学生");
	}
	public Text38OOP16super(String name,String tutor, String direction) {
		this(name);                                         //调用当前类的有叁构造方法
		System.out.println("他们的导师："+tutor+"，他们的专业是："+direction);
		
	}
	public static void main(String[] args) {
		Text38OOP16super t = new Text38OOP16super("杨镇宇");
		Text38OOP16super t1 = new Text38OOP16super("张琪","范晶","计算机");
	}
	
       
}
