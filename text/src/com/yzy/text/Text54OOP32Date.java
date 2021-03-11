package com.yzy.text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Date��    ������
 *  Calendar��  ������
 *  getInstance()   ��ʼ��һ�����������
 *  public final void setTime(Date date)     ������ǰ��finalʱ������д�����أ�������Date���ô�����������ʱ��
 *  public final void set(int year,int month,int date,int hourOfDay,int minute); ����������������ʱ��
 *  public SimpleDateFormat(String str)ʹ��ָ���ĸ�ʽ��������  �ö�������format  ������ʽ���¼�����
 * */
public class Text54OOP32Date {
	public static void main(String[] args) {
		
		Date nowTime = new Date();
		Calendar ca = Calendar.getInstance();   //��ʼ��һ�����������
		ca.setTime(nowTime);
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH)+1;//��Ϊ�·��Ǵ�0��ʼ
		int day = ca.get(Calendar.DATE);
		System.out.println("���ڵ�ʱ�䣺"+year+"��"+month+"��"+day+"��");
		//System.out.println(nowTime );
		 SimpleDateFormat f = new SimpleDateFormat("yyyy��mm��dd�� ����ʱ��");      //y��m,d���ܴ�д
		 System.out.println(f.format(nowTime));
	}

}
