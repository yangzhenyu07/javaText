package com.yzy.text;
/*
 * �ڲ��������ڲ��౻��������ĳ�Ա����ˣ��ڲ�������η������Ա�����η����ơ�������
 * ��ζ����ڲ���
 * �������.�ڲ����� ������ = new ���������������.�ڲ���������������
 * 
 * */
class ClassA{
	private int x = 100;

   //InnerA innerA = new InnerA();
   
   public class  InnerA{                                 //�ڲ���
		InnerA(){
			
			x = x+100;
			System.out.println("Hello������");
		}
		void show(){
			System.out.println("x="+x);
		}		
	}
}
public class Text43OOP21�ڲ��� {
public static void main(String[] args) {
	ClassA j =new ClassA();
	ClassA.InnerA   i = new ClassA().new InnerA();  //����һ���������ڲ������
	i.show();
}
}
