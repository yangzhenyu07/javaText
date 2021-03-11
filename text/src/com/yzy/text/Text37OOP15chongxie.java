package com.yzy.text;
/*
 * 方法重写：只能用在子类继承父类的方法时
 * 子类重写父类的方法注意
 * 1、子类方法不能降低父类的访问权限   可以相等和扩大
 * 2、子类方法不能抛出比父类更多的异常
 * 3、方法重写只存在于子类和父类之间
 * 4、父类的私有方法不能被重写
 * */
class Student9{
	String name;
	static int LengthofSchool = 4; //学制
	static int getLengthofSchool(){                              //方法的重写
		return LengthofSchool;
	}
	
}
class son01 extends Student9{
	public String tutor;    //导师
    public String spec_direction;  //方向	
    static int LengthofSchool = 3;
    static int getLengthofSchool(){                             
		return LengthofSchool;
	}
}
public class Text37OOP15chongxie {
public static void main(String[] args) {
	son01 s =new son01();
	System.out.println("直接访问父类的学制："+Student9.getLengthofSchool());  //方法的重写 利用类调类区分
	System.out.println("直接访问子类的学制："+son01.getLengthofSchool());
	
}
}
