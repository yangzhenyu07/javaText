package com.yzy.text;
/*
 * regionMatches( toffset, other, ooffset, len) 用法
 * */
public class Text14regionMatches {
public static void main(String[] args) {
	/*
	 * String st = "456778";
	int ss = Integer.parseInt(st);   //强制转换int类型
	System.out.println(st);
	 */
	int num =0;
	byte buffer[] = new byte[50];
	String input = "this is a apple";
	for (int i = 0; i < input.length(); i++) {
		if (input.regionMatches(i, "is", 0, 2)) {          //用在循环时比较多
			num++;                                                //算出现的个数
		}
	}
	/*regionMatches( toffset, other, ooffset, len)
	 *从当前字符串  toffset  开始截取长度为len 的子串，
	 *并将这个子串和参数 other 指定的子串进行对比，
	 *other子串是从ooffset指定的位置开始
	 * */
	System.out.println("is的个数为："+num);
}
}
