package com.yzy.work;

import java.util.Scanner;

/*
 * ���������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ
 * */
public class Work04��Ԫ����� {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("�����������");
	double i = s.nextDouble();

		if (i>100||i<0) {
			System.out.println("��������ʵ��Ч�ķ���!!!!");
	
		}else if(i>=90){
			System.out.println("�ȼ���A");
			
		}else{
       
			System.out.println((i>=60)?"�ȼ���B":"�ȼ���C");//��Ԫ�����
			
	
	}
	
	
}
}
