package com.yzy.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2 {
public static void main(String[] args) {
	System.out.println("������һ���ַ���");
      String st = new Scanner(System.in).next(); //����һ���ַ���
      List<Character> list = new ArrayList<Character>();//Character��char�ķ�װ
      for (int i = 0; i < st.length(); i++) {  //�ַ����ĳ���
		list.add(st.charAt(i));
	}
      //�ԱȵĻ������forѭ��
      for (int i = 0; i < list.size(); i++) {
		for (int j = i+1; j < list.size(); j++) {   //**��ĵ�
			if (list.get(i).equals(list.get(j))) {
				list.remove(j);
				i--;
			}
		}
	}
	System.out.println(list);
}
}

