package com.yzy.practice;

public class P4 {
public static void main(String[] args) {
	char[] v={'1','2','3','4','5','6','7','8','9'};          //String  ���ַ�������
	char a = '1';            // a�Ǳ�����������������
	char b ='c';
	Character ch  =Character.valueOf(a);          //  ���ð�װ�����еľ�̬valueOf���������ַ�aת������Ӧ��װ��Ķ���
	Character ch1 = new Character(b);              //����һ���������һ��Ϊb�Ĳ���
	int x =0;
	Integer it = new Integer(x);
	int y = Integer.valueOf(x);                  //���ð�װ�����еľ�̬valueOf����,���һ������y
	System.out.println(ch.isDigit(a));                  //�Ƿ�Ϊ����
	System.out.println(ch.isLetter(a));               //�Ƿ�ΪӢ����ĸ
	System.out.println(ch1.isUpperCase(b));         //�Ƿ�Ϊ��д
	System.out.println(ch.isLowerCase(b));        //�Ƿ�ΪСд
	System.out.println(ch1.isWhitespace(b));            //�Ƿ�Ϊ�ո񡢻���
 }
}
