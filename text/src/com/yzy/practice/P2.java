package com.yzy.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2 {
public static void main(String[] args) {
	System.out.println("请输入一条字符串");
      String st = new Scanner(System.in).next(); //输入一条字符串
      List<Character> list = new ArrayList<Character>();//Character是char的封装
      for (int i = 0; i < st.length(); i++) {  //字符串的长度
		list.add(st.charAt(i));
	}
      //对比的话最好用for循环
      for (int i = 0; i < list.size(); i++) {
		for (int j = i+1; j < list.size(); j++) {   //**错的点
			if (list.get(i).equals(list.get(j))) {
				list.remove(j);
				i--;
			}
		}
	}
	System.out.println(list);
}
}

