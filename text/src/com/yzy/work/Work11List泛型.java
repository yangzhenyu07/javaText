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
public class Work11List���� {
public static void main(String[] args) {
	List<Student>list = new ArrayList<Student>();
	Student str = new Student();
	str.setUserName("������");
	str.setUsersex("��");
	str.setUserClass("һ��");
	str.setAge(21);
	Student str1 = new Student();
	str1.setUserName("������");
	str1.setUsersex("Ů");
	str1.setUserClass("����");
	str1.setAge(21);
	Student str2 = new Student();
	str2.setUserName("����");
	str2.setUsersex("Ů");
	str2.setUserClass("һ��");
	str2.setAge(24);
	list.add(str);
	list.add(str1);
	list.add(str2);
	for (int i = 0; i < list.size(); i++) {
		Student st =list.get(i);
		System.out.println("����--"+st.getUserName());
		System.out.println("�Ա�--"+st.getUsersex());
		System.out.println("����--"+st.getAge());
		System.out.println("�༶--"+st.getUserClass());
	}
}
}
