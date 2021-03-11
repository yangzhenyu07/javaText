package com.yzy.text;

import java.math.BigInteger;

/*
 * Math类 数学
 * abs  绝对值
 * max 最大值
 * min 最小值
 * random  随机数 0--1
 * pow(double a,double b)返回a的b次幂
 * sqrt  平方根
 * log(double a)返回a的对数
 * asin 正弦
 * BigInteger         大整型
 * 
 * */
public class Text53OOP31Math {
public static void main(String[] args) {
	int b1 = 1616161616;
	BigInteger b2 = new BigInteger("131313131313131313131");
	BigInteger b3 = new BigInteger("131313131313131313131");
	System.out.println(b2.add(b3));    //两对象相加用.add
	System.out.println(b2.multiply(b3));  //两对象相乘用.multiply
	System.out.println(b2.divide(b3));     //两对象相除用.divide
	System.out.println(b2.subtract(b3));  //两对象相减 用.subtract
	System.out.println(b2.remainder(b3)); //两对象取余用.remainder
}
}
