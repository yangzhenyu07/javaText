package com.yzy.text;
/*
 * �����
 * ʲô�����ʹ����������෽��
 * 1����������Ĳ�������ֱ�Ӹ���������Ҫ����ʵ������ʱ����ϣ����������ʱ���÷���������Ϊ�෽��
 * 2����������������������ʱ�ɽ��䶨��Ϊ�෽��
 * ���������࣬ʵ����ʵ����         
 * 
 * */
class Student3{
	int stucode;
	static String stuname = "������";             //��static�󣬱������
	Student3(int stucode) {
	   this.stucode = stucode;
	}
	
	
}
public class Text27OOP05 {
	public static void main(String[] args) {
		Student3 stu =new Student3(1001);              //��Ϊ�������������Ĺ��캯�������Դ�������ֻ��������
		System.out.println(stu.stuname);
		Student3.stuname = "������";                       //   �����
		System.out.println(Student3.stuname);         //�����
		System.out.println(stu.stuname);
		System.out.println(stu.stucode);
		
	}

}
