package com.yzy.text;
/*
 * ����  ��׽����  �򻯲��Ժ͵���
 * ���Ծ���һ����� ��boolean���ʽ���м��
 * 1��assert Exception
 * 2��assert Exception1�� Exception2
 * ������Ϊfalse ����һ��AssertionError ,Exception1������boolean��  �� Exception2���ã��κ��ܲ���ֵ������(�����ַ�����Ϣ)
 * ����֮�� Java ��.class -ea  ���������õ�
 * String getMessage���� ��ȡ�쳣��������Ϣ
 * String toString����   ����������ǰException�����Ϣ�ַ���
 * printStackTrace���� ��ӡ�쳣����õĶ�ջ·��
 * 
 * */
public class Text46OOP24���� {
/*
 * ������覴�
 * */
public static void main(String[] args) {
	//ȱ���������Եĳ���
	int argslength= args.length;
	assert(args.length>0);
	for(String s:args){
		System.out.println(">"+s);
	}
	
}
//�������Եĳ���
static{
	boolean assertEnabled=false;
	assert assertEnabled = true;
	if (!assertEnabled) {
		throw new RuntimeException("���Ա�����");
	}
}
}
