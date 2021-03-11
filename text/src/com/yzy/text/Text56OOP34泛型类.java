package com.yzy.text;
/*
 * 泛型与集合框架
 * 泛型   建立具有类型安全的集合框架
 * 链表， 散列， 散列映射， 哈希   jdk1.5之后才支持
 * 如何定义一个泛型类
 * class 类名<泛型列表(E,K,A,T,F)>
 * A:
 * E:  任何类型
 * T:  指定类型
 * class Cone<E>{
 *              double height;
 *              E bottom;        //E相当于数据类型
 *              public Cone(E b)  //E相当于数据类型
 *              bottom = b;
 * }
 * 使用泛型类声明对象
 * Cone<Cricle> coneone;
 * coneone = new Cone<Circle>(new Circle());
 * */
/**
 * 锥类
 * */
class Cone<E>{                    
	double height;
	E bottom;                           //低
	public Cone(E bottom) {
		this.bottom = bottom;
	}
	public double computeVolume(){
		String  s = bottom.toString(); 
		double ss =Double.parseDouble(s);
		return 1.0/3.0*ss*height;
	}
}
/**
 * 圆锥底面积
 * */
class CircleA{
	double  radius, area;

	public CircleA(double r) {
		
		radius = r;
	}
	public String toString(){                           
		
		area=radius*radius*Math.PI;    //Math.PI           π的意思
		return  ""+area;           //double型转换成String型
	}
}
/**
 * 四角锥 底面积
 * */
class Rectangle{
	double sidA,sidB,area;

	public Rectangle(double sidA, double sidB) {

		this.sidA = sidA;
		this.sidB = sidB;
	}
	public String toString(){                       
		
		area =sidA*sidB;
		return ""+area;
	}
	
}
public class Text56OOP34泛型类 {
	public static void main(String[] args) {
		CircleA circle = new CircleA(10);
		Cone<CircleA> coneone = new Cone<CircleA>(circle);
		coneone.height = 30;
		System.out.println("圆锥体积："+coneone.computeVolume());
		Rectangle rectangle = new Rectangle(10, 20);
		Cone<Rectangle>  conetwo = new Cone<Rectangle>(rectangle);
		conetwo.height = 40;
		System.out.println("四角锥体积："+conetwo.computeVolume());
	}

}
