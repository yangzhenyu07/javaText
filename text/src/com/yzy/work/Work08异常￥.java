package com.yzy.work;

import java.util.Scanner;

/* 
 * 1、java中异常处理机制的过程
 * try{Java语句块}catch（异常类型 变量）{异常处理的语句块}finally{Java语句块}
 * 2、如何抛出系统预定义异常  
 *  catch捕捉后抛出
 * 3、什么情况下方法头必须声明可能抛出的异常
 *      IOExcetion
 * 4、try 语句中有多个catch 这些子句的先后顺序对程序的执行效果有何影响
 *     没影响
 * 5、一个方法产生了一个异常  该方法一点要处理该异常  不处理的话如何操作
 *     运行出错，会提示出异常状态
 * 6、编写一个自定义的异常  当除数为负数时  抛出
 * */
class My extends Exception{
	public My(){
		System.out.println("除数不能为零");
	}
}
	
public class Work08异常￥ {
public static void main(String[] args) throws My {
	Scanner a = new Scanner(System.in);
	double a1 = a.nextDouble();
	Scanner b = new Scanner(System.in);
	double b1 = b.nextDouble();
	if (b1<0) {
		throw new My();
	}else
	{
		System.out.println(a1/b1);
	}
}
}
