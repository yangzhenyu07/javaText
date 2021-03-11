package com.yzy.text;

import java.io.IOException;

/*
 * 字符串与数值类型的相互转换
 * public static int parseInt(String str)          字符串转整型
 * public static byte parseByte(String str)      字符串转字节
 * public static short parseShort(String str)     转短整型
 * public static long parseLong(String str)      转长整型
 * public static double parseDouble(String str)    ...
 * public static float parseFloat(String str)          ...
 * */
public class Text52OOP30 {
public static void main(String[] args) {
	double n,sum=0;
	for (int i = 0; i < args.length; i++) {

		int j =Integer.parseInt(args[i]);
		sum+=j;
	}
	n = sum/args.length;
	System.out.println(n);
}


}
