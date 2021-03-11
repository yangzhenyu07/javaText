package com.yzy.text;
/*
 * 基本的数据类型封装
 * 特殊的：
 *int                  Integer
 *char               Character
 *数据类型与封装类型的转换
 *Byte(bytevalue)   用字节数据构造字节对象
 *Integer i = new Integer(50);                （对象）封装
 *        //int i = 50;                      变量
 *int a = i.intValue();                                    提取
 *-----------------------------
 *Character  char Character(char c)     // c是对象，不是变量
 *public static boolean isDigit(char ch) 判断参数ch是否是数字
 *public static boolean  isLetter(char ch) 判断参数ch是否是字母
 *public static boolean  isLowerCase(char ch)       是否大写   
 *public static boolean  isUpperCase(char ch)       是否小写
 *public static char  toLowerCase(char ch)   将字符ch  装换成小写
 *public static char  toUpperCase(char ch)   将字符ch  装换成大写
 *public static boolean  isSpaceCase(char ch)  判断是否为空格
 * */
public class Text51OOP29基本类型封装 {
public static void main(String[] args) {
	int x =5;
	char a[] = {'w','p','o','l','v'};
	Integer t =new Integer(x);
	Boolean b = new Boolean(true);  //封装
	boolean o = b.booleanValue();   //提取
	System.out.println(o);
	System.out.println(t);
	for (int i = 0; i < a.length; i++) {
		  if (Character.isLowerCase(a[i])) {
			  a[i] =Character.toUpperCase(a[i]);
			
		}else if(Character.isUpperCase(a[i])){
			a[i] = Character.toLowerCase(a[i]);
		}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
