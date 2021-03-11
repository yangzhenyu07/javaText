package com.yzy.text;
/*
 * StringBuffer   字符串缓冲类
 *1、append(String str)       将‘str’追加到当前StringBuffer对象的后面
 *2、charAt(int index)        获取当前StringBuffer对象在参数index位置上的字符
 *3、SetCharAt(int index,char ch)       将StringBuffer对象在参数index位置的字符替换为ch
 *4、insert(int index , String str)    从StringBuffer对象的index位置上插入str
 *5、reverse()         倒置
 *6、delete(int starIndex ,int endIndex)           删除从startIndex开始到endIndex - 1位置之间的内容
 *7、replace(int starIndex ,int endIndex,String str )     从startIndex到endIndex的内容由字符串str来替换     
 *。。。。。。
 ** */
public class Text19StringBuffer {
public static void main(String[] args) {
	StringBuffer str = new StringBuffer("爱中国人");
	str.insert(0, "我");                 //插入
	str.setCharAt(1, '是');          //改变
	str.append(",万岁");           //追加
	System.out.println(str);
	str.reverse();                      //倒置
	System.out.println(str);
	
}
}
