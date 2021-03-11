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
	//����
	private String name;
	//�Ա�
	private String sex;
	// �༶
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
		Student student1 = new Student("����1", "Ů", "һ��");
        Student student2 = new Student("����2", "Ů", "����");
        Student student3 = new Student("����3", "Ů", "����");
        Student student4 = new Student("����4", "��", "һ��");
        Student student5 = new Student("����5", "��", "һ��");
        Student student6 = new Student("����6", "��", "һ��");
        Student student7 = new Student("����7", "��", "����");
        Student student8 = new Student("����8", "��", "����");
        Student student9 = new Student("����9", "��", "һ��");

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
	        //��Ӳ�������
		    zlData(list);
	        List<List<Student>> groupList = new ArrayList<List<Student>>();
	        list.stream().collect(Collectors.groupingBy(Student::getGrade, Collectors.toList()))
	        .forEach((grade, fooListByAge) -> {
	        	groupList.add(fooListByAge);
	        });
	        groupList.forEach(listVos->{
	        	System.out.println(listVos.get(0).getGrade()+"����:"+listVos.size());
	        	listVos.forEach(vo->{
	        		System.out.println(vo.getName()+"||"+vo.getSex()+"||"+vo.getGrade());
	        	});
	        });

	    }
	}