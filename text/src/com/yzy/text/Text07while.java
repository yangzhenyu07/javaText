package com.yzy.text;
/*
 * ���Լ��
 * ��ϰbreak;
 * ǿ���˳�
 * 
 * */
import java.util.Scanner;


public class Text07while {
	public static void main(String[] args) {
		System.out.println("��ʼ���Լ����");
		int i ;
		int x ;
		Scanner sc = new Scanner(System.in);
		 i = sc.nextInt();
		 x = i-1;  //����x��iС
		 while (x>0) {
			 if (i%x == 0) {
				 break;
			
				
			} 
			 x--;
				
		}
		System.out.println(x);
		
	}
	

}
