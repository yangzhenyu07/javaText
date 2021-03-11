package com.yzy.text;
/*
 * return的练习 ： 从方法和程序中返回到它的调用者
 * */
public class Text09return {
public static void main(String[] args) {
	boolean test = true;
	System.out.println("我被执行了");
	if (test) {
		return;    //跳出if循环    返回主语句  “我被执行了”
	} else {
       System.out.println("return执行之后");
	}
}
      int   ff(){                //定义一个ff方法
    	  int a = 0;
    	  return a;             // 返回 int 类型
    	  
      }
}
