package com.yzy.text;

import java.math.BigInteger;

/*
 * Math�� ��ѧ
 * abs  ����ֵ
 * max ���ֵ
 * min ��Сֵ
 * random  ����� 0--1
 * pow(double a,double b)����a��b����
 * sqrt  ƽ����
 * log(double a)����a�Ķ���
 * asin ����
 * BigInteger         ������
 * 
 * */
public class Text53OOP31Math {
public static void main(String[] args) {
	int b1 = 1616161616;
	BigInteger b2 = new BigInteger("131313131313131313131");
	BigInteger b3 = new BigInteger("131313131313131313131");
	System.out.println(b2.add(b3));    //�����������.add
	System.out.println(b2.multiply(b3));  //�����������.multiply
	System.out.println(b2.divide(b3));     //�����������.divide
	System.out.println(b2.subtract(b3));  //��������� ��.subtract
	System.out.println(b2.remainder(b3)); //������ȡ����.remainder
}
}
