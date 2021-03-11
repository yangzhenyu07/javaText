package com.yzy.text;
/*
 * 接口：用处----就是为了补充Java中的多继承
 * 接口interface(也是类)   接口允许多继承
 * 类名 implements 接口名字，接口名........
 * 接口被定义之后不能直接使用，必须通过某个类来实现该接口 ，一个类可以实现多个接口
 * 一个类声明实现某个接口后必须重写该接口的全部方法
 * 接口中的方法都是public 被实现的类中也应该是public
 * 接口必须多态
 * */
interface interfaceA     {                                //创建一个接口 interfaceA
	int a = 1;
	void showA();                                           //不能有方法体-------接口也相当于抽象
}
interface interfaceB    {                               //创建一个接口 interfaceB
	int b = 1;
	void showB();                                          //不能有方法体-------接口也相当于抽象
}
interface interfaceC   {                               //创建一个接口 interfaceC
	int c = 1;
	void showC();                                       //不能有方法体-------接口也相当于抽象
}
class TextA implements interfaceA, interfaceB, interfaceC{
	public void showA(){                                 //相当于showA方法重写一次
		System.out.println("a ="+a);
	}
	public void showB(){                                 //相当于showB方法重写一次
		System.out.println("b="+a);
	}
	public void showC(){                                 //相当于showC方法重写一次
		System.out.println("c ="+a);
	}
}
public class Text42OOP20interface {
public static void main(String[] args) {
	TextA t= new TextA();
	t.showA();
	t.showB();
	t.showC();
}
}
