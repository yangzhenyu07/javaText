package com.yzy.text;
/*
 * regionMatches( toffset, other, ooffset, len) �÷�
 * */
public class Text14regionMatches {
public static void main(String[] args) {
	/*
	 * String st = "456778";
	int ss = Integer.parseInt(st);   //ǿ��ת��int����
	System.out.println(st);
	 */
	int num =0;
	byte buffer[] = new byte[50];
	String input = "this is a apple";
	for (int i = 0; i < input.length(); i++) {
		if (input.regionMatches(i, "is", 0, 2)) {          //����ѭ��ʱ�Ƚ϶�
			num++;                                                //����ֵĸ���
		}
	}
	/*regionMatches( toffset, other, ooffset, len)
	 *�ӵ�ǰ�ַ���  toffset  ��ʼ��ȡ����Ϊlen ���Ӵ���
	 *��������Ӵ��Ͳ��� other ָ�����Ӵ����жԱȣ�
	 *other�Ӵ��Ǵ�ooffsetָ����λ�ÿ�ʼ
	 * */
	System.out.println("is�ĸ���Ϊ��"+num);
}
}
