package com.yzy.work;

import java.util.Scanner;

/*�ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���˶���һ�����ӣ�С���ӳ���������
 * �º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ����ӵ�����
 * */
public class Work03�ŵ����� {
	/*
	 * 1�·� ------------ 1��
	 * 2�·�-------------1��
	 * 3�·�-------------2��
	 * 4�·�-------------3��
	 * 5�·�-------------5��
	 * 6�·�-------------8��
	 * 7�·�-------------13��
	 * ....
	 * */
	public static void main(String[] args) {
		
		System.out.println("�����·�:");
		System.out.println("�鿴---��1-������·ݣ�֮��ÿ�������ӵĶ�����");
		Scanner s = new Scanner(System.in);
		int [] a = new int[s.nextInt()];
		for (int i = 0; i < a.length; i++) {
			if (i==0||i==1) {
				a[i] = 1;
			}else {
				a[i] = a[i-1]+a[i-2];
			}
		}
	for (int i = 0; i< a.length; i++) {
		System.out.println("��"+(i+1)+"�������ӵĶ���:");
		System.out.println(a[i]+"��");
	}
		
		
	}

}
