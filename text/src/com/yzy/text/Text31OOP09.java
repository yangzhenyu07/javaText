package com.yzy.text;
class Student{
	int stuCode;
	String stuName;
	int  StuDeptCode;
	public Student() {

	}
	protected Student(int stuCode, String stuName, int stuDeptCode) {  //protected    受保护的，在一个包里可以访问
		  
		this.stuCode = stuCode;
		this.stuName = stuName; 
		this.StuDeptCode = stuDeptCode;   
	}
	
	
}
public class Text31OOP09 {
public static void main(String[] args) {
	Student stu;              
	stu = new Student();               
	stu.stuName = "陈美宏";  
	Student stu1 = new Student(1001,"杨镇宇",13);
	Student stu2 = stu;                                                 //stu2和stu 共享一个内存地址
	System.out.println(stu == stu2 );
	System.out.println(stu.equals(stu1));
}
}
