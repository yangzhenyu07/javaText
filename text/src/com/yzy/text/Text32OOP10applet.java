package com.yzy.text;
/*
 * this���ܳ������෽���У�this��ʾʵ������Ϊ�෽��ֱ���ܹ�ͨ���������ã�
 * applet С���򹤾����      ����������������Eclipse�ﲻ��ִ��
 * -----------------------------------------------------------------------------------------------------
 * 1��java.lang      ��Java�����ĺ������ �������������ͣ��̡߳����������ᱻ�Զ����أ�
 * 2��java.util        ����������  vector ������  ������ ʱ���� ��ջ�� ��������
 * 3��java.io          ��������� �ṩ�˼�����д洢���ļ����еĲ���   File�ࣨ�����ļ�.exe��
 * 4��java.net        ʵ�����繤��
 * 5��java.sql         �����ݿ�Ĳ���
 * 6��java.math     ������ѧ��   Math
 * 
 * */
class TextB{
	int x;
	void function(){
		this.x = 100;   //ֱ�ӵ�������ĳ�Ա����
		
 	}
	 int function01(){
         this.function();		  //��������ķ���
		return x;
	}
	
}
public class Text32OOP10applet {
	public static void main(String[] args) {
		TextB y= new TextB();
		System.out.println(y.function01());
	}

}