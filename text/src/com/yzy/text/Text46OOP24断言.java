package com.yzy.text;
/*
 * 断言  捕捉假设  简化测试和调试
 * 断言就是一条语句 对boolean表达式进行检查
 * 1、assert Exception
 * 2、assert Exception1： Exception2
 * 如果结果为false 出现一个AssertionError ,Exception1必须是boolean型  ， Exception2作用：任何能产生值的内容(生成字符串信息)
 * 编译之后 Java 名.class -ea  启动断言用的
 * String getMessage（） 获取异常类对象的信息
 * String toString（）   返回描述当前Exception类的信息字符串
 * printStackTrace（） 打印异常类调用的堆栈路径
 * 
 * */
public class Text46OOP24断言 {
/*
 * 程序有瑕疵
 * */
public static void main(String[] args) {
	//缺少启动断言的程序
	int argslength= args.length;
	assert(args.length>0);
	for(String s:args){
		System.out.println(">"+s);
	}
	
}
//启动断言的程序：
static{
	boolean assertEnabled=false;
	assert assertEnabled = true;
	if (!assertEnabled) {
		throw new RuntimeException("断言被开启");
	}
}
}
