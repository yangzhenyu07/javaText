package com.yzy.text;
class Student{
	int stuCode;
	String stuName;
	int  StuDeptCode;
	public Student() {

	}
	protected Student(int stuCode, String stuName, int stuDeptCode) {  //protected    �ܱ����ģ���һ��������Է���
		  
		this.stuCode = stuCode;
		this.stuName = stuName; 
		this.StuDeptCode = stuDeptCode;   
	}
	
	
}
public class Text31OOP09 {
public static void main(String[] args) {
	Student stu;              
	stu = new Student();               
	stu.stuName = "������";  
	Student stu1 = new Student(1001,"������",13);
	Student stu2 = stu;                                                 //stu2��stu ����һ���ڴ��ַ
	System.out.println(stu == stu2 );
	System.out.println(stu.equals(stu1));
}
}
