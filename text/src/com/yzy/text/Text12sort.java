package com.yzy.text;
/*
 * ����
 * ��sort����
 * ȥ��һ����߷�һ����ͷ���ƽ��
 * 
 * */

import java.util.Arrays;
import java.util.Scanner;

public class Text12sort {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double score[] = new double [10];
	double sum = 0 ;   //�ܺ�
	for (int i = 0; i < score.length; i++) {
		System.out.println("���"+(i+1)+"λ��ί���");
		score[i] = sc.nextDouble();                        //ֵ����������
	}
	Arrays.sort(score);                       //��������   sort������Ϊ�˸����������������
	System.out.println("ȥ��һ����߷�"+score[9]);
	System.out.println("ȥ��һ����ͷ�"+score[0]);
	for (int i = 1; i < score.length-1; i++) {
		    sum=sum+score[i];
	}
	System.out.println("��ѡ������ƽ����"+sum/8);
	
	
	
}
}
