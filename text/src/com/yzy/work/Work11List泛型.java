package com.yzy.work;

import java.util.ArrayList;
import java.util.List;

class Student{
	String userName;
	String usersex;
	int age;
	String userClass;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUsersex() {
		return usersex;
	}
	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUserClass() {
		return userClass;
	}
	public void setUserClass(String userClass) {
		this.userClass = userClass;
	}
	
}
public class Work11List泛型 {
public static void main(String[] args) {
	List<Student>list = new ArrayList<Student>();
	Student str = new Student();
	str.setUserName("杨镇宇");
	str.setUsersex("男");
	str.setUserClass("一班");
	str.setAge(21);
	Student str1 = new Student();
	str1.setUserName("陈美宏");
	str1.setUsersex("女");
	str1.setUserClass("二班");
	str1.setAge(21);
	Student str2 = new Student();
	str2.setUserName("张琪");
	str2.setUsersex("女");
	str2.setUserClass("一班");
	str2.setAge(24);
	list.add(str);
	list.add(str1);
	list.add(str2);
	for (int i = 0; i < list.size(); i++) {
		Student st =list.get(i);
		System.out.println("姓名--"+st.getUserName());
		System.out.println("性别--"+st.getUsersex());
		System.out.println("年龄--"+st.getAge());
		System.out.println("班级--"+st.getUserClass());
	}
}
}
