package com.yzy.work;

import java.util.Calendar;
import java.util.Scanner;

public class Work15������� {
public static void main(String[] args) {
	System.out.println("����������㣺");
Calendar ca = Calendar.getInstance();  //����������
System.out.println("�����һ�ε�����");
Scanner s = new Scanner(System.in);
ca.set(s.nextInt(), s.nextInt(), s.nextInt());
System.out.print("���һ�����������Ϊ��");
System.out.println(ca.get(Calendar.YEAR)+"��" +ca.get(Calendar.MONTH)+"��"+ca.get(Calendar.DATE)+"��");
Calendar ca1 = Calendar.getInstance();
System.out.println("������ڶ��ε����ڣ�");
Scanner sc = new Scanner(System.in);
ca1.set(sc.nextInt(), sc.nextInt(), sc.nextInt());
System.out.print("��ڶ������������Ϊ��");
System.out.println(ca1.get(Calendar.YEAR)+"��" +ca1.get(Calendar.MONTH)+"��"+ca1.get(Calendar.DATE)+"��");
System.out.println("�������Ϊ��"+getbijiao(ca, ca1)+"��");
}
public static Long getbijiao(Calendar ca,Calendar ca1){
	long i = ca1.getTimeInMillis() - ca.getTimeInMillis();    //.getTimeInMillis()�ó������Ժ���Ϊ��λ��
	long l= i/1000/60/60/24;        //.getTimeInMillis()���壺��1970�굽today�ĺ�����
	// int װ���£�������long��
	return l;
	
}
}
