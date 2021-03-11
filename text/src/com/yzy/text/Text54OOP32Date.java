package com.yzy.text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Date类    日期类
 *  Calendar类  日历类
 *  getInstance()   初始化一个日历类对象
 *  public final void setTime(Date date)     （方法前有final时不能重写和重载）给定的Date设置此日历类对象的时间
 *  public final void set(int year,int month,int date,int hourOfDay,int minute); 设置日历的年月日时分
 *  public SimpleDateFormat(String str)使用指定的格式创建对象  该对象会调用format  方法格式化事件对象
 * */
public class Text54OOP32Date {
	public static void main(String[] args) {
		
		Date nowTime = new Date();
		Calendar ca = Calendar.getInstance();   //初始化一个日历类对象
		ca.setTime(nowTime);
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH)+1;//因为月份是从0开始
		int day = ca.get(Calendar.DATE);
		System.out.println("现在的时间："+year+"年"+month+"月"+day+"日");
		//System.out.println(nowTime );
		 SimpleDateFormat f = new SimpleDateFormat("yyyy年mm月dd日 北京时间");      //y，m,d不能大写
		 System.out.println(f.format(nowTime));
	}

}
