package com.yzy.work;

import java.awt.Checkbox;
import java.util.Scanner;

public class Work09���Ĵ� {
public static void main(String[] args) {
	String str = null;
	System.out.println("�ж��Ƿ�Ϊ���Ĵ�");
	System.out.println("�����ַ�����");
	Scanner sca = new Scanner(System.in);
	str= sca.nextLine();       //������ģʽ����
	if (isPailddrome(str)) {
		System.out.println("�ǻ��Ĵ�");
	}else{
		System.out.println("���ǻ��Ĵ�");
	}
}

private static boolean isPailddrome(String check) {
	int low =0;
	int high = check.length()-1;
	while(low<high){
		if (check.charAt(low)!=check.charAt(high)) 
			return false;
			low++;         //ͷ��
		    high--;          //β��
	}
	return true;

}
}

