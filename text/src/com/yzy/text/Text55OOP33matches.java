package com.yzy.text;
/*������ʽ     ����һЩ����������ַ����ַ���
 * \d 0-9 �� \D ������
 *\s  �հ��ַ�    \S �ǿհ��ַ�
 *\w �����ַ�
 *������Ԫ�ַ�  [abc]          abc���κ�һ���ַ�
 *[^abc] ����abc
 *[a-zA-Z]����Ӣ����Сд��ĸ�ʹ�д��ĸ 
 * */
public class Text55OOP33matches {
public static void main(String[] args) {
	String re="\\d{11}";
	String s1 ="15041023915";
	if (s1.matches(re)) {
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}
}
}
