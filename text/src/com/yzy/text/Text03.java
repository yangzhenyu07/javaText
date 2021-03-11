package com.yzy.text;

import java.util.HashSet;
import java.util.Set;

public class Text03 {
	public static void main(String[] args) {
       	Set<Object> set = new HashSet<Object>();
       	System.out.println("1000以内的素数");
		for (int i = 1; i < 1001; i++) {
			for (int j = 2; j < i; j++) {
				if (i%j!=0) {
					set.add(i);					
				}				
			}
			}
		System.out.println(set);
		}
	}


