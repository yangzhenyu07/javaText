package com.yzy.text;
/*
 * 对象也可以作为方法的址（地址）来传递，因为对象也是变量
 * */
class Student4{
 static int stucode;  

public Student4(int stucode) {                   //构造方法

	this.stucode = stucode;
}
static int getstucode(){                            //方法
	
	return stucode;
}
	
}
public class Text28OOP06 {
	public static void main(String[] args) {
	Student4 s = new Student4(1001);                 //利用构造方法来赋值
    System.out.println(Student4.getstucode());  //类调类        用构造方法赋值，之后用方法返回所赋的值
	}

}
