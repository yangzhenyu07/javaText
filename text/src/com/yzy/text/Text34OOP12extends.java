package com.yzy.text;
/*
 * ��ķ���Ȩ�� Ҫ����public Ҫ����˽��
 * 1���̳�  Ҳ������
 *    ���壺extends
 *    ����������Ĺ�ϵ
 *    ���� is a�����ࡡ�������ࡡhas a ����
 *    ��������е�ĳЩ���Ա�˽�� �����಻�ܼ̳� 
 * */
class Student8{                           //�����Ա�����͸����Ա��������ʱ�������Ա����������
	public int stu_no;
	public String stu_name;
	void setStu_no(int no){                        //��stu_no��ֵ
		stu_no = no;	
	}
	void setstu_Name(String name){            //��stu_name��ֵ
		stu_name = name;
	}
	public String toString(){
		String s;
		s = "ѧ��:"+stu_no+","+"�о���������"+stu_name;
		return s;
	}	
}
class Son extends Student8{
	public String tutor;           //tutor  ��ʦ
	public String sprc_direction;  //sprc_direction �о�����
	void  setTutor(String tu_tor){
		tutor = tu_tor;
	}
	void setSprc_direction(String direction){
		sprc_direction = direction;
	}	
}
public class Text34OOP12extends extends Student8 {
	public static void main(String[] args) {
		Son s = new Son();
		s.setstu_Name("����");            //��ֵ
		s.setStu_no(10011);
		s.setTutor("������");
		s.setSprc_direction("�����");
		System.out.println(s.toString());
		System.out.println(",�о�����"+s.sprc_direction+",��ʦ��"+s.tutor);
	}
}
