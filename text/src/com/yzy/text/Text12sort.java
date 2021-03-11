package com.yzy.text;
/*
 * 数组
 * 用sort排序
 * 去掉一个最高分一个最低分求平均
 * 
 * */

import java.util.Arrays;
import java.util.Scanner;

public class Text12sort {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double score[] = new double [10];
	double sum = 0 ;   //总和
	for (int i = 0; i < score.length; i++) {
		System.out.println("请第"+(i+1)+"位评委打分");
		score[i] = sc.nextDouble();                        //值导入数组里
	}
	Arrays.sort(score);                       //数组排序   sort方法是为了给数组进行升序排序
	System.out.println("去掉一个最高分"+score[9]);
	System.out.println("去掉一个最低分"+score[0]);
	for (int i = 1; i < score.length-1; i++) {
		    sum=sum+score[i];
	}
	System.out.println("该选手最后的平均分"+sum/8);
	
	
	
}
}
