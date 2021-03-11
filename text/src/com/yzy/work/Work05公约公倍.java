package com.yzy.work;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 输入两个正整数m和n，求其最大公约数和最小公倍数
 * */
class Min1{
static int min(int ss,int sc){
	int j = 0;
	for (int i = 0;i<ss*sc; i++) {
		if (i%ss==0&&i%sc==0) {
		 j =i;
		}
	}
	return j;                                    //return 直接跳出
}
}
public class Work05公约公倍 {
public static void main(String[] args) {
	System.out.println("请输入两个正整数！！！");
	int[]a = new int[5000];
	Scanner s = new Scanner(System.in);
	Scanner s1 = new Scanner(System.in);
	int ss = s.nextInt();
	int sc = s1.nextInt();
	int st = Math.min(ss, sc);
	for (int i = 1; i < st; i++) {
		if (ss%i==0&&sc%i==0) {
			for (int j = 0; j < a.length; j++) {
				a[j]=i;			
			}			
		}
	}
	Arrays.sort(a);
	System.out.println("最大公约数："+a[0]);
	System.out.println("最小公倍数："+Min1.min(ss,sc));
}
}
