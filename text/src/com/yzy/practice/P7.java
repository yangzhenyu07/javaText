package com.yzy.practice;
/*
 * һ��static�ķ����ﲻ���Է���Է�static�����ĵ���
 * ��Ϊ��static�ķ���Ҫ�������������ʹ�ã����Ե��÷�static����ʱҪ��������
 * ��static��������ʱ����Ҫ�������󣬿���ֱ�ӵ��á�Ҳ����˵��static�������õ�ʱ��
 * �����п��ܻ�û�д��������÷�static�����߼���ͬ
 * */

public class P7 {
	public void hello(){
		System.out.println("hello  ");
		this.hello1();	
	}
	public void hello1(){
		System.out.println("world!!!");	
	}
	public static void yzy(){
		System.out.println("yzy");	
	}
	public static void main(String[] args) {
		P7 p = new P7();
		yzy();
		p.hello();	
	}
}
