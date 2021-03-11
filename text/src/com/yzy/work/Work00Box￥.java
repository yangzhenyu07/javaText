package com.yzy.work;

import java.util.Scanner;

/*1、对象
 * 现实世界中实体在计算机逻辑中的映射和体现 ，对象同时还是类的具体实现
 * 2、什么是类 类包括哪些成员
 * 具有相同或相似属性或行为的对象的抽象，具有抽象化对象的模板    类包括方法和属性
 * 3、面向对象的特点
 * 封装 继承 多态 抽象
 * 4、类变量和实例变量的区别
 * 类变量是所有对象共有，其中一个对象将它的值改变，其他对象得到的就是改变后的结果，而实例对象则属于对象私有，其中一个
 * 对象将它改变，不影响其他对象
 * 5、设计一个Box类  length width height 三个属性  并具有下列方法
 * （1）、volume（）用来计算Box对象的体积
 * （2）、定义一个area（）方法计算Box的表面积
 * 6、设计一个计算器 实现加减乘除
 * 
 * 
 * */
class Box{
	double length;
	double width;
	double height;
	double volume;
	double area;
	static{
		 System.out.println("欢迎进入！！！");
		 System.out.println("请选择你要算的：");
		System.out.println("输入-1：体积");
		System.out.println("输入-2：面积");
	}
	void shuru(){
		
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		 length = s.nextDouble();
		 width = s1.nextDouble();
		 height = s2.nextDouble();
		
	}
	
	double volume(){
		volume = length*width*height;
		return volume;
	}
	double area(){
		area= 2*(length*width+width*height+length*height);
		return area;
	}
}
public class Work00Box￥ {
	public static void main(String[] args) {
		Box box =new Box();
		
		Scanner s = new Scanner(System.in);
		int ss = s.nextInt();
		
		switch (ss) {
		case -1:
			System.out.println("请输入长宽高");
			box.shuru();                  //给长宽高赋值
			System.out.println(box.volume());
			break;
         case -2:
        		System.out.println("请输入长宽高");
        	 box.shuru();
			System.out.println(box.area());
			break;

		default:
			System.out.println("请输入-1或-2");
			break;
		}
		
	}

}
