package com.yzy.text;
/*
 * ������д��ֻ����������̳и���ķ���ʱ
 * ������д����ķ���ע��
 * 1�����෽�����ܽ��͸���ķ���Ȩ��   ������Ⱥ�����
 * 2�����෽�������׳��ȸ��������쳣
 * 3��������дֻ����������͸���֮��
 * 4�������˽�з������ܱ���д
 * */
class Student9{
	String name;
	static int LengthofSchool = 4; //ѧ��
	static int getLengthofSchool(){                              //��������д
		return LengthofSchool;
	}
	
}
class son01 extends Student9{
	public String tutor;    //��ʦ
    public String spec_direction;  //����	
    static int LengthofSchool = 3;
    static int getLengthofSchool(){                             
		return LengthofSchool;
	}
}
public class Text37OOP15chongxie {
public static void main(String[] args) {
	son01 s =new son01();
	System.out.println("ֱ�ӷ��ʸ����ѧ�ƣ�"+Student9.getLengthofSchool());  //��������д �������������
	System.out.println("ֱ�ӷ��������ѧ�ƣ�"+son01.getLengthofSchool());
	
}
}
