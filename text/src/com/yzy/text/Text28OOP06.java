package com.yzy.text;
/*
 * ����Ҳ������Ϊ������ַ����ַ�������ݣ���Ϊ����Ҳ�Ǳ���
 * */
class Student4{
 static int stucode;  

public Student4(int stucode) {                   //���췽��

	this.stucode = stucode;
}
static int getstucode(){                            //����
	
	return stucode;
}
	
}
public class Text28OOP06 {
	public static void main(String[] args) {
	Student4 s = new Student4(1001);                 //���ù��췽������ֵ
    System.out.println(Student4.getstucode());  //�����        �ù��췽����ֵ��֮���÷�������������ֵ
	}

}
