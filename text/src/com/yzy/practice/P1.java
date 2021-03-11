package com.yzy.practice;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		
	System.out.println("输入电话号：");
		// TODO Auto-generated method stub
       Scanner sca = new Scanner(System.in);
       String ss = sca.next();
       int result = panduan(ss);           //建立一个判断方法
       System.out.println(result);
	}

	private static int panduan(String ss) {
		// TODO Auto-generated method stub
		if (ss.length()!=13) {
			return 1;
		}else if(!ss.substring(0,2).equals(86)){
			return 2 ;
			
		}else  if(ss.matches("[0-9]{13}")){
			return 3;
		}
		return 0;
	}
	
	
}
