package com.yzy.work;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * ǰ���������Ҫ��
 * 1��LinkedList ��ArrayList ��ʲô��ͬ
 * ArrayList�ǻ��ڶ�̬��������ݽṹ
 * LinkedList �ǻ�����������ݽṹ
 * �����������get��set��ArrayList ������LinkedList
 * ����������ɾ��   LinkeList ������ ArrayList
 * 2��List  Set Map ����
 * List �� Set�й�ͬ�ĸ��� ����ͬ����List���������ͬ��Ԫ�أ�
 * ��Set�ﲻ��������ͬ��Ԫ�أ�map�Ƕ����ĺϼ���������ֵ�����洢���ݣ�
 * �����������ظ��ģ�ֵ�������ظ���
 * 3��ɢ��ӳ��ʵ��ѧ��������Ϣ�Ĵ洢�Ͳ�ѯ
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
		System.out.println("\tѧ�ţ�"+"\t�Ա�"+"\t�༶��");
	    System.out.println("\t  "+stu_id+"\t  "+stu_sex+"   \t"+stu_class);
	}	
}
public class Work14ʵ��ѧ���Ļ�����Ϣ�� {
public static void main(String[] args) {
    
	List map  = new ArrayList();
	System.out.println("������Ļ�����Ϣ��");
	map.add(new Information(1001, "һ��", "��"));
	System.out.println("������Ļ�����Ϣ��");
	map.add( new Information(1002, "һ��", "Ů"));
	System.out.println("�԰�Ȼ�Ļ�����Ϣ��");
	map.add( new Information(1003, "����", "Ů"));
	System.out.println("½���Ļ�����Ϣ��");
	map.add( new Information(1004, "����", "��"));
		
	}
	
}
