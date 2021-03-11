package com.yzy.text;
/*对象 的造型
 *   上转型对象  下转型对象 ：子类对象赋给父类对象，父类对象赋给子类对象
 *                                        如：A1 =a1;                     {class A{A1},class a{a1}}
 *                                              A A1 = new a();
 * 1、对象只能转换为有继承关系的子类和父类对象
 * 2、一个类的实例（对象）也是其所有基类的实例（）父类的对象
 * 上造型： 把一个子类的引用赋给父类变量  把父类的对象叫做子类对象的上转型对象
 * 下转型：把父类对象赋给子类对象  下造型满足的条件 父类对象必须是从子类对象向上造型过来的
 * 作用：可以使用父类的属性和方法（私有的）通过调用父类的对象来实现
 * 
 */
class Father1{
	
}
public class Text40OOP18上下造型 extends Father1 {
public static void main(String[] args) {
	Father1 f0 = new Father1();
	 Text40OOP18上下造型 d =new Text40OOP18上下造型();
		Father1  fo = d;                                                   //向上转型
		Text40OOP18上下造型 d1 = (Text40OOP18上下造型) f0;             //向下转型
		Text40OOP18上下造型 d2= (Text40OOP18上下造型) f0;              //向下转型
	Father1 f=new Text40OOP18上下造型();                             //上造型
	Text40OOP18上下造型 f1 = (Text40OOP18上下造型) new  Father1();      //（）强转、向下造型
	System.out.println();
}
}
