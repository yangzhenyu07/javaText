package com.yzy.text;
/*
 * StringBuffer   �ַ���������
 *1��append(String str)       ����str��׷�ӵ���ǰStringBuffer����ĺ���
 *2��charAt(int index)        ��ȡ��ǰStringBuffer�����ڲ���indexλ���ϵ��ַ�
 *3��SetCharAt(int index,char ch)       ��StringBuffer�����ڲ���indexλ�õ��ַ��滻Ϊch
 *4��insert(int index , String str)    ��StringBuffer�����indexλ���ϲ���str
 *5��reverse()         ����
 *6��delete(int starIndex ,int endIndex)           ɾ����startIndex��ʼ��endIndex - 1λ��֮�������
 *7��replace(int starIndex ,int endIndex,String str )     ��startIndex��endIndex���������ַ���str���滻     
 *������������
 ** */
public class Text19StringBuffer {
public static void main(String[] args) {
	StringBuffer str = new StringBuffer("���й���");
	str.insert(0, "��");                 //����
	str.setCharAt(1, '��');          //�ı�
	str.append(",����");           //׷��
	System.out.println(str);
	str.reverse();                      //����
	System.out.println(str);
	
}
}
