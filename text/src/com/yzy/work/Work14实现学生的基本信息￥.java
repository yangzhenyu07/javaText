package com.yzy.work;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * 前两道题很重要；
 * 1、LinkedList 和ArrayList 有什么不同
 * ArrayList是基于动态数组的数据结构
 * LinkedList 是基于链表的数据结构
 * 对于随机访问get和set，ArrayList 优先于LinkedList
 * 对于新增和删除   LinkeList 优先于 ArrayList
 * 2、List  Set Map 区别
 * List 和 Set有共同的父类 ，不同的是List里可以有相同的元素，
 * 而Set里不可以有相同的元素，map是独立的合集，它靠键值对来存储数据，
 * 键不可以有重复的，值可以有重复的
 * 3、散列映射实现学生基本信息的存储和查询
 * 
 * */
class Information{
	int stu_id;
	String stu_class;
	String  stu_sex;
	public Information(int stu_id, String stu_class, String stu_sex) {
		this.stu_id = stu_id;
		this.stu_class = stu_class;
		this.stu_sex = stu_sex;
		System.out.println("\t学号："+"\t性别："+"\t班级：");
	    System.out.println("\t  "+stu_id+"\t  "+stu_sex+"   \t"+stu_class);
	}	
}
public class Work14实现学生的基本信息￥ {
public static void main(String[] args) {
    
	List map  = new ArrayList();
	System.out.println("杨镇宇的基本信息：");
	map.add(new Information(1001, "一班", "男"));
	System.out.println("陈美宏的基本信息：");
	map.add( new Information(1002, "一班", "女"));
	System.out.println("赵安然的基本信息：");
	map.add( new Information(1003, "二班", "女"));
	System.out.println("陆明的基本信息：");
	map.add( new Information(1004, "二班", "男"));
		
	}
	
}
