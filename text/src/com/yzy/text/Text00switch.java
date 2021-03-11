package com.yzy.text;
	/*
	 * switch 里面传入数值不能为long 型，其他的都可以传入
	 * 
	 * */
import java.util.Scanner;

public class Text00switch {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("输入分数：");
		int score = scan.nextInt();
		if (score<=100) {
			
			int lv = (int) score/10;
			switch (lv) {
			case 10:
			case 9:
				System.out.println("A");
				break;
	        case 8:
	        	System.out.println("B");
				break;  //跳转语句
	        case 7:
	        	System.out.println("C");
		         break;
	        case 6:
	        	System.out.println("D");
				break;
	        case 5:
	        	System.out.println("E");
		         break;

			default:
				System.out.println("挂了");
				break;
			}
		} else {
                  System.out.println("抱歉输入的分数不能超过100");
		}
		
	}

}
