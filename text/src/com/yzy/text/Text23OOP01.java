package com.yzy.text;
/*
 * ������
 * ����ֵ����  ������ �������б� {
 * ������
 * }
 * �������ȴ���������
 * ���췽�� ��Ĺ�����
 * 1������������ͬ
 * 2�����췽���޷���ֵ
 * 3�����췽����Ҫ���ã�������ʵ�л�������Ĵ�������ʼ������
 * 4�����췽��ֻ��ͨ��new�����������  ����ͨ�����������
 * 5��һ������Զ��������췽�������ݴ��ݸ����췽���Ĳ�����Ŀ������ ϵͳ�Զ���ѡ��
 * 6�����ã�Ϊÿ���½��Ķ��󸳳�ʼֵ
 * ��������
 * 1����������    2���������󲢳�ʼ��
 * ���� ������ = new ��Ĺ��췽��������
 * */
public class Text23OOP01 {
int stu_code;
String stu_name;                                               //��Ա������ʼ��һ��ûֵ��һ�㿿��������ֵ
String deptName;


int getStudentcode(){                                          //����һ������
	
	return  stu_code;
			
}
boolean  setStudentcode(int studentcode){           //int studentcode  ����ľֲ�����
	if (studentcode >0) {
		stu_code = studentcode;
		return true;
		
	}else{
		return false;
		
	}
}
}
