package com.yzy.text;
/*
 * this() ��ʾ��ǰ��Ĺ��췽��
 * super() ��ʾ��ǰ����Ĺ��췽��
 * ������this����super��������ڹ��췽���� �����ǵ�һ�����
 * super ���ܶ��ʹ�ã�����super.super ���Ǵ��
 * super.method()  ���ø���ķ���-------------------�����˽�в��ܵ���
 * super.var            ���ø���ĳ�Ա����-------------------�����˽�в��ܵ���
 * 
 * 
 * */
class Student10{
	public int stu_no;
	public String stu_name;
	public String zhuanye;
	Student10(){
		System.out.print("����һ��ѧ��");
	}
	Student10(String name){
		this();                                                 //���õ�ǰ��Ŀ������췽��
		System.out.println(":"+name);
	}
	
}

public class Text38OOP16super extends Student10 {
       public String tutor;
       public String spec_direction;
	public Text38OOP16super(String name) {
		super(name);                                     //���ø��������Ĺ��췽��
		System.out.println("������һ��Сѧ��");
	}
	public Text38OOP16super(String name,String tutor, String direction) {
		this(name);                                         //���õ�ǰ����������췽��
		System.out.println("���ǵĵ�ʦ��"+tutor+"�����ǵ�רҵ�ǣ�"+direction);
		
	}
	public static void main(String[] args) {
		Text38OOP16super t = new Text38OOP16super("������");
		Text38OOP16super t1 = new Text38OOP16super("����","����","�����");
	}
	
       
}
