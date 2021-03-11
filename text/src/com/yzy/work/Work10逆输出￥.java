package com.yzy.work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*1、编写一个程序 链接两个字符串 得到一个新串 并输出 （用concat） 
 *逆序输出
 *2、删除字符串中全部的数字
 *3、计算某年某日  到某年某月某日的天数间隔  键盘输入
 * */
public class Work10逆输出￥ {
public static void main(String[] args) {
	
     List<Character> list = new ArrayList<Character>();
	  System.out.println("请输入第一条：");
	Scanner s = new Scanner(System.in);
	String  g = s.next().toString();
	System.out.println("请输入第二条：");
	Scanner s1 = new Scanner(System.in);
	String gg = s1.next().toString();
	System.out.println("第一条加第二条为：");
	String ggg = g.concat(gg);
	for (int j =0  ; j <ggg.length(); j++) {
		list .add(ggg.charAt(j)) ;
	}
		System.out.println(list.toString());
		System.out.println("逆序输出为：");
		for (int i = ggg.length()-1; i >=0 ; i--) {   //i=ggg.length() 所以多了一个
			list.add(ggg.charAt(i));
		}
		System.out.println(list.toString());
	
}
}
