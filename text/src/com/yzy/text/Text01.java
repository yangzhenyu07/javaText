package com.yzy.text;

public class Text01 {
public static void main(String[] args) {
	for (int i = 1; i <10; i++) {
		//System.out.println(i);
		for (int j = 1; j < 10; j++) {
		
			// System.out.println(i+"*"+j+"="+a);
			 System.out.printf("%d*%d = %2d",i,j,i*j);
			 // printf    %d ：代表当前位置输入字符串。\n ： 换行
		}
		System.out.println();
	}
}
}
