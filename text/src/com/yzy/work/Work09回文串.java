package com.yzy.work;

import java.awt.Checkbox;
import java.util.Scanner;

public class Work09回文串 {
public static void main(String[] args) {
	String str = null;
	System.out.println("判断是否为回文串");
	System.out.println("输入字符串：");
	Scanner sca = new Scanner(System.in);
	str= sca.nextLine();       //用链表模式接受
	if (isPailddrome(str)) {
		System.out.println("是回文串");
	}else{
		System.out.println("不是回文串");
	}
}

private static boolean isPailddrome(String check) {
	int low =0;
	int high = check.length()-1;
	while(low<high){
		if (check.charAt(low)!=check.charAt(high)) 
			return false;
			low++;         //头加
		    high--;          //尾减
	}
	return true;

}
}

