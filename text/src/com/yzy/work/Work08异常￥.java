package com.yzy.work;

import java.util.Scanner;

/* 
 * 1��java���쳣������ƵĹ���
 * try{Java����}catch���쳣���� ������{�쳣���������}finally{Java����}
 * 2������׳�ϵͳԤ�����쳣  
 *  catch��׽���׳�
 * 3��ʲô����·���ͷ�������������׳����쳣
 *      IOExcetion
 * 4��try ������ж��catch ��Щ�Ӿ���Ⱥ�˳��Գ����ִ��Ч���к�Ӱ��
 *     ûӰ��
 * 5��һ������������һ���쳣  �÷���һ��Ҫ������쳣  ������Ļ���β���
 *     ���г�������ʾ���쳣״̬
 * 6����дһ���Զ�����쳣  ������Ϊ����ʱ  �׳�
 * */
class My extends Exception{
	public My(){
		System.out.println("��������Ϊ��");
	}
}
	
public class Work08�쳣�� {
public static void main(String[] args) throws My {
	Scanner a = new Scanner(System.in);
	double a1 = a.nextDouble();
	Scanner b = new Scanner(System.in);
	double b1 = b.nextDouble();
	if (b1<0) {
		throw new My();
	}else
	{
		System.out.println(a1/b1);
	}
}
}
