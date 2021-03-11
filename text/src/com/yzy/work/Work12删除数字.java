package com.yzy.work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 删除字符串中全部的数字
 * */
public class Work12删除数字 {
public static void main(String[] args) {

	
	System.out.println("请输入：");
	Scanner s = new Scanner(System.in);
	String sc = s.next().toString();	
    System.out.println("去除掉数字后："+ sc.replaceAll("\\d+", ""));	
	
}
}
