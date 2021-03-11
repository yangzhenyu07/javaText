package com.yzy.text;

import java.util.ArrayList;

/*
 * 集合类
 * Collection接口是构造集合框架的基础  声明所有集合框架类都将集成的核心方法---------------接口
 * boolean add(Obiect obj)将obj调用到类集中
 * boolean addAll(Collection c)将c中所有的对象放入到类集中
 * void clear() 从类集中删除所有元素
 *一、List<E>接口  列表   ----------------抽象类 可以重复
 *      列表元素进行存取的方法  0开始的下标 
 *   1、void add(int index,Obiect obj)将obj添加到列表中，从下标为index位置开始
 *   2、boolean addAll(int index,Collection c)  将c中所有的对象放入到列表中，插入点为index
 *   3、Object get(int index) 返回指定位置下标的对象
 *   4、int indexOf(Object obj)返回列表中对象obj的下标
 *   5、int lastindexOf(Object obj)   返回列表中对象obj最后一次出现的下标
 *   6、Object remove(int index)删除index的位置
 *   7、Object set(int index,Object obj) 给对应下标为index的元素赋值
 *   8、List subList(int start,int end) 从列表中截取（从start开始，end结束）
 *   9、boolean containsAll(Collection c)判断集合类中是否包含c中的所有元素
 *   10、boolean contains(Object obj)判断集合类中是否包含元素obj
 *   (1)、ArrayList 数组列表
 *       构造方法ArrayList ()
 *       ArrayList (Collection c)
 *       ArrayList (int a )建立一个数组列表 该数组指定数组容量
 * */
public class Text58OOP36ArrayList {
	public static void main(String[] args) {
	ArrayList a1 = new ArrayList();                    //ArrayList列表是List的子类
	System.out.println("a1的初始化大小"+a1.size());  //在ArrayList 大小用size()
	a1.add("c");
	a1.add("A");
	a1.add("B");
	a1.add(1, "A2");
	System.out.println("a1加入元素后的大小是"+a1.size());
	System.out.println(a1.toString());
	a1.remove("F");
	a1.remove(2);         //2是index索引位置
	a1.add(1, 1001);
	System.out.println(a1.size());
	System.out.println(a1.toString());
	System.out.println(a1.indexOf("A2"));
    System.out.println(	a1.get(1));

	}

}
