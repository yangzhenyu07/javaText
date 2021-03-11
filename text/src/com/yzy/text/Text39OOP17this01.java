package com.yzy.text;
/*
 * final 既可以修饰类，又可以修饰方法和变量（最终的意思）
 * final修饰之后
 * 类----没有子类
 * 方法----不能重写
 * 变量---常量
 * ------------------------------------------*
 * String类没有子类就是final类
 * ------------------------------------------*
 * 多态：
 * 方法重载的返回值类型和修饰符可以不同
 
 * */
public class Text39OOP17this01 {
	String s ="123";
public void bb(String s){
		System.out.println(s);
		System.out.println(this.s);
		
	}
public static void main(String[] args) {
	//int [] a=new int[10];
	//int [] b=new int[8];
	//byte b =(byte)128;                 注意byte的取值范围
	//byte b1 =(byte)(-129);
   //b =a;
	//a[0] = 100;
	//int a =100,x,y;
	//x = ++a;
	//y =a--;
	 Text39OOP17this01  t = new Text39OOP17this01();
	 t.bb("abc");
	
	
}
}
