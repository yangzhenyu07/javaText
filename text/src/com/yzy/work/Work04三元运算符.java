package com.yzy.work;

import java.util.Scanner;

/*
 * 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示
 * */
public class Work04三元运算符 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("请输入分数：");
	double i = s.nextDouble();

		if (i>100||i<0) {
			System.out.println("请输入真实有效的分数!!!!");
	
		}else if(i>=90){
			System.out.println("等级：A");
			
		}else{
       
			System.out.println((i>=60)?"等级：B":"等级：C");//三元运算符
			
	
	}
	
	
}
}
