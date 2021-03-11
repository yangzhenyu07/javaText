package com.yzy.text;

import java.util.LinkedList;

/*
 * LinkedList 链接列表
 *  LinkedList()
 *  LinkedList(Collection c)
 *  1、void addFirst(Object obj)在列表上的头部增加元素
 *  2、void addLast(Object obj)在列表的尾部增加元素
 *  3、Object getFirst() 获取列表中第一个元素
 *  4、Object getLast() 获取列表中最后一个元素
 *  5、Object removeFirst()  删除列表中第一个元素
 *  6、Object removeLast()   删除列表中最后一个元素
 * 
 * */
public class Text59OOP37LinkedList {
   public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	ll.add("F");
	ll.add("B");
	ll.add("D");
	ll.addLast("G");
	ll.addFirst("A");
	ll.add(1, "杨镇宇");
	System.out.println(ll);
	ll.remove("F");
	ll.remove(3);    //3是index
	System.out.println(ll);
}
}
