package com.yzy.work;

import java.util.Calendar;
import java.util.Scanner;

public class Work15天数间隔 {
public static void main(String[] args) {
	System.out.println("天数间隔计算：");
Calendar ca = Calendar.getInstance();  //创建日历表、
System.out.println("输入第一次的日期");
Scanner s = new Scanner(System.in);
ca.set(s.nextInt(), s.nextInt(), s.nextInt());
System.out.print("你第一次输入的日期为：");
System.out.println(ca.get(Calendar.YEAR)+"年" +ca.get(Calendar.MONTH)+"月"+ca.get(Calendar.DATE)+"日");
Calendar ca1 = Calendar.getInstance();
System.out.println("请输入第二次的日期：");
Scanner sc = new Scanner(System.in);
ca1.set(sc.nextInt(), sc.nextInt(), sc.nextInt());
System.out.print("你第二次输入的日期为：");
System.out.println(ca1.get(Calendar.YEAR)+"年" +ca1.get(Calendar.MONTH)+"月"+ca1.get(Calendar.DATE)+"日");
System.out.println("间隔天数为："+getbijiao(ca, ca1)+"天");
}
public static Long getbijiao(Calendar ca,Calendar ca1){
	long i = ca1.getTimeInMillis() - ca.getTimeInMillis();    //.getTimeInMillis()得出的数以毫秒为单位的
	long l= i/1000/60/60/24;        //.getTimeInMillis()含义：从1970年到today的毫秒数
	// int 装不下，所以用long型
	return l;
	
}
}
