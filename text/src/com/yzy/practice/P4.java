package com.yzy.practice;

public class P4 {
public static void main(String[] args) {
	char[] v={'1','2','3','4','5','6','7','8','9'};          //String  是字符（串）
	char a = '1';            // a是变量，基本数据类型
	char b ='c';
	Character ch  =Character.valueOf(a);          //  利用包装器类中的静态valueOf方法，将字符a转换成相应包装类的对象
	Character ch1 = new Character(b);              //生成一个对象，添加一个为b的参数
	int x =0;
	Integer it = new Integer(x);
	int y = Integer.valueOf(x);                  //利用包装器类中的静态valueOf方法,添加一个变量y
	System.out.println(ch.isDigit(a));                  //是否为数字
	System.out.println(ch.isLetter(a));               //是否为英文字母
	System.out.println(ch1.isUpperCase(b));         //是否为大写
	System.out.println(ch.isLowerCase(b));        //是否为小写
	System.out.println(ch1.isWhitespace(b));            //是否为空格、换行
 }
}
