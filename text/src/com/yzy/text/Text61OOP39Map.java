package com.yzy.text;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map ɢ��ӳ�� ��ֵ�� ����ӳ��Ψһ�ؼ��ֵ�ֵ  ͨ���ؼ��ֿ��Լ�����ֵ
 * HashMap()
 * HashMap(Map m)��Map �����Ķ�����뵽ɢ��ӳ����
 *  HashMap(Map a) ����һ������Ϊa��ɢ��ӳ��
 *   HashMap(int a , float b) ����һ������Ϊa������Ϊb��ɢ��ӳ��      b  0.75
 *   put��Ԫ�ؼ��뵽ɢ��ӳ����
 *   Set set = hm.entrySet(); //���ذ���ӳ������ļ���
		Iterator i = set.iterator();  //������   ���ã��õ�hashmap�е���
 * */
public class Text61OOP39Map {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("tom", new Double(3434.34)); //����Ԫ��
		hm.put("jskdj", new Double(1234.34));  //new Double(1234.34)Ϊ����
		hm.put("tosdam", new Double(3486.34)); 
		Set set = hm.entrySet(); //���ذ���ӳ������ļ���
		Iterator i = set.iterator();  //������   ���ã��õ�hashmap�е���
		while (i.hasNext()) {//�鿴�Ƿ�����һ��  ��ʾԪ��
			Map.Entry me = (Map.Entry)i.next();   //����ӳ�䣬ֱ������
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());	
		}
		double balance = ((Double )hm.get("jskdj")).doubleValue();//��tom�е�ֵ����1000
		hm.put("jskdj", new Double(balance + 1000));
		System.out.println("Tom���ʽ���"+hm.get("tom"));
		System.out.println("jskdi���ʽ���"+hm.get("jskdj"));
		
	}        
}
