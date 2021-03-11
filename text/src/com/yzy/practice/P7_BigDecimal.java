package com.yzy.practice;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class P7_BigDecimal {

	/**
	* �ṩ��ȷ�ļ�������
	*
	* @param v1
	* @param v2
	* @return
	*/
	public static double subtract(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		return b1.subtract(b2).doubleValue();
	}
	/**
	* �ṩ��ȷ�ĳ˷�����
	*
	* @param v1
	* @param v2
	* @return
	*/
	public static double multiply(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		return b1.multiply(b2).doubleValue();
	}
	/**
	* �ṩ��ȷ�ļӷ�����
	*
	* @param v1
	* @param v2
	* @return
	*/
	public static double add(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		return b1.add(b2).doubleValue();
	}
	
	public static void main(String[] args) {
		//������λС��
		System.out.println("������λС����"+new BigDecimal(0.2351).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		
		//������λС��
		BigDecimal lastValue = new BigDecimal("12");
		BigDecimal pp =  lastValue.add(new BigDecimal("56.567"));
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println("������λС������Ӧλ�����������0��"+df.format(pp.doubleValue()));// 0.20

	}
}
