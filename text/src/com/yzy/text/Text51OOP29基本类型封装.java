package com.yzy.text;
/*
 * �������������ͷ�װ
 * ����ģ�
 *int                  Integer
 *char               Character
 *�����������װ���͵�ת��
 *Byte(bytevalue)   ���ֽ����ݹ����ֽڶ���
 *Integer i = new Integer(50);                �����󣩷�װ
 *        //int i = 50;                      ����
 *int a = i.intValue();                                    ��ȡ
 *-----------------------------
 *Character  char Character(char c)     // c�Ƕ��󣬲��Ǳ���
 *public static boolean isDigit(char ch) �жϲ���ch�Ƿ�������
 *public static boolean  isLetter(char ch) �жϲ���ch�Ƿ�����ĸ
 *public static boolean  isLowerCase(char ch)       �Ƿ��д   
 *public static boolean  isUpperCase(char ch)       �Ƿ�Сд
 *public static char  toLowerCase(char ch)   ���ַ�ch  װ����Сд
 *public static char  toUpperCase(char ch)   ���ַ�ch  װ���ɴ�д
 *public static boolean  isSpaceCase(char ch)  �ж��Ƿ�Ϊ�ո�
 * */
public class Text51OOP29�������ͷ�װ {
public static void main(String[] args) {
	int x =5;
	char a[] = {'w','p','o','l','v'};
	Integer t =new Integer(x);
	Boolean b = new Boolean(true);  //��װ
	boolean o = b.booleanValue();   //��ȡ
	System.out.println(o);
	System.out.println(t);
	for (int i = 0; i < a.length; i++) {
		  if (Character.isLowerCase(a[i])) {
			  a[i] =Character.toUpperCase(a[i]);
			
		}else if(Character.isUpperCase(a[i])){
			a[i] = Character.toLowerCase(a[i]);
		}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
