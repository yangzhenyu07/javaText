package com.yzy.work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*1����дһ������ ���������ַ��� �õ�һ���´� ����� ����concat�� 
 *�������
 *2��ɾ���ַ�����ȫ��������
 *3������ĳ��ĳ��  ��ĳ��ĳ��ĳ�յ��������  ��������
 * */
public class Work10������� {
public static void main(String[] args) {
	
     List<Character> list = new ArrayList<Character>();
	  System.out.println("�������һ����");
	Scanner s = new Scanner(System.in);
	String  g = s.next().toString();
	System.out.println("������ڶ�����");
	Scanner s1 = new Scanner(System.in);
	String gg = s1.next().toString();
	System.out.println("��һ���ӵڶ���Ϊ��");
	String ggg = g.concat(gg);
	for (int j =0  ; j <ggg.length(); j++) {
		list .add(ggg.charAt(j)) ;
	}
		System.out.println(list.toString());
		System.out.println("�������Ϊ��");
		for (int i = ggg.length()-1; i >=0 ; i--) {   //i=ggg.length() ���Զ���һ��
			list.add(ggg.charAt(i));
		}
		System.out.println(list.toString());
	
}
}
