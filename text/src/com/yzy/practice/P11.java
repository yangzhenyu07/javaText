package com.yzy.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {

	public Student(String name, String sex, String grade) {
		this.name = name;
		this.sex = sex;
		this.grade = grade;
	}	
	//名称
	private String name;
	//性别
	private String sex;
	// 班级
	private String grade;
	
	public String getName() {
	  return name;
	}	
	public void setName(String name) {
	  this.name = name;
	}	
	public String getSex() {
	  return sex;
	}	
	public void setSex(String sex) {
	  this.sex = sex;
	}	
	public String getGrade() {
	  return grade;
	}	
	public void setGrade(String grade) {
	  this.grade = grade;
	}
}
public class P11 {
	public static void zlData(List<Student> list) {
		Student student1 = new Student("李四1", "女", "一班");
        Student student2 = new Student("李四2", "女", "三班");
        Student student3 = new Student("李四3", "女", "二班");
        Student student4 = new Student("李四4", "男", "一班");
        Student student5 = new Student("李四5", "男", "一班");
        Student student6 = new Student("李四6", "男", "一班");
        Student student7 = new Student("李四7", "男", "三班");
        Student student8 = new Student("李四8", "男", "二班");
        Student student9 = new Student("李四9", "男", "一班");

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);
        list.add(student9);
	}
	public static void main(String[] args) {
		    List<Student> list = new ArrayList<Student>();
	        //添加测试数据
		    zlData(list);
	        List<List<Student>> groupList = new ArrayList<List<Student>>();
	        list.stream().collect(Collectors.groupingBy(Student::getGrade, Collectors.toList()))
	        .forEach((grade, fooListByAge) -> {
	        	groupList.add(fooListByAge);
	        });
	        groupList.forEach(listVos->{
	        	System.out.println(listVos.get(0).getGrade()+"人数:"+listVos.size());
	        	listVos.forEach(vo->{
	        		System.out.println(vo.getName()+"||"+vo.getSex()+"||"+vo.getGrade());
	        	});
	        });

	    }
	}