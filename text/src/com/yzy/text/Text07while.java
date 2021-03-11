package com.yzy.text;
/*
 * 最大公约数
 * 练习break;
 * 强制退出
 * 
 * */
import java.util.Scanner;


public class Text07while {
	public static void main(String[] args) {
		System.out.println("求开始最大公约数：");
		int i ;
		int x ;
		Scanner sc = new Scanner(System.in);
		 i = sc.nextInt();
		 x = i-1;  //控制x比i小
		 while (x>0) {
			 if (i%x == 0) {
				 break;
			
				
			} 
			 x--;
				
		}
		System.out.println(x);
		
	}
	

}
