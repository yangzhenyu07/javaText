package com.yzy.text;
/*
 * ��̬����飺
 * ��̬����飺�������ж��������Ա��static���飬�����ж����λ�ÿ���˳��ţ�
 * �������κεķ������أ� jvm������ʱ��ִ����Щ��̬����飬 �����̬������ж����
 * jvm���������������г��ֵ��Ⱥ�˳��ִ�У�ÿ�������ֻ��ִ��һ��
 * */
class Student5{
static{
		
		System.out.println("����һ��ѧ��");
		stuName = "������";
	}

static String stuName;
static String getName(){
	
	return stuName;
}
	
}
public class Text29OOP07static {
	public static void main(String[] args) {
		System.out.println(Student5.getName());      //�����
	}
	
}
