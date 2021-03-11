package com.yzy.text;

import org.omg.CORBA.Request;

/*
 * String ----  各种对比
 * &与&&的区别
 * 相同点：当两边的结果都为true的时候，整个运算结果才为true
 * 不同点：&&具有短路的功能，当第一个表达式为flase时，后面的表达式就不执行
 * 
 * */
public final class Text13equals {
	public static void main(String[] args) {
		String s1,s2,s3,s4,s5,s6,s7,s8,s9;   //声明9个对象
		s1 = new String("aaaaaa");         //new 分配内存
		s2 = new String("bbbbbbb");    
		s3 = new String("ccccc  cccc第三");
		s4 = new String("c");
		s5 = new String("aaaaaab");
		s6 = new String("三");
		s7 = "li";
		s8 = "li";                 
		s9 = " li";           // 字符串中空格也算字符
		
		System.out.println(s1.equals(s5));      //true
		System.out.println(s1 == s5);           //false
		System.out.println(s3.startsWith(s4));   //startsWith()看首    true
		System.out.println(s3.endsWith(s6));     //endsWith()看尾    true
		System.out.println(s7 == s8);              //   true
		// == 既看内容也看内存地址是否相同
		System.out.println(s8 == s9);             //false
		System.out.println(s3.length());
		
	
	}

}
