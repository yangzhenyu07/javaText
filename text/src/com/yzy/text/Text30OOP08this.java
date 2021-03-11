package com.yzy.text;
class Student6{
	int stucode;
	String stuname;
	void init(){                                         //赋值
		stuname = "杨镇宇";
		stucode = 10001;
	}
	public Student6() {
		this.init();
	}
	
	
}
public class Text30OOP08this {
public static void main(String[] args) {
	Student6 s = new Student6();
	System.out.println("学号："+s.stucode+"姓名："+s.stuname);

}
}
