package com.yzy.text;
	/*
	 * switch ���洫����ֵ����Ϊlong �ͣ������Ķ����Դ���
	 * 
	 * */
import java.util.Scanner;

public class Text00switch {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���������");
		int score = scan.nextInt();
		if (score<=100) {
			
			int lv = (int) score/10;
			switch (lv) {
			case 10:
			case 9:
				System.out.println("A");
				break;
	        case 8:
	        	System.out.println("B");
				break;  //��ת���
	        case 7:
	        	System.out.println("C");
		         break;
	        case 6:
	        	System.out.println("D");
				break;
	        case 5:
	        	System.out.println("E");
		         break;

			default:
				System.out.println("����");
				break;
			}
		} else {
                  System.out.println("��Ǹ����ķ������ܳ���100");
		}
		
	}

}
