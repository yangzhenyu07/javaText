package com.yzy.work;

/*
 * һԪ���η���
 * * �����ķ�ΧҪ��ס���������п������ⷽ�����
 * %d ��ʾһ������
 * %c ��ʾһ���ַ���
 * if�����������
 * */

import java.util.Scanner;
class Suanfa{                                 //�ֲ�����ֻ�ܴ�ֵ��
	double a;
	double b;
	double c;		
	double x1;
	double x2;
	public  Suanfa(double a, double b, double c) {
		double sum = 0;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void mathsuanfa(){
		double num = -b/(2.0*a);
		double r = Math.sqrt(b*b-4*a*c)/2.0*a;
		x1 = num - r;
		x2 = num + r;
		System.out.println("��Ϊ��"+"x1 = "+x1+"\t"+"x2 = "+ x2);
		
	}
	
}
public class Work01һԪ���� {
	public static void main(String[] args) {
		System.out.println("������һԪ���η��̵�abc��ֵ��");
		Scanner s = new Scanner(System.in);
		
		double d=s.nextDouble();
		double d1 = s.nextDouble();
		double d2 = s.nextDouble();

		 Suanfa t = new Suanfa(d, d1, d2);
		 if ((d1*d1-4*d*d2)>0) {
			t.mathsuanfa();
			
		} else {
               System.out.println("û��ʵ��");
		}		
	}
}
