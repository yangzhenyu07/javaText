package com.yzy.text;
/*
 * return����ϰ �� �ӷ����ͳ����з��ص����ĵ�����
 * */
public class Text09return {
public static void main(String[] args) {
	boolean test = true;
	System.out.println("�ұ�ִ����");
	if (test) {
		return;    //����ifѭ��    ���������  ���ұ�ִ���ˡ�
	} else {
       System.out.println("returnִ��֮��");
	}
}
      int   ff(){                //����һ��ff����
    	  int a = 0;
    	  return a;             // ���� int ����
    	  
      }
}
