package com.yzy.text;
/*
 * 继承的限制
 * 1、如果子类和父类在同一包中    子类能继承父类中public protected 缺省 的成员变量和方法
 * 2、子类和父类在不同的包中，  子类能继承父类中public protected  的成员变量和方法
 * 继承的原则
 * 1、子类只能有一个直接父类
 * 2继承具有传递性
 * b继承a c继承b    a是c的间接父类    b是c的直接父类
 * 3、继承不能循环
 * 4、Java中除了Object ,类之外剩下的类都有父类
 * 子类对象的构造 ：  当我们用子类对象的构造方法创造一个子类的对象时，子类的构造方法总是先调用父类的某一个构造方法，
 * 如果子类的构造方法没有指定父类的那个构造方法，子类就调用父类的默认的空叁构造方法
 * --------------------------
 * 
 * */
class Base{
    public int publicVarofBase;
    private  int  privateVarofBase;
    int defaultVarofBase;
    protected void methodofBase(){
    	
    }
}
class sub extends  Base{
	public void methodofSub(){
		publicVarofBase = 2 ;
		//privateVarofBase = 2;       继承不了privateVarofBase   因为privateVarofBase是私有的
		 defaultVarofBase = 2;
		 methodofBase();		
	}
}

public class Text35OOP13extends00 {
public static void main(String[] args) {
	sub s = new sub();
	s.publicVarofBase = 3;
	s.defaultVarofBase = 3;
	s.methodofBase();
	s.methodofSub();
	//s.privateVarofBase = 3;         调用不了 因为privateVarofBase是私有的
}
}
