package com.yzy.text;
/*
 * 访问权限
 * 1、public
 * 2、protected
 * 3、
 * 4、private
 * */	
class Student7{
	private   String stuName;
	private int stuNO;
	private static int count = 1000;
	String  getName(){
		
		return stuName;
	} 
	void setName(String str){                     //赋值用
		stuName = str;
	}
	int getstuNo(){
		return stuNO;
	}
	private int  num() {
		return count++;
	}
	 Student7(String stuname) {
		
		stuName = stuname;
		stuNO = num();              //调用私有方法，设置学号
	}
	 boolean isEqualTo(Student7 stu){                         //Student7 stu  ---------  传入的值是对象
		 if (stuName==stu.stuName&&stuNO==stu.stuNO) {
			return true;
		}else{
			return false;
		}
		 
	 }
	
	
}
public class Text33OOP11 {
public static void main(String[] args) {
	Student7 stu1= new Student7("杨镇宇"); 
	Student7 stu2= new Student7("陶雨恬"); 
	System.out.println(stu1.isEqualTo(stu2));
	System.out.println(stu1.getName()+stu1.getstuNo());
	System.out.println(stu2.getName()+stu2.getstuNo());                  //对象.方法
}
	 
}
