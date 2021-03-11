package com.yzy.practice;

public class P10 {

	public static void main(String[] args) {
	   String msg = "#EB##M##U#PUMLT#DF";
	   String [] datas = new String[10]; 
	   int index = 0;
	   for (int i = 0; i < msg.length(); i++) {
		   int j = i+3;
		   datas[index] = msg.substring(i, j);
           i = j-1;
           index++;
	   }
	   for (int i = 0; i < datas.length; i++) {
		System.out.println(datas[i]);
	}
	}
}
