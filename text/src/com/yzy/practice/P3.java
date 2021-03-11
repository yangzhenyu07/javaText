package com.yzy.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;           //随机

public class P3 {
public static void main(String[] args) {
	int [] a = new int [6];
	List <Integer>list = new ArrayList <Integer>();
	for (int i = 1; i < 31; i++) {
		list.add(i);
		
	}
	for (int i = 0; i <6; i++) {
	int num =  new  Random().nextInt(30-i);        //添加一个随机的方法
	int aa = list.get(num);
	list.remove(num);                        //remove 去掉
	      a[i]  =aa;                //数组赋值
	
	      
	}
	Arrays.sort(a);                          //数组 a 排序
	System.out.println(Arrays.toString(a));
}
}
