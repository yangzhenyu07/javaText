package com.yzy.text;

import java.util.ArrayList;

/*
 * ������
 * Collection�ӿ��ǹ��켯�Ͽ�ܵĻ���  �������м��Ͽ���඼�����ɵĺ��ķ���---------------�ӿ�
 * boolean add(Obiect obj)��obj���õ��༯��
 * boolean addAll(Collection c)��c�����еĶ�����뵽�༯��
 * void clear() ���༯��ɾ������Ԫ��
 *һ��List<E>�ӿ�  �б�   ----------------������ �����ظ�
 *      �б�Ԫ�ؽ��д�ȡ�ķ���  0��ʼ���±� 
 *   1��void add(int index,Obiect obj)��obj��ӵ��б��У����±�Ϊindexλ�ÿ�ʼ
 *   2��boolean addAll(int index,Collection c)  ��c�����еĶ�����뵽�б��У������Ϊindex
 *   3��Object get(int index) ����ָ��λ���±�Ķ���
 *   4��int indexOf(Object obj)�����б��ж���obj���±�
 *   5��int lastindexOf(Object obj)   �����б��ж���obj���һ�γ��ֵ��±�
 *   6��Object remove(int index)ɾ��index��λ��
 *   7��Object set(int index,Object obj) ����Ӧ�±�Ϊindex��Ԫ�ظ�ֵ
 *   8��List subList(int start,int end) ���б��н�ȡ����start��ʼ��end������
 *   9��boolean containsAll(Collection c)�жϼ��������Ƿ����c�е�����Ԫ��
 *   10��boolean contains(Object obj)�жϼ��������Ƿ����Ԫ��obj
 *   (1)��ArrayList �����б�
 *       ���췽��ArrayList ()
 *       ArrayList (Collection c)
 *       ArrayList (int a )����һ�������б� ������ָ����������
 * */
public class Text58OOP36ArrayList {
	public static void main(String[] args) {
	ArrayList a1 = new ArrayList();                    //ArrayList�б���List������
	System.out.println("a1�ĳ�ʼ����С"+a1.size());  //��ArrayList ��С��size()
	a1.add("c");
	a1.add("A");
	a1.add("B");
	a1.add(1, "A2");
	System.out.println("a1����Ԫ�غ�Ĵ�С��"+a1.size());
	System.out.println(a1.toString());
	a1.remove("F");
	a1.remove(2);         //2��index����λ��
	a1.add(1, 1001);
	System.out.println(a1.size());
	System.out.println(a1.toString());
	System.out.println(a1.indexOf("A2"));
    System.out.println(	a1.get(1));

	}

}
