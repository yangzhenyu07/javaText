package com.yzy.text;
/*
 *  System.gc();     �������ջ���         ���ڴ���
 *  static                          ����࣬ʵ����ȫ��                       ��ʵ��������������ͨͨ�ĳ�Ա������
 *  static int a                 1����̬��Ա���� 2�������               ��+static ��ʵ���������������
 * */
class Student2{
	
	String stuName;
	String getName(){                                 //���
		
		return stuName;
	}
	void setName(String str){                       //����
		stuName = str;
	}
}
public class Text26OOP04gc {
public static void main(String[] args) {
	Student2 stu1, stu2;
	stu1 = new Student2();
	 stu1.stuName = "������";
	 stu2 = stu1;                                       // stu1��stu2����һ���ڴ�ռ�
	 System.out.println("ѧ����"+stu1.getName());
	 System.out.println("ѧ����"+stu2.getName());
	 stu2.setName("����");
	 System.out.println("ѧ����"+stu1.getName());
	 System.out.println("ѧ����"+stu2.getName());
	 System.out.println(new Student2().getName());        //��������  �������ڴ�ռ䣬������Ϊnull
	 System.gc();          //�������ջ���         ���ڴ���
}
}
