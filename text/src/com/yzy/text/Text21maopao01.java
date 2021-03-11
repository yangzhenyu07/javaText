package com.yzy.text;

import java.util.Arrays;
import java.util.Scanner;

public class Text21maopao01 {
public static void main(String[] args) {	
	System.out.println("Ã°ÅİÅÅĞò»¶Ó­Äã£¡£¡£¡");
	System.out.println("Ê×ÏÈÇëÊäÈë10¸öÊı£º");
	Scanner h = new Scanner(System.in);		
	double []array = new double[10];
	double a;	
	for (int j = 0; j < array.length; j++) {
	         array [j] = h.nextDouble();
	}
	System.out.println("Ã°ÅİÅÅĞò½á¹û£º");

  for (int j = 0; j < array.length-1; j++) {
		for (int j2 = 0; j2 < array.length-j-1; j2++) {
			if (array[j2]>array[j2+1]) {
				 a = array[j2];
				 array[j2] = array[j2+1];
				 array[j2+1] = a;
			}		
		}
	}
	for (int j = 0; j < array.length; j++) {
		System.out.println(array[j]);
	}	
}
}
