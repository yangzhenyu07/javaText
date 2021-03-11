package com.yzy.work;

/*
 * 一元二次方程
 * * 变量的范围要记住，面试题有可能往这方向出题
 * %d 表示一个整数
 * %c 表示一个字符串
 * if算条件运算符
 * */

import java.util.Scanner;
class Suanfa{                                 //局部变量只能传值用
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
		System.out.println("根为："+"x1 = "+x1+"\t"+"x2 = "+ x2);
		
	}
	
}
public class Work01一元二次 {
	public static void main(String[] args) {
		System.out.println("请输入一元二次方程的abc三值：");
		Scanner s = new Scanner(System.in);
		
		double d=s.nextDouble();
		double d1 = s.nextDouble();
		double d2 = s.nextDouble();

		 Suanfa t = new Suanfa(d, d1, d2);
		 if ((d1*d1-4*d*d2)>0) {
			t.mathsuanfa();
			
		} else {
               System.out.println("没有实根");
		}		
	}
}
