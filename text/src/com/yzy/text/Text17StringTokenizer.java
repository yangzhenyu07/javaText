package com.yzy.text;

import java.util.StringTokenizer;

/*
 * 字符串分析器
 * */
public class Text17StringTokenizer {
	public static void main(String[] args) {
		String str ="I. love china ,do you ?";                        // 有空格
		StringTokenizer   token = new StringTokenizer(str,"., ");     //字符串分析器  有空格
		int count = token.countTokens();         //  看一看有几个单词
		while (token.hasMoreTokens()) {            //hasMoreTokens()   在晒一遍的意思
			String temp = token.nextToken();
			System.out.println(temp+" ");
			System.out.println("还剩"+token.countTokens()+"个单词");
		}
		System.out.println("一共多少单词："+count);
	}

}
