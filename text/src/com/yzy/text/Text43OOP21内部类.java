package com.yzy.text;
/*
 * 内部类由于内部类被看做是类的成员，因此，内部类的修饰符与类成员的修饰符相似。。。。
 * 如何定义内部类
 * 外包类名.内部类名 对象名 = new 外包类名（参数）.内部类名（参数）；
 * 
 * */
class ClassA{
	private int x = 100;

   //InnerA innerA = new InnerA();
   
   public class  InnerA{                                 //内部类
		InnerA(){
			
			x = x+100;
			System.out.println("Hello！！！");
		}
		void show(){
			System.out.println("x="+x);
		}		
	}
}
public class Text43OOP21内部类 {
public static void main(String[] args) {
	ClassA j =new ClassA();
	ClassA.InnerA   i = new ClassA().new InnerA();  //创建一个外包类的内部类对象
	i.show();
}
}
