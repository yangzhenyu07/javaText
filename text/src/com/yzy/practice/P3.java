package com.yzy.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;           //���

public class P3 {
public static void main(String[] args) {
	int [] a = new int [6];
	List <Integer>list = new ArrayList <Integer>();
	for (int i = 1; i < 31; i++) {
		list.add(i);
		
	}
	for (int i = 0; i <6; i++) {
	int num =  new  Random().nextInt(30-i);        //���һ������ķ���
	int aa = list.get(num);
	list.remove(num);                        //remove ȥ��
	      a[i]  =aa;                //���鸳ֵ
	
	      
	}
	Arrays.sort(a);                          //���� a ����
	System.out.println(Arrays.toString(a));
}
}
