package com.yzy.text;

import java.util.LinkedList;

/*
 * LinkedList �����б�
 *  LinkedList()
 *  LinkedList(Collection c)
 *  1��void addFirst(Object obj)���б��ϵ�ͷ������Ԫ��
 *  2��void addLast(Object obj)���б��β������Ԫ��
 *  3��Object getFirst() ��ȡ�б��е�һ��Ԫ��
 *  4��Object getLast() ��ȡ�б������һ��Ԫ��
 *  5��Object removeFirst()  ɾ���б��е�һ��Ԫ��
 *  6��Object removeLast()   ɾ���б������һ��Ԫ��
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
	ll.add(1, "������");
	System.out.println(ll);
	ll.remove("F");
	ll.remove(3);    //3��index
	System.out.println(ll);
}
}
