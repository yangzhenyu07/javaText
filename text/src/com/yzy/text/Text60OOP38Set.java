package com.yzy.text;

import java.util.HashSet;

/*
 * Set 散列表             ----------------------抽象类
 * 散列码 在散列中 一个关键字的信息内容被用来被确定是唯一的值  下标
 * Set<E>
 * HashSet 哈希表  顺序不固定
 * HashSet()
 * HashSet(collection c) 将Clloection 创建的对象放入到散列表中
 * HashSet(int a) 创建一个容量为a的散列集合
 * HashSet(int a , float b) 创建一个容量为a 填充比为b的散列集合  b的含义大概为0.75填充4分之3
 * 散列集合的元素是无顺序的，所以每次的输出可能都不一样
 * */
public class Text60OOP38Set {
public static void main(String[] args) {
    HashSet hs =  new HashSet();
    hs.add("B");
    hs.add("A");
    hs.add("C");
    hs.add("D");
    System.out.println(hs);  //输出无顺序
}
}
