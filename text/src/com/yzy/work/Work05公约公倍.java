package com.yzy.work;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
 * ��������������m��n���������Լ������С������
 * */
class Min1{
static int min(int ss,int sc){
	int j = 0;
	for (int i = 0;i<ss*sc; i++) {
		if (i%ss==0&&i%sc==0) {
		 j =i;
		}
	}
	return j;                                    //return ֱ������
}
}
public class Work05��Լ���� {
public static void main(String[] args) {
	System.out.println("����������������������");
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
	System.out.println("���Լ����"+a[0]);
	System.out.println("��С��������"+Min1.min(ss,sc));
}
}
