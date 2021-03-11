package com.yzy.text;
/*
 *求绝对值 
 * */
import java.util.Scanner;

public class Text {
	
		public static void main(String[] args) {
			Scanner scr = new Scanner(System.in);
			int a = scr.nextInt();
			if(a<0){
				a = -a;
				
				
			}
			System.out.println("绝对值为："+a);
		}

	}


