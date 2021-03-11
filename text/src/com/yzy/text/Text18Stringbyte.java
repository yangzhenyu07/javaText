package com.yzy.text;
/*
 * 字符串转字节
 * */
public class Text18Stringbyte {
public static void main(String[] args) {
	char c[],b[];
	String s ="中国足球队";
	 c = new char[2];
	 b= s.toCharArray();                     //*****
	 s.getChars(2, 4, c, 0);                   //截取字符串s，从第2位置开始到第4位置，放到数组c里，从c的0位置开始
	 System.out.println(c);
	 System.out.println(b);
	 byte d[]="爱祖国".getBytes();  //将字符串“爱祖国”转换成一个字节数组  
	 System.out.println("获取d的长度："+d.length);
	 String s2 = new String(d,0,2);            //一个 汉字占两个字节    加密时用     
	 System.out.println(s2);                       //所以输出一个“爱”字
}
}
